//PROBLEM 86. Partition List
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
    public ListNode partition(ListNode head, int x) {
        ListNode a=new ListNode(-1);
        ListNode b=new ListNode(-1);
        ListNode ta=a;
        ListNode tb=b;
        ListNode t=head;
        while(t!=null){
            if(t.val<x){
                ta.next=t;
                ta=ta.next;
            }else{
                tb.next=t;
                tb=tb.next;
            }
            t=t.next;
        }
        ta.next=b.next;
        tb.next=null;
        return a.next;
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------
//PROBLEM 7. Reverse Integer
class Solution {
    public int reverse(int x) {
        long a=0;
        while(x!=0){
            a=a*10+x%10;
            x/=10;
        }
        if(a<Math.pow(-2,31)||a>Math.pow(2,31)) return 0;
        return (int)a;
    }
}
