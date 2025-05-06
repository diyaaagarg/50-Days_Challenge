//DAY 01
//REVERSED A SINGLY LINKED LIST
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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;

        }
        return prev;
    }
}
// Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        for(int i=1;i<=nums.length;i++){
            xor=xor^i;
        }
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}