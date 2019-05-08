public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (hashMap.containsKey(A.get(i))) {
                int val = hashMap.get(A.get(i));
                hashMap.put(A.get(i), ++val);
            } else {
                hashMap.put(A.get(i), 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
