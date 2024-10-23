import java.util.List;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Reverse_Linkedlist {
    public static void main(String[] args) {
         // creation of ll
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Before reversing a ll: ");
        printList(head);

        ListNode rev=reverse(head);

        System.out.println("After reversing a ll: ");
        printList(rev);

    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode NextNode=null;
        ListNode curr=head;
        while(curr!=null){
            NextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=NextNode;
        }
        return prev;
    }
}
