/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        if(A == null || B < 1)
            return A;
            
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while(fast != null && B + 1 > 0) {
            fast = fast.next;
            B--;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
