/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode middle(ListNode head) {
        ListNode s = head, f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode mid = middle(head);
        ListNode rev = mid.next;
        mid.next = null;
        rev = reverse(rev);
        int ans = 0;
        while (head != null) {
            ans = Math.max(ans, head.val + rev.val);
            head = head.next;
            rev = rev.next;
        }
        return ans;
    }
}