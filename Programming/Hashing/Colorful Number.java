public class Solution {
    public int colorful(int A) {
        Set<Integer> set = new HashSet<>();
        String str = String.valueOf(A);
        
        for(int i = 0;i < str.length(); i++) {
            for(int j = i;j <= str.length(); j++) {
                String num = str.substring(i, j);
                if(num.length() > 0) {
                    int prod = findProduct(Integer.parseInt(num));
                    if(set.contains(prod)) {
                        return 0;
                    }
                    set.add(prod);   
                }
            }
        }
        return 1;
    }
    
    static int findProduct(int num) {
        int prod = 1;
        while(num > 0) {
            prod *= num % 10;
            num /= 10;
        }
        return prod;
    }
}
