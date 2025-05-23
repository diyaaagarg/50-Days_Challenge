# Day 15
// PROBLEM 2. Add Two Numbers

✅ Problem Statement:-
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list, also in reverse order.

**Problem Link**: https://leetcode.com/problems/add-two-numbers/description/

## 💡Approach
1.Initialize:
->dummy node to act as the head of the result list.
->current pointer to track the current node in the result.
->carry = 0 to store carry-over values.
2.Iterate through both linked lists (l1 and l2) and continue while any list has values or carry > 0.
3.At each step:
->Get val1 from l1 and val2 from l2 (or 0 if null).
->Compute sum = val1 + val2 + carry.
->Update carry = sum / 10.
->Create a new node with value sum % 10 and link it to the current node.
->Move the pointers (l1, l2, current) forward.
4.Return dummy.next as the head of the new list.


## ⏱️ Time and Space Complexity
Time: O(max(m,n))->where n is the number of nodes in the linked list.
Space: O(1)->constant space.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 168. Excel Sheet Column Title


**Problem Link** : https://leetcode.com/problems/excel-sheet-column-title/description/

## 💡Approach
1.While columnNumber > 0:
->Decrease columnNumber by 1 to shift to 0-based indexing.
->Take the remainder when divided by 26 (remainder = columnNumber % 26).
->Convert the remainder to a character using: char = (char)('A' + remainder).
->Add the character to the start of the result.
->Divide columnNumber by 26 to move to the next position.
2.Return the built string as the column title.



## ⏱️ Time and Space Complexity
TIME:O(log n base26).
SPACE:O(1).
