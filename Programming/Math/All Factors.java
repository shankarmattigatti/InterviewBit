public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int  i = 1; i <= (int)(Math.sqrt(A)); i++) {
            if(A % i == 0) {
                list.add(i);
                if(i != A / i)
                    list.add(A/i);
            }
        }
        Collections.sort(list);
        return list;
    }
}

