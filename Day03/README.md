# Day 03 - Problem 21-> Merge Two Sorted Lists

✅ Problem Statement:-
Merge the two lists into one sorted linked list. The merged list should be made by splicing together the nodes of the first two lists.

**Problem Link**: https://leetcode.com/problems/merge-two-sorted-lists/
## 💡Approach
We use a dummy node and a pointer (current) to build the merged list iteratively:
1.Initialization:
->Create a dummy node that serves as the start of the merged list.
->Set a current pointer to the dummy node.

2.Merge Iteratively:
->Traverse both list1 and list2 simultaneously.
->At each step, compare the current nodes of the two lists.
->Append the node with the smaller value to current.next.
->Move the pointer (list1 or list2) from which the node was taken to the next node.
->Advance the current pointer to its next node.

3.Attach Remaining Nodes:
->Once one of the lists is exhausted, append the remaining part of the other list to current.next.
->Since the lists are already sorted, this preserves order.

4.Return the Merged List:
->Return dummy.next as the head of the new merged list (we skip the dummy node itself).

## ⏱️ Time and Space Complexity
Time: O(n+m)->Where n and m are the lengths of list1 and list2 respectively,
Space: O(1)-> Only constant extra space is used.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 507. Perfect Number
Problem Statement:-
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.

**Problem Link**: https://leetcode.com/problems/perfect-number/

## 💡Approach
1.Edge Case Check:
->If num <= 1, return false immediately, since 1 and 0 are not perfect numbers.

2.Initialize the Sum:
->Start with sum = 1, since 1 is always a divisor of any number > 1.

3.Loop through Potential Divisors:
->Loop i from 2 to √num:
->If i divides num evenly (num % i == 0):
->Add both i and num / i to the sum.
->Avoid double-counting when i == num / i (i.e., i * i == num).

4.Check for Perfection:
->After the loop, return true if sum == num.

## ⏱️ Time and Space Complexity
TIME:O(root n)-We iterate up to the square root of the number to find its divisors.
SPACE:O(1).
