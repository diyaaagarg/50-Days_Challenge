# Day 21 
PROBLEM 678. Valid Parenthesis String
✅ Problem Statement:-
You are given a string s containing only three characters: '(', ')', and '*'. The asterisk '*' can represent either a '(', a ')', or an empty string.
Write a function to determine if the input string can be a valid parenthesis string.
A string is considered valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
'*' can be treated as '(', ')', or an empty string.

**Problem Link**: https://leetcode.com/problems/valid-parenthesis-string/description/

## 💡Approach
Use Two Stacks:
->One for the indices of '(' called stackBracket.
->One for the indices of '*' called stackAsterick.

First Pass (Left to Right):
->Traverse the string character by character.
->Push the index of '(' onto stackBracket.
->Push the index of '*' onto stackAsterick.
->If the character is ')', try to match it:
  ->Prefer to pop from stackBracket.
  ->If stackBracket is empty, pop from stackAsterick.
  -> both are empty, return false (no match possible).

Second Pass (Post-processing):
->Match any remaining '(' in stackBracket with '*' in stackAsterick, but only if the index of '(' is less than the index of '*' (i.e., asterisks must come after the open bracket to act as closing).
->If this condition fails, return false.

Final Check:
->If all '(' are matched (i.e., stackBracket is empty), return true.

## ⏱️ Time and Space Complexity
Time: O(n)
Space: O(n)
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 119. Pascal's Triangle II

**Problem Link** : https://leetcode.com/problems/pascals-triangle-ii/description/

## 💡Approach
Steps:
1.Initialize a list res with the first element 1.
2.Use a loop to compute each next element based on the previous one:
cnt=cnt(rowIndex+1-i)/i
3.Append each new cnt to the list.
4.Return the final list.

## ⏱️ Time and Space Complexity
TIME:O(n)
SPACE:O(n)

