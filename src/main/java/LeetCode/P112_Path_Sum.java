package LeetCode;

public class P112_Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        int sum = targetSum - root.val;
        if(sum==0 && root.left == null && root.right == null)
            return true;
        else
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
