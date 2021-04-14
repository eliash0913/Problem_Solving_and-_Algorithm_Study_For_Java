package LeetCode;

import java.sql.SQLOutput;

public class P543_Diameter_Of_Binary_Tree {
    private int depth;
    public int diameterOfBinaryTree(TreeNode root) {
        depth = 0;
        longestPath(root);
        return depth;
    }

    int longestPath(TreeNode head){
        if(head == null)
            return 0;
        int leftLength = longestPath(head.left);
        int rightLength = longestPath(head.right);
        depth = depth > leftLength + rightLength ? depth : leftLength+rightLength;
        return leftLength > rightLength ? leftLength+1 : rightLength+1;
    }
}
