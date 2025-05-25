// PROBLEM 155-> Min Stack
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push value to stack
    public void push(int val) {
        stack.push(val);
        // If minStack is empty or val is smaller or equal, push to minStack too
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop value from stack
    public void pop() {
        int removed = stack.pop();
        // If the removed value is the minimum, pop from minStack too
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Get top of stack
    public int top() {
        return stack.peek();
    }

    // Get minimum element in stack
    public int getMin() {
        return minStack.peek();
    }
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Problem-> 1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }
}
