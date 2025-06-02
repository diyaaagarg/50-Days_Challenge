//Day 22
//PROBLEM 1249. Minimum Remove to Make Valid Parentheses
public class Solution {
    public String minRemoveToMakeValid(String s) {
        // First pass: remove invalid ')'
        StringBuilder firstPass = new StringBuilder();
        int openCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                openCount++;
                firstPass.append(ch);
            } else if (ch == ')') {
                if (openCount > 0) {
                    openCount--;
                    firstPass.append(ch);
                }
                // else skip the ')'
            } else {
                firstPass.append(ch); // append letters
            }
        }

        // Second pass: remove extra '(' from right to left
        StringBuilder result = new StringBuilder();
        int closeCount = 0;
        for (int i = firstPass.length() - 1; i >= 0; i--) {
            char ch = firstPass.charAt(i);
            if (ch == ')') {
                closeCount++;
                result.append(ch);
            } else if (ch == '(') {
                if (closeCount > 0) {
                    closeCount--;
                    result.append(ch);
                }
                // else skip the '('
            } else {
                result.append(ch); // append letters
            }
        }

        return result.reverse().toString();
    }
}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Problem-> 169. Majority Element
class Solution {
    public int majorityElement(int[] nums) {
     Arrays.sort(nums);
     return nums[nums.length/2];
    }
}