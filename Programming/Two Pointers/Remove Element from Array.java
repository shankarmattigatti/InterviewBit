public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int i, j;
        for(i = 0, j = 0; j < a.size(); j++) {
            if(a.get(j) != b) {
                a.set(i, a.get(j));
                i++;
            }
        }
        
        return i;
    }
}
