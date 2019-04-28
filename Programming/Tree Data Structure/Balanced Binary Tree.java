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
    static int height(TreeNode A) { 
        if (A == null) 
            return 0; 
   
        return 1 + Math.max(height(A.left), height(A.right)); 
    } 
    public int isBalanced(TreeNode A) {
        if(A == null) {
            return 1;
        }
        
        int lh = height(A.left); 
        int rh = height(A.right); 
        
        if (Math.abs(lh - rh) <= 1 && isBalanced(A.left) == 1 && isBalanced(A.right) == 1)  
            return 1; 
            
        return 0;
    }
        
}
