# Day 02 - Problem 876-> Middle of the Linked List
Find middle node in singly linked list 
✅ Problem Statement:-
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

**Problem Link**:https://leetcode.com/problems/middle-of-the-linked-list/

## 💡Approach
Approach:Two-Pointer (Fast and Slow Pointer)
We use two pointers, slow and fast, initialized at the head of the list:
->The slow pointer moves one step at a time.
->The fast pointer moves two steps at a time.

When fast reaches the end of the list, slow will be at the middle.
This method naturally handles both even and odd-length lists.


## ⏱️ Time and Space Complexity
Time: O(n)->The list is traversed once, where n is the number of nodes.
Space: O(1)-> Only constant extra space is used.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 258.Add Digits
Problem Statement:-
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

**Problem Link**: https://leetcode.com/problems/add-digits/

## 💡Approach
Approach : Mathematical Trick (Digital Root)
This problem can be solved in constant time using the digital root concept from number theory.
For base 10, the digital root of a non-zero number is:
Digital Root=1+(𝑛𝑢𝑚−1) mod 9
For num = 0, the result is 0.

## ⏱️ Time and Space Complexity
TIME:O(1)
SPACE:O(1)

