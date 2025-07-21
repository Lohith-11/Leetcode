/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0;
        ListNode x1=headA;
        while(x1!=null){
            x1=x1.next;
            size1++;
        }
        int size2=0;
        ListNode x2=headB;
        while(x2!=null){
            x2=x2.next;
            size2++;
        }
        if(size1>size2){
            for(int i=0;i<size1-size2;i++){
                headA=headA.next;
            }
        }else{
            for(int i=0;i<size2-size1;i++){
                headB=headB.next;
            }
        }

        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}