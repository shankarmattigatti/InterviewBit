public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        if(A == null)
            return A;
        ListNode current = A;
        while(current.next != null) {
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else  {
                current = current.next;   
            }
        }
        return A;
    }
}
