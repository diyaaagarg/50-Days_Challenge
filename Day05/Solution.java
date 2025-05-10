//Day05 ->234. Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null,current=slow;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        while(prev!=null){
            if(prev.val!=head.val)return false;
            prev=prev.next;
            head=head.next;
        }
        return true;
    }
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//367-> Valid Perfect Square
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0||num==1){
            return true;
        }
     long start=0;
     long end=num/2;
     while(start<=end){
        long mid=start+(end-start)/2;
        if(mid*mid==num){
            return true;
        }
        else if(mid*mid<num){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
     }
     return false;
        
    } 
}