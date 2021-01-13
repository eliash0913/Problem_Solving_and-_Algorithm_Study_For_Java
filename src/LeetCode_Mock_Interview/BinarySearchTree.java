package LeetCode_Mock_Interview;
//TODO: UNDONE
public class BinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(isValidBSTHelper(root)){
            if(root.left == null && root.right == null)
                return true;
            if(root.left != null && root.right != null) {
                if(isValidBST(root.left) && isValidBST(root.right))
                    return true;
            } else if (root.left != null) {
                if(isValidBST(root.left))
                    return true;
            } else if (root.right != null) {
                if(isValidBST(root.right))
                    return true;
            }
        }
        return false;
    }

    public boolean isValidBSTHelper(TreeNode root) {
        if(root.left == null && root.right == null) {
            return true;
        } else if(root.left != null && root.right != null) {
            if(root.left.val < root.val && root.right.val > root.val) {
                return true;
            }
        } else if(root.left!=null) {
            if(root.left.val < root.val) {
                return true;
            }
        } else if(root.right!=null) {
            if(root.right.val > root.val) {
                return true;
            }
        }
        return false;
    }
}

//        if(root==null)
//            return true;
//        if(root.left!=null) {
//            if(root.left.val < root.val) {
//                if(!isValidBST(root.left))
//                    return false;
//            } else {
//                return false;
//            }
//        }
//        if(root.right!=null) {
//            if(root.right.val > root.val) {
//                if(!isValidBST(root.right))
//                    return false;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//}


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
