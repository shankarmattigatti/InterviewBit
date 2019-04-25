/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        if(A == null)
            return 1;
        
        ListNode curr = A;
        ListNode prev = new ListNode(A.val);
 
        while(curr.next != null){
            ListNode temp = new ListNode(curr.next.val);
            temp.next = prev;
            prev = temp;
            curr = curr.next;
        }
    
        ListNode n1 = A;
        ListNode n2 = prev;
        
        while(n1 != null) {
            if(n1.val != n2.val)
                return 0;
                
            n1 = n1.next;
            n2 = n2.next;
        }
        return 1;
    }
}
