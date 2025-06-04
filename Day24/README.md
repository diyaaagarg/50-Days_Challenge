# Day 24
224. Basic Calculator

✅ Problem Statement:-
Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

**Problem Link**: https://leetcode.com/problems/basic-calculator/description/

//Will do this after sometime
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 283. Move Zeroes

**Problem Link** : https://leetcode.com/problems/move-zeroes/description/

## 💡Approach
1.Use two pointers:
i – points to the position where the next non-zero should be placed.
j – iterates through the entire array.
2.Traverse the array using j:
If nums[j] != 0, swap nums[i] with nums[j] and increment i.
This way, all non-zero elements are pushed toward the front in order, and zeroes are pushed toward the back.
   

## ⏱️ Time and Space Complexity
TIME:O(n)
SPACE:O(1)->no extra space used.

