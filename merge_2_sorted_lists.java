class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class merge_2_sorted_lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(1);
        ListNode res = ans;
        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                res.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            else {
                res.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            res = res.next;
        }
        if(list1 != null) {
            res.next = list1;
        }
        if(list2 != null) {
            res.next = list2;
        }
        return ans.next;
    }
}