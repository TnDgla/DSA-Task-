class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Add_Two_Numbers {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNode ans=addTwoNumbers(list1, list2);
        printList(ans);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int total=0;
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        while(l1!=null || l2!=null || carry!=0){
            total=carry;
            if(l1!=null){
                total+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                total+=l2.val;
                l2=l2.next;
            }
            int sum=total%10;
            carry=total/10;
            dummy.next=new ListNode(sum);
            dummy=dummy.next;
        }
        return res.next;
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
