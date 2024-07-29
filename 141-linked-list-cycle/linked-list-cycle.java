/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        HashSet<ListNode> hash = new HashSet<>();
        ListNode c = head;
        while(c != null){
            if(hash.contains(c)){
                return true;
                }
            hash.add(c);
            c = c.next;
        }
        return false;
    }
}