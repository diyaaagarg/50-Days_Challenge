# Day 17
// PROBLEM 155-> Min Stack
✅ Problem Statement:-
Design a stack that supports the following operations in constant time:
->push(val) – Push element val onto the stack.
->pop() – Remove the element on the top of the stack.
->top() – Get the top element.
->getMin() – Retrieve the minimum element in the stack.

**Problem Link**: https://leetcode.com/problems/min-stack/description/

## 💡Approach
To achieve constant time operations, especially for getMin(), we use two stacks:
->Main Stack (stack) – Stores all values as in a regular stack.
->Min Stack (minStack) – Stores the minimum value at each level of the stack.

Push Operation:
->Push the value onto stack.
->If minStack is empty or the new value is less than or equal to the current minimum, also push it onto minStack.

Pop Operation:
->Pop the top element from stack.
->If the popped value is equal to the top of minStack, pop from minStack as well.

Top Operation:
->Return the top element of stack.

GetMin Operation:
->Return the top element of minStack, which is the current minimum.

## ⏱️ Time and Space Complexity
Time: O(1)->Constant time
Space: O(n)->where n is the number of elements pushed into the stack.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 1. Two Sum

**Problem Link** : https://leetcode.com/problems/two-sum/description/

## 💡Approach
1.Use two nested loops to check all pairs.
2.If a pair is found where nums[i] + nums[j] == target, return their indices.

## ⏱️ Time and Space Complexity
TIME:O(n*n).
SPACE:O(1).
