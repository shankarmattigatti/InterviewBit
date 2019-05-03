public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        for(int i = 0; i < a.size(); i++) {
            int low = 0, high = a.get(i).size() - 1;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(a.get(i).get(mid) == b) {
                    return 1;
                } else if(b < a.get(i).get(mid)) {
                    high = mid - 1;
                } else {
                    low  = mid + 1;
                }
            }
        }
        return 0;
    }
}
