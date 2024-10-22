```java
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
    public ListNode middleNode(ListNode head) {
        ListNode Fast=head;
        ListNode Slow=head;
        ListNode T=head;
        while(Fast!=null && Fast.next!=null){
            Slow=Slow.next;
            Fast=Fast.next.next;
        }
        return Slow;
    }
}
```