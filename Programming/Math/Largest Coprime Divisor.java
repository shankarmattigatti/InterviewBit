public class Solution {
    static int gcd(int A, int B) {
        if(B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
    
    public int cpFact(int A, int B) {
        while(gcd(A, B) != 1) {
            A = A / gcd(A, B);
        }
        return A;
    }
}
