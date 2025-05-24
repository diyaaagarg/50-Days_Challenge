# Day 16
// PROBLEM 237-> Delete Node in a Linked List
✅ Problem Statement:-
You are given a node in a singly-linked list, which is not the tail, and you need to delete it from the list. You are not given access to the head of the list.

**Problem Link**: https://leetcode.com/problems/delete-node-in-a-linked-list/description/

## 💡Approach
1.Copy the value from node.next to node.
2.Set node.next to node.next.next.
This simulates the deletion of the current node.


## ⏱️ Time and Space Complexity
Time: O(1)->Constant time
Space: O(1)->constant space.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 633. Sum of Square Numbers

**Problem Link** :https://leetcode.com/problems/sum-of-square-numbers/description/
## 💡Approach
1.Use two pointers:
->left starting at 0
->right starting at √c
2.While left <= right, compute the sum of their squares.
3.If the sum equals c, return true.
4.If the sum is less than c, increment left.
5.If the sum is greater than c, decrement right.
6.If no such pair is found, return false.

## ⏱️ Time and Space Complexity
TIME:O(root c).
SPACE:O(1).
