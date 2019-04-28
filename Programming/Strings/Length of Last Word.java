public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        if (A.isEmpty() || A.trim().isEmpty())
            return 0;
        
        String[] str = A.split(" ");
        return str[str.length - 1].length();
    }
}
