public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        int size = A.size();
        
        if(size == 0)
            return "";
        
        if(size == 1)
            return A.get(0);
        
        Collections.sort(A);
        
        int end = Math.min(A.get(0).length(), A.get(size - 1).length()); 
  
        int i = 0; 
        while (i < end && A.get(0).charAt(i) == A.get(size - 1).charAt(i) ) 
            i++; 
  
        String pre = A.get(0).substring(0, i); 
        return pre;
    }
}
