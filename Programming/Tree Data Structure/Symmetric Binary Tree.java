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
    static boolean isMirror(TreeNode a, TreeNode b) {
        if(a == null && b == null)
            return true;
            
        if(a != null && b != null && a.val == b.val)
            return isMirror(a.left, b.right)
                && isMirror(a.right, b.left);
            
        return false;
    }
    public int isSymmetric(TreeNode A) {
        if(isMirror(A, A)) {
            return 1;
        } else {
            return 0;
        }
    }
}
