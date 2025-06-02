# Day 22
PROBLEM 1249. Minimum Remove to Make Valid Parentheses

✅ Problem Statement:-
Given a string s of '(', ')', and lowercase English characters, remove the minimum number of parentheses so that the resulting string is valid.
A string is valid if:
->Every '(' has a corresponding ')'.
->Every ')' has a corresponding '('.
Parentheses are closed in the correct order.
Return any valid string that can be obtained after the removal.

**Problem Link**: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/

## 💡Approach
First Pass (Left to Right):
->Build a temporary string skipping extra ')'.
->Track unmatched '(' using a counter (openCount).

Second Pass (Right to Left):
->Remove unmatched '(' by iterating the temporary result in reverse.
->Use a second counter (closeCount) to keep track of unmatched ')'.

Reverse the final result to return it in correct order.

## ⏱️ Time and Space Complexity
Time: O(n)
Space: O(n)
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 169. Majority Element

**Problem Link** : https://leetcode.com/problems/majority-element/description/

## 💡Approach
When the array is sorted, the majority element will always appear at the middle index (i.e., n/2), since it appears more than half the time.    

## ⏱️ Time and Space Complexity
TIME:O(nlog n)
SPACE:O(1)

