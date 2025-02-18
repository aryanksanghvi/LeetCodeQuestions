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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return list1;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                curr.next = curr1;
                curr1 = curr1.next;
            }
            else{
                curr.next = curr2;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        if(curr1 != null){
            curr.next = curr1;
        }
        if(curr2 != null){
            curr.next = curr2;
        }
        return dummy.next;
    }
}