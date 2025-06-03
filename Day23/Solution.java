//PROBLEM 32. Longest Valid Parentheses
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int max_length=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    max_length=Math.max(max_length,i-stack.peek());
                }
            }
        }
        return max_length;
    }
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Problem-> 35. Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=start-(start-end)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}
