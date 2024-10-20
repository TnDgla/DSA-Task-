package LinkedList;

public class DeleteNodeLL_237 {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}