# Day 18
// PROBLEM 232-> Implement Queue using Stacks
✅ Problem Statement:-
Implement a queue using two stacks (Stack<Integer>). 
The implemented queue should support the standard queue operations:
push(x) – Push element x to the back of the queue.
pop() – Removes the element from the front of the queue and returns it.
peek() – Get the front element.
empty() – Returns whether the queue is empty.

**Problem Link**: https://leetcode.com/problems/implement-queue-using-stacks/description/

## 💡Approach
To implement the queue, we use two stacks: s1 and s2.

1.Push Operation:
->Move all elements from s1 to s2.
->Push the new element x to s1.
->Move all elements back from s2 to s1.

This ensures that the front of the queue is always at the top of s1, which allows pop() and peek() to work in constant time.

2.Pop Operation:
->Directly pop the top element from s1.

3.Peek Operation:
->Directly return the top element of s1.

4.Empty Operation:
->Check if s1 is empty.

## ⏱️ Time and Space Complexity
Time: O(1)->Constant time
Space: O(n)->where n is the number of elements pushed into the stack.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 217. Contains Duplicate

**Problem Link** : https://leetcode.com/problems/contains-duplicate/description/

## 💡Approach
This implementation uses the sorting method:
->Sort the array.
->Traverse the sorted array.
->Check if any two adjacent elements are equal. If yes, return true.
->If no duplicates are found, return false.

## ⏱️ Time and Space Complexity
TIME:O(nlogn)-> if considering the extra space taken by the sorting algorithm 
SPACE:O(n)-> if considering the extra space taken by the sorting algorithm 
