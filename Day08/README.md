# Day 08 -328-> Odd Even Linked Listv

✅ Problem Statement:-
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

**Problem Link**: https://leetcode.com/problems/odd-even-linked-list/description/

## 💡Approach
1.Edge Case Handling: If the list is empty or has only one node, return the head as it is.
2.Initialization:
->Use two pointers: odd for odd-indexed nodes, and even for even-indexed nodes.
->Keep a reference to the head of the even list (second) so it can be appended at the end of the odd list later.
3.Rearranging:
->Traverse the list while both even and even.next are not null.
->Connect odd node to the node after even, and advance odd.
->Then connect even node to the node after odd, and advance even.
4.Final Connection:
->Link the last odd node to the head of the even list (second).
5.Return: the modified list starting at head.

## ⏱️ Time and Space Complexity
Time: O(n)->where n is the number of nodes in the linked list.
Space: O(1)->Constant extra space is used
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 171. Excel Sheet Column Number

**Problem Link**: https://leetcode.com/problems/excel-sheet-column-number/description/


## 💡Approach
This is similar to converting a string representation of a number in base-26 to its decimal equivalent. The key points:
1.Treat each character as a digit in base-26, where:
->'A' = 1, 'B' = 2, ..., 'Z' = 26.
2.For each character from left to right:
->Multiply the current result by 26.
->Add the numeric value of the current character.

## ⏱️ Time and Space Complexity
TIME:O(n)->where n is the length of the string columnTitle.
SPACE:O(1)->as no additional space is used apart from variables.
