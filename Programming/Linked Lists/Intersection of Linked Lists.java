/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        if(a == null || b == null)
            return null;
            
        ListNode i = a;
        ListNode j = b;
        while(i != j) {
            i = i == null ? b : i.next;
            j = j == null ? a : j.next;
        }
        return i;
    }
}
