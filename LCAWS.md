Given a dictionary of words. How will you perform the transformation of one word to another changing one letter at a time?

Asked about strings question source and destination

He asked about the toughest problem I encountered and explain it

HashMap - will it always have O(1) access time?

Build a graph and find the shortest path between two different nodes

write a findMatch method for online game where two players are set to play game. If player X comes online then he needs to be matched with player whose existing rank is closest possible to that of Player X. This had to be efficient algorithm and scale to millions of users

What would an API look like for the interactions between a plane and air traffic control. 

OO design: Black Jack Game. System design: Amazon video subscription.  

Given different time periods during which tasks were running  find the time at which maximum tasks are running. 

Given a String find out if it contains ONLY all strings from another string .
 E.g input str  - FeeO & another String - { "Fe", "e","O"} 
 Hint : Use DFS to solve this
 
  Design Amazon address manager app 
  
  Write a program to check whether it is a valid binary tree or not.
  
Design a kind of kindle fire application where we can subscribe news channel and read the news from all publishers as a digital format.  

Design a b tree

Design a data model and API for playing Chutes & Ladders.  

How to merge 2 binary search tree in O(n)  

parking lot design

replace each element in an array with the product of all the other elements

Logic to show top ranked products

Evaluation of an Expression using bfs or dfs  

design a system for hospital check ins  

1. Amazon Locker
2. Jump Game
3. Design a voting system
4. Design a fake filter system  

2. BST to Double link list
3. Sum of two link list integer  

Create a phonebook with ability to search all the names with "G" and also with "Gorge".

Create a file structure to filter files of some size and having some name?

Design media rental system which rents out CDs? How would you scale and how would you handle inventory?  

Given a string. Suppose all its characters can be jumbled up and all possible strings are arranged in an alphabetical order. Now given a number n, find the nth word in the ordered list of words.

How do you split a string into meaning ful words? ex: icandoit -&gt; i can do it 

(A1) Design a single machine, single user system for hotel table reservations.
Constraints: assume 16 tables with capacity 4, 16 tables with capacity 8. Can book for just 1 hr. Max 2 months in advance.
Which classes, which data-stuctures?
(A2) What happens when a party of 16 requests for a table. You can join tables which are next to each other. Implement this.

------

(B1) Design a deck of cards.
(B2) Now assume 10 million users are using this card deck.

-------

(C1) Given a binary tree, print all the leaf nodes.
(C2) Now, print all the left most nodes, and all right most nodes ( assume there is a triangle around the binary tree, so all nodes which falls on that triangle , print them in clockwise ordering).

------

(D1) Given an array which contains series of 0s and series of 1s, find the index where 1s start.
How would you test this method?
(D2) Assume input array has infinite length, how will you find the index in O(logn) time?

----------
Answers:

A1. Array of size 32. Each element in the array contains linkedList sorted by startTime where each link represents timeslot that is already booked/reserved.

A2. Get a list of tables which are available in the requested time period, check if there is a contiguous set of tables which total up to 16 and then reserve those tables.

B1. Deck class. Card class. Suit enum. Value Enum. Card contains Value and Suit enums. Deck contains an array of 52 cards. Constructor of Deck initializes 52 card class.
Card should expose comparable interface.
Deck should expose Shuffle and iterator interface.
Some considerations: Should Deck be singleton? Should Deck be made generic to accept different types of cards? Should Desk be made threadsafe?

B2. If there are 10 million users on the same machine using 10 million Decks, then we don't really need 520 million cards.
Each Card instance is immutable. So we just need 52 card instances which are shared between 10 million Decks.

C1: Leaf nodes: Preorder traversal limited to leaves.
C2: Left side: Preorder traversal limited to nodes which matches certain criteria.
    Right side: Only visit those nodes that meet certain criteria - Post Order traversal.

D1: binary search O(logN)
     Testcases: null array, empty array, array with just one element - 0, array with just one element - 1.
           array with only 0s. array with only 1s. 5 element array with 2 0s and 3 1s, array with numbers other then 0 and 1.

D2: 2 step process: (i) Find the block in which transition from 0 to 1 happens. (ii)Then find the exact index within that block.
For #i, consider first block with size K, if no transition in this block, then check next block with size 2K, then 4K, then 8K. Once we find the block with transition then step#ii is simple binary search.  


Design an event ticket system? Reinvent Ticketmaster.  

1. clone graph
2. design architecture of open table  

Write code for a simple implementation of a hash map.  

How would you design and represent a Unix file system in code.  

Given a tree representation how would you print a particular sequence of values within the tree.

Choose between chess and candy crush and show what objects you would use to build the game.

Implement the functions bool Add(), bool Remove(), and bool Contains() for a hash set of integers. (Then some questions followed about how to determine when to add more buckets)  

Design (and draw an infrastructure diagram for) a system in which speed detection cameras upload snapshots for each vehicle (with a license plate ID, timestamp, and location included) and the system is queried to return all the speeders for a given location and date range. No implementation required.  

constructing a sorted hashtable class.  

design system for implementing waitlist for items on Aamzon.  


(https://www.glassdoor.com/Interview/Given-two-parameters-the-first-parameter-being-a-string-of-words-with-no-spaces-the-second-being-a-dictionary-with-all-th-QTN_1276437.htm)
