# Day 28
PROBLEM 111. Minimum Depth of Binary Tree
✅ Problem Statement:-
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

**Problem Link**: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

//DO LATER
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 2470. Number of Subarrays With LCM Equal to K

**Problem Link** : https://leetcode.com/problems/number-of-subarrays-with-lcm-equal-to-k/description/

## 💡Approach
Brute-force with Optimization
1.Iterate over all possible subarrays starting from each index i.
2.For each starting index i, maintain the current LCM (l) of the subarray as you extend it with subsequent elements.
3.If at any point l == k, increment the count.
4.If l > k, break early as adding more elements will not reduce the LCM.
5.Also check for nums[i] == k as a single-element subarray.

   
## ⏱️ Time and Space Complexity
TIME:
Worst-case: O(n^2 * logM)
Outer loop runs n times.
Inner loop also runs up to n times.
Each LCM calculation involves a GCD, which takes O(logM) where M is the maximum element in nums.
So the overall time complexity is:
O(n² * logM)

SPACE:O(1)->no extra space used.

