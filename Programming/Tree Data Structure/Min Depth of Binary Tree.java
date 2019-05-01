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
    public int minDepth(TreeNode A) {
        if(A == null)
            return 0;
        
        int leftDepth = minDepth(A.left);
        int rightDepth = minDepth(A.right);
        if(leftDepth == 0) {
            return 1 + rightDepth;
        } else if(rightDepth == 0) {
            return 1 + leftDepth;
        }
        
        return (1 + Math.min(leftDepth, rightDepth));
    }
}
