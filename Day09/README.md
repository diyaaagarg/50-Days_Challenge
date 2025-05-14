# Day 09 
//PROBLEM 1721-> Swapping Nodes in a Linked List

✅ Problem Statement:-
You are given the head of a linked list, and an integer k.Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (1-indexed).

**Problem Link**: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

## 💡Approach
1.Use two pointers: fast and slow, both starting at the head.
2.Move the fast pointer k-1 steps ahead to reach the kth node from the start (first node).
3.Start moving both fast and slow pointers together until fast reaches the last node.
->At this point, slow will be at the kth node from the end (second node).
4.Swap the values of the first and second nodes.
5.Return the modified linked list.

## ⏱️ Time and Space Complexity
Time: O(n)->where n is the number of nodes in the linked list.
Space: O(1)->constant space.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 400. Nth Digit

**Problem Link**: https://leetcode.com/problems/nth-digit/description/


## 💡Approach
1.Find the length of the digit block where the nth digit lies.
->Subtract blocks of digits until n fits.
2.Determine the actual number that contains the digit.
->Compute the starting number of the block: start = 10^(digitLength - 1)
->Find the exact number: number = start + (n - 1) / digitLength
3.Extract the digit from that number.
->Convert the number to string and return the required digit.

## ⏱️ Time and Space Complexity
TIME:O(log n)-> Because we keep dividing n over increasing digit lengths.
SPACE:O(1)->as no additional space is used apart from variables.
