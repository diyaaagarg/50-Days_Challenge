// PROBLEM 150. Evaluate Reverse Polish Notation
class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
        Stack <Integer> stack = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(s.equals("/")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a/b);
            }else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(s.equals("-")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a-b);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Problem-> 1979. Find Greatest Common Divisor of Array
class Solution {
    public int findGCD(int[] nums) {
        int mn=nums[0];
        int mx=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            mn=Math.min(mn,nums[i]);
            mx=Math.max(mx,nums[i]);
        }

        //gcd(a,b)=gcd(b,a%b);
        while(mn!=0)
        {
            int temp=mx%mn;//temp=a%b
            mx=mn;//a=b
            mn=temp;//b=a%b
        }
        return mx;
    }
}