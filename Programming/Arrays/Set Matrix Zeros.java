public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int[] rows = new int[a.size()];
        int[] cols = new int[a.get(0).size()];

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {
                if(a.get(i).get(j) == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {
                if(rows[i] == 1 || cols[j] == 1) {
                    a.get(i).set(j, 0);
                }
            }
        }
    }
}
