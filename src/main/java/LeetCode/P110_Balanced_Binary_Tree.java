package LeetCode;

public class P110_Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.abs(left-right) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    int depth(TreeNode node){
        if(node==null)
            return 0;
        return 1+Math.max(depth(node.left), depth(node.right));
    }
}
