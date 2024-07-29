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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode half = rev(slow);
        // slow.next = rev(slow.next);
        ListNode dummy = head;
        while(half.next != null){
            if(dummy.val != half.val){
                return false;
            }
            half = half.next;
            dummy = dummy.next;
        }
        return true;
    }
    public ListNode rev(ListNode head){
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        return prev;
    }
}