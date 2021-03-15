package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class P572_Subtree_of_Another_Tree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String tree1 = preOrder(s,true);
        String tree2 = preOrder(t, true);
        String[] t1Arr = tree1.split(" ");
        String[] t2Arr = tree2.split(" ");
        for(int i = 0; i < t1Arr.length - t2Arr.length + 1; i++){
            boolean flag = true;
            for(int j = 0; j < t2Arr.length; j++){
                if(!t1Arr[i+j].equalsIgnoreCase(t2Arr[j])){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return true;
        }
        return false;
    }

    String preOrder(TreeNode t, boolean left) {
        if(t==null) {
            if (left)
                return "lnull";
            else
                return "rnull";
        }
        return t.val + " " + preOrder(t.left, true) + " " + preOrder(t.right, false);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
