public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int i, k = 0, l = 0, c = A, r = A;
        int j = 1;
        for (i = 0;i < A; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(Collections.nCopies(A, 0));
            list.add(temp);
        }

        while (k < r && l < c || j < A * A) {
            for (i = l; i < c; i++) {
                list.get(k).set(i, j++);
            }
            k++;

            for (i = k; i < r; i++) {
                list.get(i).set(c - 1, j++);
            }
            c--;

            if (k < r) {
                for (i = c - 1; i >= l; i--) {
                    list.get(r - 1).set(i, j++);
                }
                r--;
            }

            if (l < c) {
                for (i = r - 1; i >= k; i--) {
                    list.get(i).set(l, j++);
                }
                l++;
            }
        }
        
        return list;
    }
}
