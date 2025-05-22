# Day 14
// PROBLEM 86. Partition List

✅ Problem Statement:-

Given the head of a linked list and a value x, partition it such that all nodes with values less than x come before nodes with values greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions

**Problem Link**: https://leetcode.com/problems/partition-list/description/

## 💡Approach
1.We use two separate linked lists:
->One to hold nodes less than x.
->Another to hold nodes greater than or equal to x.
2.We maintain dummy head nodes to simplify list manipulation. We traverse the original list and:
->Append nodes to the appropriate list (< x or >= x).
->Finally, we connect the two lists together.
3.This keeps the relative ordering intact and ensures an efficient in-place transformation.


## ⏱️ Time and Space Complexity
Time: O(n)->where n is the number of nodes in the linked list.
Space: O(1)->constant space.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 7. Reverse Integer

**Problem Link** : https://leetcode.com/problems/reverse-integer/description/

## 💡Approach
1.Extract digits from the number using modulus (x % 10) and division (x /= 10).
2.Use a long variable to store the result during reversal to prevent overflow while building the number.
3.After the loop, check if the reversed number is within the valid 32-bit integer range.
4.Return the reversed number as an int if it's valid, otherwise return 0

## ⏱️ Time and Space Complexity
TIME:O(log x base10).
SPACE:O(1).
