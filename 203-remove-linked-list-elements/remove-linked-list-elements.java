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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
       ListNode curr=head;
       ListNode prev=new ListNode(0);
       
       prev.next=head;
       while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }else{
                prev=prev.next;
            }
            curr=curr.next;
       }
       return head;
    }
}