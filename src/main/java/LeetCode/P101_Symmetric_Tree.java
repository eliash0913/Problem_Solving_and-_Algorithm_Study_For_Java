package LeetCode;

import java.util.ArrayList;

public class P101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        return isTheSame(root.left, root.right);
    }

    boolean isTheSame(TreeNode p, TreeNode q){
        if(p==null&&q==null)
            return true;
        if(p==null||q==null)
            return false;
        if(p.val==q.val)
            return isTheSame(p.left, q.right) && isTheSame(p.right, q.left);
        else
            return false;
    }
}
