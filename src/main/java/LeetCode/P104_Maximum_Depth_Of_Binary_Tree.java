package LeetCode;

public class P104_Maximum_Depth_Of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+(maxDepth(root.left)>maxDepth(root.right)?maxDepth(root.left):maxDepth(root.right));
    }

//    public int maxDepth(TreeNode root) {
//        if(root == null) {
//            return 0;
//        }
//        int leftDepth = 1;
//        int rightDepth = 1;
//        if(root.left!=null) {
//            leftDepth+=maxDepth(root.left);
//        }
//        if(root.right!=null) {
//            rightDepth+=maxDepth(root.right);
//        }
//        return leftDepth>rightDepth?leftDepth:rightDepth;
//    }
}
