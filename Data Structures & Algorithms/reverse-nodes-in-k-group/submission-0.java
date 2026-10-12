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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1 || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(-1, head);
        ListNode begin = dummy;
        int i = 0;
        while(head != null){
            i++;
            if(i%k == 0){
                ListNode end = head.next;
                begin = reverse(begin, end);
                head = begin.next;
            }else{
                head = head.next;
            }
        }

        return dummy.next;
    }

    public ListNode reverse(ListNode begin, ListNode end){
        ListNode pre = begin;
        ListNode curr = begin.next;
        ListNode first = curr;

        while(curr != end){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        begin.next = pre;
        first.next = curr;
        return first;


    }
}
