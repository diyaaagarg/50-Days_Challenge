//PROBLEM 2095. Delete the Middle Node of a Linked List

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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//PROBLEM 319. Bulb Switcher
class Solution {
    public int bulbSwitch(int n) {
        int count=0;
        int i=1;

        while(i*i<=n) {
            count++;
            i++;
        }
        return count;
    }
}