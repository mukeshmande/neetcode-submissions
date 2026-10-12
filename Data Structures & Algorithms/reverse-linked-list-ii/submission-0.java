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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        ListNode leftPre = dummy;
        for(int i = 0; i< left - 1; i++){
            leftPre = curr;
            curr = curr.next;
        }

        ListNode pre = null;
        for(int i = 0; i< right-left+1; i++){
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }

        leftPre.next.next = curr;
        leftPre.next = pre;
        return dummy.next;
    }
    
}