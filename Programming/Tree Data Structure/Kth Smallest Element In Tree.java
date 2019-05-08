/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int kthsmallest(TreeNode A, int B) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        while(A != null || !stack.isEmpty()) {
            while(A != null) {
                stack.push(A);
                A = A.left;
            }
            A = stack.pop();
            list.add(A.val);
            
            A = A.right;
        }
        
        Collections.sort(list);
        return list.get(B - 1);
    }
}
