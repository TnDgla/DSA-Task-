import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Delete_Node_in_a_linkedList {
    public static void main(String[] args) {
        // creation of ll
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("before deleting a node in Linked List:");
        printList(head);
        
        ListNode node_To_Be_Deleted = head.next;
        deleteNode(node_To_Be_Deleted);
        System.out.println("After deleting a node in Linked List:");
        printList(head);

    }
    public static void deleteNode(ListNode node) {
        ListNode prev=null;
        while(node!=null && node.next!=null){
            node.val=node.next.val;
            prev=node;
            node=node.next;
        }
        prev.next=null;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
}
