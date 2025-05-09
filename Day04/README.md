# Day 04 - Problem 141-> Linked List Cycle

✅ Problem Statement:-
Given the head of a singly linked list, return true if there is a cycle in the linked list. Otherwise, return false.

**Problem Link**: https://leetcode.com/problems/linked-list-cycle/
## 💡Approach
->Initialize two pointers: slow = head, fast = head.
->While fast and fast.next are not null:
->Move slow by one node.
->Move fast by two nodes.
->If slow == fast, return true (cycle detected).
->If loop exits, return false (no cycle).

## ⏱️ Time and Space Complexity
Time: O(n)->In the worst case, the fast pointer traverses the list once, where n is the number of nodes.
Space: O(1)-> Only constant extra space is used.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 9. Palindrome Number
Problem Statement:-
Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same backward as forward.

**Problem Link**:  https://leetcode.com/problems/palindrome-number/

## 💡Approach
->Convert the integer x to a string s.
->Loop from 0 to n/2 (where n = s.length()).
->If characters at symmetric positions differ, return false.
->If the loop completes, return true.

## ⏱️ Time and Space Complexity
TIME:O(n)-where n is the number of digits in the number.
SPACE:O(n)-for storing the string representation of the number.
