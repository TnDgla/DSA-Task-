class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Middle_Of_The_LinkedList {
    public static void main(String[] args) {
         // creation of ll
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
         
        System.out.println("Before reversing a ll: ");
        printList(head);
 
        ListNode mid=Middle(head);
 
        System.out.println("After reversing a ll: ");
        printList(mid);
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode Middle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
