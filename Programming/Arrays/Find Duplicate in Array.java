public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        int slow = A[0];
        int fast = A[A[0]];
        while(slow != fast) {
            slow = A[slow];
            fast = A[A[fast]];
        }
        
        fast = 0;
        while(slow != fast) {
            slow = A[slow];
            fast = A[fast];
        }
        
        return slow == 0 ? -1 : slow;
    }
}
