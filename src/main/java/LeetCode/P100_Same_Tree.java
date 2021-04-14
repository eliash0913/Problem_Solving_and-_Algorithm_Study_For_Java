package LeetCode;

public class P100_Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        if(p==null || q==null || p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

//    private boolean isSameTree = true;
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p==null && q==null)
//            return true;
//        else if(p==null || q==null)
//            return false;
//        isSameNodes(p,q);
//        return isSameTree;
//    }
//
//    void isSameNodes(TreeNode p, TreeNode q){
//            if(p.left!=null && q.left!=null)
//                isSameNodes(p.left, q.left);
//            if(p.right!=null && q.right!=null)
//                isSameNodes(p.right,q.right);
//            if((p.left==null && q.left!=null)||(p.left!=null && q.left==null))
//                isSameTree=false;
//            if((p.right==null && q.right!=null)||(p.right!=null && q.right==null))
//                isSameTree=false;
//            if(p.val!=q.val)
//                isSameTree=false;
//    }
}
