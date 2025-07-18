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
        ListNode right=head.next;
        ListNode left=head;
        int ans=0;
        while(right!=null){
            if(right.val!=0){
                ans+=right.val;
                right=right.next;
            }else{
                ListNode temp=new ListNode(ans);
                left.next=temp;
                left=left.next;
                ans=0;
                right=right.next;
            }
        }
        head=head.next;
        return head;
    }
}