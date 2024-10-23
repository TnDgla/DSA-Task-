class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; 

        System.out.println(hasCycle(head));

    }
    public static boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    
}
