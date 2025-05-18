# Day 10
// PROBLEM 2095. Delete the Middle Node of a Linked List


✅ Problem Statement:-
Given the head of a singly linked list, delete the middle node, and return the head of the modified list.
The middle node is the ⌊n / 2⌋-th node in the list (0-based indexing). If there is only one node, return null.

**Problem Link**: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

## 💡Approach
We use the Two-Pointer Technique (Fast & Slow pointers) to find the middle node in one pass:
1.Create a dummy node pointing to the head to simplify edge cases.
2.Initialize two pointers:
->slow starts from the dummy node.
-.fast starts from the actual head node.
3.Move fast by 2 steps and slow by 1 step until fast reaches the end.
4.At this point, slow.next is the middle node.
5.Delete the middle node by pointing slow.next to slow.next.next.

## ⏱️ Time and Space Complexity
Time: O(n)->where n is the number of nodes in the linked list.
Space: O(1)->constant space.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 319. Bulb Switcher

**Problem Link**: https://leetcode.com/problems/bulb-switcher/description/


## 💡Approach
1.A bulb ends up being toggled once for each of its divisors.
2.Most numbers have an even number of divisors (e.g., 6 has divisors 1, 2, 3, 6).
3.Only perfect squares have an odd number of divisors (e.g., 9 has 1, 3, 9).
Therefore, only bulbs at perfect square positions will be on after all the toggling rounds.
Goal:
Count how many perfect squares ≤ n.
->This is the same as computing floor(sqrt(n)).

## ⏱️ Time and Space Complexity
TIME:O(root n).
SPACE:O(1).
