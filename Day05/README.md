# Day 05 - 234-> Palindrome Linked List

✅ Problem Statement:-
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

**Problem Link**: https://leetcode.com/problems/palindrome-linked-list/
## 💡Approach
->Find the middle of the linked list using the fast and slow pointer technique.
->Reverse the second half of the list.
->Compare the first half and the reversed second half node-by-node.
->Optionally, restore the original list (if required).
->If all corresponding nodes matched → return true; else → return false.

## ⏱️ Time and Space Complexity
Time: O(n)->We traverse the list a few times (to find middle, reverse, and compare), each in linear time.
Space: O(1)->We do everything in-place using pointers without any extra data structures.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 367. Valid Perfect Square
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of another integer (e.g., 1, 4, 9, 16, 25, etc.).

**Problem Link**:  https://leetcode.com/problems/valid-perfect-square/

## 💡Approach
->A perfect square x satisfies the condition x = y * y for some integer y.
->We can search for such a y in the range 1 to num / 2 (since the square root of a number is never greater than num / 2 for num > 1).
->Use binary search:
->Compute mid = (start + end) / 2
->If mid * mid == num, return true
->If mid * mid < num, move right
->Else, move left
->Return false if no such mid is found.

## ⏱️ Time and Space Complexity
TIME:O(logn)-Binary search reduces the search range in half each time.
SPACE:O(1)-Only a few pointers/variables used; no extra space required.
