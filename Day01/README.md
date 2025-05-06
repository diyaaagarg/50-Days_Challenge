# Day 01 - Problem 206-> Reverse Linked List:
 Reverse a Singly Linked List
✅ Problem Statement
Given the head of a singly linked list, reverse the list and return the new head.

**Problem Link**: https://leetcode.com/problems/reverse-linked-list/description/

## 💡Approach
We use an iterative method with three pointers to reverse the direction of the list in-place:

1.Initialize Pointers:

->prev to null (this will become the new tail).

->current to head.

2.Traverse the List:

->For each node:

->Save the next node: nextnode = current.next

->Reverse the current node’s pointer: current.next = prev

->Move prev and current one step forward.

3.Return:

->After the loop, prev will point to the new head of the reversed list.


## ⏱️ Time and Space Complexity
Time: O(n)
Space: O(1)

