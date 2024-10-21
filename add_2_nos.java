class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class add_2_nos {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode head = res;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            l1 = l1.next;
            l2 = l2.next;
            ListNode nn = new ListNode(sum);
            res.next = nn;
            res = res.next;
        }
        while(l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            sum %= 10;
            l1 = l1.next;
            ListNode nn = new ListNode(sum);
            res.next = nn;
            res = res.next;
        }
        while(l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            l2 = l2.next;
            ListNode nn = new ListNode(sum);
            res.next = nn;
            res = res.next;
        }
        if(carry != 0) {
            ListNode nn = new ListNode(carry);
            res.next = nn;
            res = res.next;
        }
        return head.next;
    }
}