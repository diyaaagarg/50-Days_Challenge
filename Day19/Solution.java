// PROBLEM 20. Valid Parentheses
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')st.push(')');
            else if(c=='{')st.push('}');
            else if(c=='[')st.push(']');
            else if (st.isEmpty()||st.pop()!=c)return false;
        }
        return st.isEmpty();
    }
}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Problem-> 121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=Integer.MIN_VALUE;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            int profit=prices[i]-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}