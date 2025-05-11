# Day 06 - 203-> Remove Linked List Elements

✅ Problem Statement:-
Given the head of a singly linked list and an integer val, remove all the nodes of the linked list that have val as their value and return the new head.

**Problem Link**: https://leetcode.com/problems/remove-linked-list-elements/description/
## 💡Approach
1.Use a dummy node pointing to the original head. This simplifies edge cases where the head node needs to be removed.
2.Use a pointer current to traverse the list.
3.At each step, check if current.next.val == val:
->If yes, skip that node by setting current.next = current.next.next.
->If no, move current to the next node.
4.Return dummy.next as the new head of the list.

## ⏱️ Time and Space Complexity
Time: O(n)->where n is the number of nodes in the linked list.
Each node is visited exactly once.
Space: O(1)->Constant extra space is used
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 202. Happy Number.

**Problem Link**:  https://leetcode.com/problems/happy-number/description/

## 💡Approach
1.We use Floyd’s Cycle Detection Algorithm (slow and fast pointers):
->Define a helper function getNext(int n) that calculates the sum of squares of digits.
->Initialize two pointers:
->slow starts at n
->fast starts at getNext(n)
2.Iterate:
->Move slow one step: slow = getNext(slow)
->Move fast two steps: fast = getNext(getNext(fast))
->If fast == 1, return true (happy number)
->If slow == fast, there's a cycle → return false

## ⏱️ Time and Space Complexity
TIME:O(logn)
SPACE:O(1)
