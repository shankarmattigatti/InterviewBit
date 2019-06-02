public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int n = A * 2 - 1;
        int k = n;
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(Collections.nCopies(k, 0));
            ls.add(temp);
        }
        for (int i = 0; i < k && A > 0; i++, A--, n--) {

            for (int j = i; j < n; j++) {
                ls.get(i).set(j, A);
            }

            for (int j = i; j < n; j++) {
                ls.get(j).set(n - 1, A);
            }

            for (int j = i; j < n; j++) {
                ls.get(j).set(i, A);
            }

            for (int j = i; j < n; j++) {
                ls.get(n - 1).set(j, A);
            }
        }
        return ls;
    }
}
