// Last updated: 7/22/2025, 6:30:33 PM
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int l=size-k;
        ListNode left=head;
        ListNode right=head;
        for(int i=1;i<k;i++){
            left=left.next;
        }
        for(int i=0;i<l;i++){
            right=right.next;
        }
        int x=left.val;
        left.val=right.val;
        right.val=x;
        return head;
    }
}