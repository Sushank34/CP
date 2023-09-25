
/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">Problem link</a>
 * **/

public class Add_Two_Numbers {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode();
            ListNode traverse = result;
            int sum = 0;
            int carry = 0;
            while (l1 != null || l2 != null) {
                sum = 0;
                if (l1 != null) {
                    sum = sum + l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum = sum + l2.val;
                    l2 = l2.next;
                }
                traverse.val = (sum + carry) % 10;
                carry = (sum + carry) / 10;
                if (l1 != null || l2 != null) {
                    traverse.next = new ListNode();
                    traverse = traverse.next;
                }
            }
            if (carry == 1) {
                traverse.next = new ListNode(1);
            }
            return result;
        }
    }
}
