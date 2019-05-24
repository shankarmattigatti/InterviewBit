public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.size() && j < b.size()) {
            if(a.get(i) < b.get(j)) {
                list.add(a.get(i));
                i++;
            } else {
                list.add(b.get(j));
                j++;
            }
        }
        while(i < a.size()) {
            list.add(a.get(i));
            i++;
        }
        while(j < b.size()) {
            list.add(b.get(j));
            j++;
        }
        
        a.clear();
        for(int k = 0; k < list.size(); k++) {
            int val = list.get(k);
            a.add(val);
        }
    }
}
