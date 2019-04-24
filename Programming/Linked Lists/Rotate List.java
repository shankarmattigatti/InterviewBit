/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        int count = 1;
        ListNode start = A;
        while(A.next != null) {
            A = A.next;
            count++;
        }
        B = B % count;
        B = Math.abs(count - B);
        if(B == 0)
            return start;
        
        A.next = start;
        while(B-- > 0) {
            A = A.next;
        }
        start = A.next;
        A.next = null;
        return start;
    }
}
