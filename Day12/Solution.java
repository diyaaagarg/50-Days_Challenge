//PROBLEM 2807-> Insert Greatest Common Divisors in Linked List

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
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curNode = head;
        while(curNode.next != null) {
            int gcd = gcd(curNode.val, curNode.next.val);
            ListNode node = new ListNode(gcd);
            node.next = curNode.next;
            curNode.next = node;
            curNode = curNode.next.next;
        }
        return head;
    }
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//PROBELM 1523-> Count Odd Numbers in an Interval Range

class Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        if (low % 2 == 1 || high % 2 == 1) {
            count++;
        }
        return count;
    }
}