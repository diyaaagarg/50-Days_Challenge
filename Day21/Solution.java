//PROBLEM 678. Valid Parenthesis String
class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stackBracket=new Stack<>();
        Stack<Integer> stackAsterick=new Stack<>();
        char[]sArr=s.toCharArray();
        for(int i=0;i<sArr.length;i++){
            char ch=sArr[i];
            if(ch=='('){
                stackBracket.push(i);
            }
            else if(ch=='*')stackAsterick.push(i);
            else if(!stackBracket.isEmpty()){
                stackBracket.pop();
            }else if(!stackAsterick.isEmpty()){
                stackAsterick.pop();
            }else{
                return false;
            }
        }
        while(!stackBracket.isEmpty()&&!stackAsterick.isEmpty()&&stackBracket.peek()<stackAsterick.peek()){
            stackBracket.pop();
            stackAsterick.pop();
        }
        return stackBracket.isEmpty();
    }
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//PROBLEM 119. Pascal's Triangle II
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        long cnt=1;
        res.add((int)cnt);
        for(int i=1;i<=rowIndex;i++)
        {
            cnt=cnt*(rowIndex+1-i)/i;
            res.add((int)cnt);
        }
        return res;
    }
}