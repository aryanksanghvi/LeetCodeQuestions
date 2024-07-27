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
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = head;
        int count = 1;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        ListNode c = head;
        int n = count / 2;
        for(int i = 0; i < n; i++){
            c = c.next;
        }
        return c;
    }
}