package com.leet.www;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class CompareTrees {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    ArrayList<Integer> list3 = new ArrayList<Integer>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null)
            return true;
        else if(p==null && q!=null || p!=null && q==null )
            return false;
        else
        {
            //only if both are not null
            //perform an inorder traversal on both
            int notNumber = -9999;
            
            getInOrder(p);
            list1.add(-9999);
            getInOrder(q);
            System.out.println(list1);
            //now iterate until you reach -9999
            Iterator<Integer> it1 = list1.iterator();
            Iterator<Integer> it2 = list2.iterator();
            boolean isEqual = false;
            while(it1.hasNext())
            {
                Integer x = it1.next();
                if(x != -9999)
                    {
                        list2.add(x);
                        it1.remove();
                    }
                else
                    break;
            }
            it1.remove();
            System.out.println(list1);
            System.out.println(list2);
            while(it1.hasNext() && it2.hasNext())
            {
                if(it1.next() != it2.next())
                    return false;
            }
            return true;
        }
    }
    
    public void getInOrder(TreeNode a)
    {
        if(a.left != null)
            getInOrder(a.left);
        System.out.println(a.val);
        list1.add(a.val);
        //return Integer.toString(a.val)+"+";
        if(a.right != null)
            getInOrder(a.right);
    }
    
    //////////////////////////////////////////
    public class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            return p != null && q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } }
    //////////////////////////////////////////
}

