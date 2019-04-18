public class Solution {
    public int isPalindrome(int A) {
        int num = A;
        int rev = 0;
        while(num > 0) {
            rev = (rev * 10) + num % 10;
            num /= 10;
        }
        if(A == rev)
            return 1;
        else 
            return 0;
    }
}

