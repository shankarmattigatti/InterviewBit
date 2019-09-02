/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
        if(A == null || A.next == null)
            return A;
            
        ListNode prev = null, slow = A, fast = A;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        ListNode l1 = sortList(A);
        ListNode l2 = sortList(slow);
        
        return mergeList(l1, l2);
    }
    
    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), curr = l;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        
        if(l1 != null)
            curr.next = l1;
            
        if(l2 != null) 
            curr.next = l2;
            
        return l.next;
    }
}
