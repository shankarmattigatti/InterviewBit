public class Solution {
    public int isPalindrome(String A) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : A.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                stringBuilder.append(Character.toLowerCase(character));
            }
        }

        String str = stringBuilder.toString();
        String rev = stringBuilder.reverse().toString();

        return str.equals(rev) ? 1 : 0;
    }
}
