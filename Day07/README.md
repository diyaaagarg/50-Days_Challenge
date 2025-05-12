# Day 07 - 61-> Rotate List

✅ Problem Statement:-
Given the head of a singly linked list, rotate the list to the right by k places.

**Problem Link**: https://leetcode.com/problems/rotate-list/description/
## 💡Approach
1.Edge Cases: Return the head as-is if:
->The list is empty (head == null),
->Has only one node (head.next == null),
->Or k == 0.
2.Count Length: Traverse the list to determine its length and connect the last node to the head, forming a circular list.
3.Adjust k: Reduce k using k = k % length to avoid unnecessary full rotations.
4.Find New Head: Traverse (length - k) nodes to find the new tail. The node after it becomes the new head.
5.Break the Cycle: Set newTail.next = null to break the circular connection and return the new head.

## ⏱️ Time and Space Complexity
Time: O(n)->where n is the number of nodes in the linked list.
Each node is visited exactly once.
Space: O(1)->Constant extra space is used
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 66. Plus One

**Problem Link**:  https://leetcode.com/problems/plus-one/description/

## 💡Approach
1.Traverse the array from the end (least significant digit).
2.If a digit is less than 9, increment it and return the array immediately.
3.If a digit is 9, set it to 0 and continue to the next digit.
4.If all digits are 9 (e.g., [9,9,9]), create a new array with an extra digit, set the first digit to 1, and return it (result: [1,0,0,0]).

## ⏱️ Time and Space Complexity
TIME:O(n)->where n is the number of digits in the input array. In the worst case (e.g., [9,9,9,...,9]), we may need to traverse the entire array.
SPACE:O(1)
