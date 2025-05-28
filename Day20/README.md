# Day 20
// PROBLEM 150. Evaluate Reverse Polish Notation
✅ Problem Statement:-
Evaluate the value of an arithmetic expression in Reverse Polish Notation (RPN).
Valid operators are +, -, *, and /. Each operand may be an integer or another expression. Division between two integers should truncate toward zero.

**Problem Link**: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

## 💡Approach
1.Traverse each token in the input list:
->If the token is an operand (number), push it onto the stack.
->If the token is an operator (+, -, *, /), pop the top two operands from the stack, apply the operator, and push the result back.
2.After processing all tokens, the result of the expression will be the only element left in the stack.
Key point: We always pop the second operand first and then the first operand (since stack is LIFO), and apply the operation as first operator second.

## ⏱️ Time and Space Complexity
Time: O(n)->Where n is the number of tokens in the input. Each token is processed exactly once.
Space: O(n)->In the worst case, all tokens are operands, and we store them in the stack, requiring space proportional to the number of tokens.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Problem-> 1979. Find Greatest Common Divisor of Array

**Problem Link** : https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

## 💡Approach
1.Find the smallest and largest values in the array using a single pass.
2.Use the Euclidean Algorithm to compute the GCD of these two numbers:
->gcd(a, b) = gcd(b, a % b)
3.Repeat until b becomes 0; the result is a.
This algorithm is efficient and avoids unnecessary factorization or iteration over possible divisors.

## ⏱️ Time and Space Complexity
TIME:O(n + log(max))-> O(n) to find the minimum and maximum values in the array.
                       O(log(max)) for the GCD computation via the Euclidean algorithm, where max is the larger of the two numbers.
SPACE:O(1)-> Only a few variables are used for tracking minimum, maximum, and GCD computations.

