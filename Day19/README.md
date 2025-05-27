# Day 19
// PROBLEM 20. Valid Parentheses
✅ Problem Statement:-
Given a string s containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid.
A string is considered valid if:
->Open brackets must be closed by the same type of brackets.
->Open brackets must be closed in the correct order.
->Every closing bracket has a corresponding open bracket of the same type.

**Problem Link**: https://leetcode.com/problems/valid-parentheses/

## 💡Approach
Initialize a stack to hold characters.
Iterate through each character in the string:
->If it is an opening bracket ((, {, [), push the corresponding closing bracket (), }, ]) onto the stack.
->If it is a closing bracket, check if the stack is empty (no matching opening bracket) or if the top element does not match the current character. If either is true, return false.
After processing all characters, return true only if the stack is empty (all brackets matched properly).

## ⏱️ Time and Space Complexity
Time: O(n)->Where n is the length of the input string. We iterate through the string once.
Space: O(n)->In the worst case (all opening brackets), we store n characters in the stack.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 121. Best Time to Buy and Sell Stock

**Problem Link** : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

## 💡Approach
1.Initialize minPrice with Integer.MAX_VALUE to track the minimum stock price seen so far.
2.Initialize maxProfit with Integer.MIN_VALUE to track the highest profit encountered.
3.Traverse the prices array:
->Update minPrice if the current price is lower than minPrice.
->Calculate the profit by subtracting minPrice from the current price.
->Update maxProfit if the calculated profit is higher than the current maxProfit.
4.Return maxProfit.

## ⏱️ Time and Space Complexity
TIME:O(n)-> Single pass through the array.
SPACE:O(1)-> Constant space used for tracking variables.