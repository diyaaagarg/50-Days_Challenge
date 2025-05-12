//Day07
//PROBLEM->61. Rotate List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        tail.next=head;
        k%=length;
        if(k==0){
            tail.next=null;
            return head;
        }
        ListNode newTail=head;
        for(int i=0;i<length-k-1;i++){
            newTail=newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//PROBELM 66. Plus One
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}