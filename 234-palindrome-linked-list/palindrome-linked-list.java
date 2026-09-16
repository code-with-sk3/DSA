class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;

        // Make a copy of the list
        ListNode temp = head;
        ListNode copyHead = new ListNode(head.val);
        ListNode copy = copyHead;

        temp = temp.next;

        while (temp != null) {
            copy.next = new ListNode(temp.val);
            copy = copy.next;
            temp = temp.next;
        }

        // Reverse the copied list
        ListNode prev = null;
        ListNode curr = copyHead;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare original list with reversed copy
        ListNode first = head;
        ListNode second = prev;

        while (first != null) {
            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}