//PROBLEM 2. Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next; 
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//PROBLEM 168. Excel Sheet Column Title

class Solution{
 public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-indexed
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            result.insert(0, ch);
            columnNumber = columnNumber / 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));   // A
        System.out.println(convertToTitle(28));  // AB
        System.out.println(convertToTitle(701)); // ZY
    }
}

