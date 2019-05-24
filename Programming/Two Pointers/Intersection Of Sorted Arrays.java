public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) < B.get(j))
                i++;
            else if (B.get(j) < A.get(i))
                j++;
            else {
                list.add(B.get(j++));
                i++;
            }
        }
        return list;
    }
}