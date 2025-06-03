# Day 23
PROBLEM 32. Longest Valid Parentheses

✅ Problem Statement:-
Given a string s consisting of only '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

**Problem Link**: https://leetcode.com/problems/longest-valid-parentheses/description/

## 💡Approach
1.Initialize a stack and push -1 to handle base cases.
2.Iterate through the string:
->If the current character is '(', push its index onto the stack.
->If it's ')', pop the top of the stack.
  ->If the stack becomes empty, push the current index as a new base.
  ->Otherwise, compute the length of the current valid substring using i - stack.peek() and update max_length.
3.Return max_length.

## ⏱️ Time and Space Complexity
Time: O(n)
Space: O(n)
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 35. Search Insert Position

**Problem Link** : https://leetcode.com/problems/search-insert-position/description/

## 💡Approach
1.Initialize low = 0, high = nums.length - 1
2.While low <= high:
->Find mid = low + (high - low) / 2
->If nums[mid] == target, return mid
->If nums[mid] < target, search right: low = mid + 1
->If nums[mid] > target, search left: high = mid - 1
3.If not found, low will be the correct insertion position
   

## ⏱️ Time and Space Complexity
TIME:O(log n)->binary search.
SPACE:O(1)->no extra space used.

