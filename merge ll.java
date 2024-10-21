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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode returnNode=new ListNode(Integer.MIN_VALUE);
        ListNode headNode=returnNode;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                returnNode.next=l1;
                l1=l1.next;

            }
            else{
                returnNode.next=l2;
                l2=l2.next;
            }
            returnNode=returnNode.next;

        }
        if(l1==null){
            returnNode.next=l2;
        }
        if(l2==null){
            returnNode.next=l1;
        }
        return headNode.next;
        
    }
}
