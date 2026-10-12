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
    public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length == 0) return null;
            return mergeKLists(lists, 0, lists.length - 1);
    }

    public ListNode mergeKLists(ListNode[] lists, int start, int end){
        if(start == end) return lists[start];

        if(start + 1 == end) return mergeLists(lists[start], lists[end]);

        int m = start + (end-start)/2;

        ListNode left = mergeKLists(lists, start, m);
        ListNode right = mergeKLists(lists, m+1, end);

        return mergeLists(left, right);
    }


    public ListNode mergeLists(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(left != null && right != null){
            if(left.val < right.val){
                curr.next = left;
                left = left.next;
            }else{
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        if(left != null) curr.next = left;
        else curr.next = right;


        return dummy.next;
    }

    
}
