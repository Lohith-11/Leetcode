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
    public ListNode mergeNodes(ListNode head) {
        ListNode left=head.next;
        ListNode right=head.next;
        ListNode prev=head;
        int ans=0;
        while(right!=null){
            if(right.val!=0){
                ans+=right.val;
                right=right.next;
            }else{
                ListNode temp=new ListNode(ans);
                if(left==head){
                    head=temp;
                }else{
                    prev.next=temp;
                    prev=prev.next;
                }
                ans=0;
                left=prev.next;
                right=right.next;
            }
        }
        head=head.next;
        return head;
    }
}