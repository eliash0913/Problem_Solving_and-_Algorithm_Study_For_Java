package LeetCode_Mock_Interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BinarySearchTreeTest {
    BinarySearchTree bst = new BinarySearchTree();

    @Test
    void isValidBST1() {
        TreeNode tn = new TreeNode(2);
        tn.left = new TreeNode(1);
        tn.right = new TreeNode(3);
        assertEquals(true, bst.isValidBST(tn));
    }

    @Test
    void isValidBST2() {
        TreeNode tn = new TreeNode(5);
        tn.left = new TreeNode(1);
        tn.right = new TreeNode(4);
        tn.left.left = new TreeNode(3);
        tn.left.right = new TreeNode(6);
        assertEquals(false, bst.isValidBST(tn));
    }

    @Test
    void isValidBST3() {
        TreeNode tn = new TreeNode(2);
        tn.left = new TreeNode(1);
        tn.right = new TreeNode(3);
        tn.left.left = new TreeNode(5);
        tn.left.right = new TreeNode(6);
        assertEquals(false, bst.isValidBST(tn));
    }

    @Test
    void isValidBST4() {
        TreeNode tn = new TreeNode(5);
        tn.left = new TreeNode(1);
        tn.right = new TreeNode(6);
        tn.right.left = new TreeNode(3);
        tn.right.right = new TreeNode(7);
        assertEquals(true, bst.isValidBST(tn));
    }

    @Test
    void isValidBST5() {
        TreeNode tn = new TreeNode(10);
        tn.left = new TreeNode(5);
        tn.right = new TreeNode(15);
        tn.right.left = new TreeNode(6);
        tn.right.right = new TreeNode(20);
        assertEquals(false, bst.isValidBST(tn));
    }
}