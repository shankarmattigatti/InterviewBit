public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(firstOccurrence(a, b));
        list.add(lastOccurrence(a, b));
        return list;
    }
    
    private static int firstOccurrence(List<Integer> a, int b) {
        int low = 0, high = a.size() - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (b == a.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (b < a.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return result;
    }

    private static int lastOccurrence(List<Integer> a, int b) {
        int low = 0, high = a.size() - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (b == a.get(mid)) {
                result = mid;
                low = mid + 1;
            } else if (b < a.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return result;
    }
}
