/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode node = new ListNode(0);
        ListNode current = node;
        while(A != null && B != null) { 
            if(A.val > B.val) {
                current.next = new ListNode(B.val);
                B = B.next;
            } else {
                current.next = new ListNode(A.val);
                A = A.next;
            }
            current = current.next;
        }
        
        while(A != null){
            current.next = new ListNode(A.val);
            A = A.next;
            current = current.next;
        }
        
        while(B != null){
            current.next = new ListNode(B.val);
            B = B.next;
            current = current.next;
        }
        return node.next;
    }
}
