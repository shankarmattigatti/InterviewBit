public class Solution {
    public int reverse(int A) {
        boolean negativeFlag = false;
        if(A < 0) {
            negativeFlag = true;
            A = -A;
        }
        
        int prevNum = 0, revNum = 0;
        while(A != 0) {
            int digit = A % 10;
            revNum = (revNum * 10) + digit;
            if((revNum - digit) / 10 != prevNum) {
                return 0;
            }
            prevNum = revNum;
            A /= 10;
        }
        return negativeFlag == true ? -revNum : revNum;
    }
}

