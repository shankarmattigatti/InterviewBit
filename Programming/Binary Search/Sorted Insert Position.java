public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int low = 0, high = a.size() - 1, mid = 0;
        boolean pos = false;
        while(low <= high) {
            mid = (low + high) / 2;
            if(a.get(mid) == b) {
                return mid;
            } else if(b < a.get(mid)){
                high = mid - 1;
                pos = false;
            } else {
                low = mid + 1;
                pos = true;
            }
        }
        return pos == true ? ++mid : mid;
    }
}
