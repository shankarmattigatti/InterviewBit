public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A == null || A.size() == 0)
            return list;
        
        int i, k = 0, l = 0, c = A.get(0).size(), r = A.size();

        while (k < r && l < c) {
            for (i = l; i < c; i++) {
                list.add(A.get(k).get(i));
            }
            k++;

            for (i = k; i < r; i++) {
                list.add(A.get(i).get(c - 1));
            }
            c--;

            if (k < r) {
                for (i = c - 1; i >= l; i--) {
                    list.add(A.get(r - 1).get(i));
                }
                r--;
            }

            if (l < c) {
                for (i = r - 1; i >= k; i--) {
                    list.add(A.get(i).get(l));
                }
                l++;
            }
        }
        return list;
    }
}
