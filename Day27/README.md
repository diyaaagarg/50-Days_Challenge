# Day 27
PROBLEM 112. Path Sum
✅ Problem Statement:-
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
A leaf is a node with no children.

**Problem Link**: https://leetcode.com/problems/path-sum/description/

//DO LATER
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 53. Maximum Subarray

**Problem Link** : https://leetcode.com/problems/maximum-subarray/description/

## 💡Approach
1.Initialize two variables:
->sum to store the current subarray sum.
->ans to store the maximum subarray sum found so far.

2.Traverse the array:
->Add the current element to sum.
->Update ans with the maximum of ans and sum.
->If sum becomes negative, reset it to 0 as it won't contribute positively to any future subarray.

3.Return ans as the result.
   
## ⏱️ Time and Space Complexity
TIME:O(n)
SPACE:O(1)->no extra space used.

