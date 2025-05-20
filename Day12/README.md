# Day 12
// PROBLEM 2807->Insert Greatest Common Divisors in Linked List
✅ Problem Statement:-
You are given the head of a singly linked list of integers. Your task is to modify the list by inserting a new node between every pair of adjacent nodes. The value of the new node should be the Greatest Common Divisor (GCD) of the values of the adjacent nodes.
Return the modified linked list.

**Problem Link**: https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/

## 💡Approach
1.Initialize a pointer curNode to the head of the list.
2.Traverse the list while the next node exists.
3.For each pair of adjacent nodes:
->Compute the GCD of curNode.val and curNode.next.val.
->Create a new node with the GCD value.
->Insert this node between curNode and curNode.next.
->Move the pointer two steps forward to process the next pair.
4.Return the modified head of the list.

## ⏱️ Time and Space Complexity
Time: O(n)->where n is the number of nodes in the linked list.
Space: O(1)->constant space.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 1523. Count Odd Numbers in an Interval Range

**Problem Link** :https://leetcode.com/problems/factorial-trailing-zeroes/description/


## 💡Approach
1.The number of odd numbers between low and high can be calculated as (high - low) / 2.
2.However, if either low or high is odd, then there is one more odd number in the range, so we increment the count by 1.
3.Return the total count.

## ⏱️ Time and Space Complexity
TIME:O(1).
SPACE:O(1).
