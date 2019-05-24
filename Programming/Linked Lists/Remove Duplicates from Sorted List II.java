/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ListNode curr = A;
        while (curr != null) {
            if (hashMap.containsKey(curr.val)) {
                int val = hashMap.get(curr.val);
                hashMap.put(curr.val, ++val);
            } else {
                hashMap.put(curr.val, 1);
            }
            curr = curr.next;
        }
        ListNode temp = new ListNode(0);
        ListNode node = temp;
        Map<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(hashMap);
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (entry.getValue() == 1) {
                node.next = new ListNode(entry.getKey());
                node = node.next;
            }
        }

        return temp.next;
    }
}
