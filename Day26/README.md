# Day 26
PROBLEM 94. Binary Tree Inorder Traversal

✅ Problem Statement:-
Given the root of a binary tree, return the inorder traversal of its nodes' values.

**Problem Link**: https://leetcode.com/problems/binary-tree-inorder-traversal/description/

//DO LATER
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 34. Find First and Last Position of Element in Sorted Array

**Problem Link** :https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

## 💡Approach
1.Binary Search for First Occurrence:
->Use binary search to find the leftmost (first) index where nums[mid] == target.
->If found, move high = mid - 1 to search further left.

2.Binary Search for Last Occurrence:
->Use binary search again to find the rightmost (last) index.
->If found, move low = mid + 1 to search further right.

3.Store both results in ans[0] and ans[1].
   
## ⏱️ Time and Space Complexity
TIME:O(logn)
SPACE:O(1)->no extra space used.

