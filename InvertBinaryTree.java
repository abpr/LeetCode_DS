package com.leet.www;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        //if there is no children leave as it is
        
        
        if(root == null)
            return null;
        else{
            if(root.left == null && root.right == null)
                return root;
            else{
                
                TreeNode temp = new TreeNode(0);
                //4 cases
                //either with one left node
                //one right node
                //both nodes
                //no nodes handled
                
                //case 1 - only left node
                if(root.left != null && root.right == null)
                {
                    //take the left node and put it on right..thats it
                    root.right = root.left;
                    root.left = null;
                    invertTree(root.right);
                }
                
                //only right node
                else if(root.left == null && root.right != null)
                {
                    root.left = root.right;
                    root.right = null;
                    invertTree(root.left);
                }
                
                //both nodes
                else if(root.left != null && root.left != null)
                {
                    temp = root.left;
                    root.left = root.right;
                    root.right = temp;
                    invertTree(root.left);
                    invertTree(root.right);
                }
                    
            }
            return root;
        }
    }
}