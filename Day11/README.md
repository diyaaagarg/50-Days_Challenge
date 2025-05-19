# Day 11
// PROBLEM 19-> Remove Nth Node From End of List

✅ Problem Statement:-
Given the head of a linked list, remove the nth node from the end of the list and return its head.

**Problem Link**: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
## 💡Approach
1.A dummy node is created and points to the head of the list. This helps simplify edge cases like removing the head node.
2.Both fast and slow pointers are initialized to the dummy node.
3.Move the fast pointer n + 1 steps ahead to maintain a gap of n between fast and slow.
4.Move both fast and slow pointers one step at a time until fast reaches the end.
5.Now, slow is just before the node to be deleted. Update slow.next to skip the target node.
6.Return dummy.next as the new head of the list.

## ⏱️ Time and Space Complexity
Time: O(n)->where n is the number of nodes in the linked list.
Space: O(1)->constant space.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 172. Factorial Trailing Zeroes

**Problem Link** :https://leetcode.com/problems/factorial-trailing-zeroes/description/


## 💡Approach
1.To count the number of trailing zeroes in n!, we observe that trailing zeroes are produced by the factors of 10 in the factorial. Each 10 is the result of multiplying a pair of 2 and 5. However, in any factorial, there are more factors of 2 than 5, so the number of trailing zeroes is determined by the number of times 5 is a factor in the numbers from 1 to n.

The algorithm repeatedly divides n by 5, 25, 125, etc., and sums up all the quotients. This gives the total number of times 5 is a factor in the factorial.

## ⏱️ Time and Space Complexity
TIME:O(log n base5).
SPACE:O(1).
