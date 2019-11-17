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
    private int i = 0;
    
    public TreeNode buildTree(int[] A, int[] B) {
        int pStart = 0;
        int pEnd = A.length - 1;
        int iStart = 0;
        int iEnd = B.length - 1;
        
        return buildTree(A, pStart, pEnd, B, iStart, iEnd);
    }
    
    private TreeNode buildTree(int[] A, int pStart, int pEnd, int[] B, int iStart, int iEnd) {
        if(pStart > pEnd || iStart > iEnd)
            return null;
            
        int val = A[pStart];
        TreeNode node = new TreeNode(val);
        
        int k = 0;
        for(int i = 0;i < B.length; i++) {
            if(val == B[i]) {
                k = i;
                break;
            }
        }
        
        node.left = buildTree(A, pStart + 1, pStart + (k - iStart), B, iStart, k - 1);
        node.right = buildTree(A, pStart + (k - iStart) + 1, pEnd, B, k + 1,  iEnd);
        
        return node;
    }
}
