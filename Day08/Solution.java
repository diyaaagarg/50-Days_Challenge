//Day08
//PROBLEM 328. Odd Even Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 * 
 * 
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        ListNode odd=first;
        ListNode even=second;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=second;
        return head;
    }
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//PROBLEM 171. Excel Sheet Column Number

class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for (int i=0; i<columnTitle.length();i++) {
            res=res*26+(columnTitle.charAt(i)-'A'+1);
        }
        return res;
    }
}