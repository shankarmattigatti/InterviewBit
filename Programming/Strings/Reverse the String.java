public class Solution {
    public String reverseWords(String a) {
        String[] str = a.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            if(i == 0)
                sb.append(str[i]);
            else
                sb.append(str[i] + " ");
        }
        return sb.toString();
    }
}
