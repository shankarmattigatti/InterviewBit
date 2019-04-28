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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        if(A == null)
            return null;
            
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while (A != null || !stack.isEmpty()) {
            if(A != null) {
                stack.add(A);
                A = A.left;
            } else {
                TreeNode temp = stack.peek().right;   
                if(temp == null) {
                    temp = stack.pop();
                    list.add(temp.val);
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        list.add(temp.val);
                    }
                } else {
                    A = temp;
                }
            }
        }
        return list;
    }
}
