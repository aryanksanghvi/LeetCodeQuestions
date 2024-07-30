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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dum = head;
        int count = 1;
        while(dum.next != null){
            dum = dum.next;
            count++;
        }
        k = k % count;
        for(int i = 0; i < k; i++){
            ListNode h = head;
            ListNode c = head;
            ListNode p = head;
            while(h.next != null){
                h = h.next;
            }
            while(p.next.next != null){
                p = p.next;
            }
            h.next = c;
            p.next = null;
            head = h;
        }
        return head;
    }
}