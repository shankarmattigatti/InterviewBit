public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = a.get(first).get(i);

                a.get(first).set(i, a.get(last - offset).get(first));

                a.get(last - offset).set(first, a.get(last).get(last - offset));

                a.get(last).set(last - offset, a.get(i).get(last));
                
                a.get(i).set(last, top);
            }
        }
    }
}
