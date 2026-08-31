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
    public int[] nodesBetweenCriticalPoints(ListNode head){
        ArrayList<Integer> cp = new ArrayList<>();
        ListNode head1 = head.next;
        ListNode prev = head;
        int count =1;
        while(head1.next!=null){
            if(head1.val > prev.val && head1.val > head1.next.val){
                cp.add(count);
            }
            if(head1.val < prev.val && head1.val < head1.next.val){
                cp.add(count);
            }

            prev = head1;
            count++;
            head1 = head1.next;
        }
        if(cp.size()==0 || cp.size() < 2){
            return new int[] {-1,-1};
        }
        int[] ans = new int[2];
        int maxdist = -1;
        maxdist = Math.max(maxdist,(cp.get(cp.size()-1)-cp.get(0)));

        int mindist = Integer.MAX_VALUE;
        for(int i=1;i<cp.size();i++){
            mindist = Math.min(mindist,(cp.get(i)-cp.get(i-1)));
        }

        ans[0] = mindist;
        ans[1] = maxdist;

        return ans;

    }
}