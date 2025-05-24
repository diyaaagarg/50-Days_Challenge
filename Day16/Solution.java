// PROBLEM 237-> Delete Node in a Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Problem-> 633. Sum of Square Numbers
class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0,right=(int)Math.sqrt(c);
        while(left<=right){
            long sum=left*left+right*right;
            if(sum==c)return true;
            else if(sum<c){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}