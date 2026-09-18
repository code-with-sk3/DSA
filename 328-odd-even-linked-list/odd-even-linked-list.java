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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode fast = head;
        while(fast!=null){
            tail.next = new ListNode(fast.val);
            tail = tail.next;
            if(fast.next != null){
                fast=fast.next.next;
            }
            else{
                break;
            }
        }
        fast = head.next;
         while(fast!=null){
            tail.next = new ListNode(fast.val);
            tail = tail.next;
            if(fast.next!=null){
                fast = fast.next.next;
            }
            else{
                break;
            }
        }

        return dummy.next;
    }
}