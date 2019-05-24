public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        if(a.size() == 0)
            return a.size();
            
        int[] temp = new int[a.size()];
        int j = 0;
        for(int i = 0; i < a.size() - 1; i++) {
            int x = a.get(i);
            int y = a.get(i + 1);
            if (x != y)
                temp[j++] = a.get(i);
        }
        
        temp[j++] = a.get(a.size() - 1);
        
        for(int i = 0; i < j; i++) 
            a.add(i, temp[i]);
            
        return j;
    }
}
