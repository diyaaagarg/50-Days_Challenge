# Day 25
PROBLEM 225. Implement Stack using Queues

✅ Problem Statement:-
Implement a stack (LIFO) using two queues (FIFO). You must implement the following operations:
push(x) – Push element x onto stack.
pop() – Removes the element on top of the stack and returns it.
top() – Get the top element.
empty() – Return whether the stack is empty.

**Problem Link**: https://leetcode.com/problems/implement-stack-using-queues/description/

# Approach
Data Structures Used:
Two queues q1 and q2 (Java LinkedList used as Queue)
Main Idea:
Always maintain the newest element at the front of q1.
For push(x), insert the element into q2 and then transfer all elements from q1 to q2. This makes sure q2 has the new element first, followed by all others.
Finally, swap q1 and q2, so q1 always has the correct stack order.
Operations:
push(int x)
Add x to q2.
Move all elements from q1 to q2.
Swap q1 and q2.
pop()
Just remove the front of q1 (which is the top of the stack).
top()
Peek the front of q1 (which is the top of the stack).
empty()
Return whether q1 is empty.

## ⏱️ Time and Space Complexity
TIME:O(n)&O(1)
SPACE:O(n)->no extra space used.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 189. Rotate Array

**Problem Link** : https://leetcode.com/problems/rotate-array/description/

## 💡Approach
Handle edge cases:
If array is empty, has one element, or k == 0, return immediately.
Create a copy of the original array.
Compute the starting index for the rotated array using:
int j = nums.length - (k % nums.length);

Fill the original array starting from index j of the copied array.
Wrap around when j goes out of bounds (i.e., use j = 0).
   
## ⏱️ Time and Space Complexity
TIME:O(n)
SPACE:O(n)->no extra space used.

