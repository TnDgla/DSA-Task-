class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class middle_ll {
    public ListNode middleNode(ListNode head) {
        int l = 0;
        ListNode temp = head;
        while (temp != null) {
            l++;
            temp = temp.next;
        }
        temp = head;
        int m = l / 2;
        while (m-- > 0) {
            temp = temp.next;
        }
        return temp;
    }
}