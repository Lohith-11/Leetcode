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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        while(second!=null){
            int x=first.val;
            int y=second.val;
            int add=1;
            for(int i=2;i<=Math.min(x,y);i++){
                if(x%i==0 && y%i==0){
                    add=Math.max(add,i);
                }
            }
            ListNode temp=new ListNode(add);
            // add=1;
            temp.next=first.next;
            first.next=temp;
            first=first.next.next;
            second=first.next;
        }
        return head;
    }
}