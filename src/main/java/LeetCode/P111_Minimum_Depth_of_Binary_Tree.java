package LeetCode;

public class P111_Minimum_Depth_of_Binary_Tree {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left+right+1 : (left<right ? left : right) + 1;

    }
//    public int minDepth(TreeNode root) {
//        int left = 1;
//        int right = 1;
//        if(root==null) {
//            return 0;
//        }
//        if(root.left!=null){
//            left = Math.max(minDepth(root.left),left)+1;
//        }
//        if(root.right!=null){
//            right = Math.max(minDepth(root.right),right)+1;
//        }
//        int depth = left==1 || right==1 ? (left>right ? left : right) : (left<right?left:right);
//        return depth;
//    }
}
