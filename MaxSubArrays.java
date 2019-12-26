package apple;

import java.util.HashMap;

/*
 * 
 * 1. Max sub array having sum k ..... Solution using hashmap
 * 2. Max sub array having sum >= k....Sliding window approach..having left initlizat to zero..
 * 3. Max sub array [ longest ] sum
 * 4. Max/Min sub array having size k
 */
public class MaxSubArrays {
	public static void main(String args[]) {
		
		// Example 1, having ans = 3 i.e [-3,6,7]
		int[] array=new int[] {-5,2,4,-3,6,7};
		int k=10;
		System.out.print("Maximum sub array having sum k"+ms_havingSumk(array,k));
		
		int[] array1=new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("\nMaximum sub array having longest sum"+ms_havingLongestSum(array1));
		
		// answer is 39  = of sub array [ 4,2,10,23 ]
		int[] array2=new int[] {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int ksize=4;
		
		System.out.println("\nMaximum sum with given window size k "+ms_havingSubArrayOfSizeK(array2,ksize));
		
	}
	
	// 1. Max sub array having sum k
	private static int ms_havingSumk(int[] nums,int k) {
		
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		
		int sum=0;
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			
			if(sum==k) {
				ans = i+1;
			}
			if(!hmap.containsKey(sum)) {
				hmap.put(sum,i);
			}
			
			if(hmap.containsKey(sum-k)) {
				int index = hmap.get(sum-k);
				ans = ans < (i-index) ? i-index : ans;
			}
		}
		return ans != Integer.MIN_VALUE ? ans : 0;
	}
	
	// 3. 
	private static int ms_havingLongestSum(int[] nums) {
		
		int maxSum = 0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i-1]>0) {
				nums[i] += nums[i-1];
			}
			maxSum = Math.max(maxSum,nums[i]);
		}
		return maxSum;
	}
	
	/*
	 * An Efficient Solution is based on the fact that sum of a subarray (or window) of size k can be obtained in O(1) 
	 * time using sum of previous subarray (or window) of size k. Except first subarray of size k, for other subarrays, 
	 * we compute sum by removing first element of last window and adding last element of current window.
	 */
	private static int ms_havingSubArrayOfSizeK(int[] nums,int k) {
		
		int n=nums.length;
		if(n<k) {
			return 1;
		}
		
		int res=0;
		for(int i=0;i<k;i++) {
			res+=nums[i];
		}
		
		int cur_sum=res;
		for(int i=k;i<n;i++) {
			cur_sum += nums[i] - nums[i-k];
			res = Math.max(res,cur_sum);
		}
		return res;
	}
}
