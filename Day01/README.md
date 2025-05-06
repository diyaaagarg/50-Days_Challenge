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

------------------------------------------------------------------------------------------

# Problem-> 268. Missing Number
 Approach: XOR Method
🔸
XOR of a number with itself is 0 → a ^ a = 0

XOR of a number with 0 is the number itself → a ^ 0 = a

XOR is both commutative and associative

If we XOR all the numbers from 0 to n and XOR them again with all elements in the array, all the matching elements will cancel out, and the remaining result will be the missing number.

## ⏱️ Time and Space Complexity
TIME:O(n)
SPACE:O(1)

