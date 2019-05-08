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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A == null)
            return list;
            
        Stack<TreeNode> stack = new Stack<>();
        while(A != null || !stack.isEmpty()) {
            while(A != null) {
                stack.push(A);
                A = A.left;
            }
            
            A = stack.pop();
            list.add(A.val);
            
            A = A.right;
        }
        return list;
    }
}
