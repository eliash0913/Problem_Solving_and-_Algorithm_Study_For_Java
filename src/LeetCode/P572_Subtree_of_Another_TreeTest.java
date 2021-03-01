package LeetCode;

import org.junit.jupiter.api.Test;
import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class P572_Subtree_of_Another_TreeTest {
    P572_Subtree_of_Another_Tree p572 = new P572_Subtree_of_Another_Tree();

    @Test
    void test1(){
        TreeNode t1 = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode t2 = new TreeNode(4,new TreeNode(1) , new TreeNode(2));
        assertTrue(p572.isSubtree(t1, t2));
    }

    @Test
    void test2(){
        TreeNode t1 = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2,new TreeNode(0), null)), new TreeNode(5));
        TreeNode t2 = new TreeNode(4,new TreeNode(1) , new TreeNode(2));
        assertFalse(p572.isSubtree(t1, t2));
    }

    @Test
    void test3(){
        TreeNode t1 = new TreeNode(4,new TreeNode(1) , new TreeNode(2));
        TreeNode t2 = new TreeNode(4,new TreeNode(1) , new TreeNode(2));
        assertTrue(p572.isSubtree(t1, t2));
    }

    @Test
    void test4(){
        TreeNode t1 = new TreeNode(1,new TreeNode(2,new TreeNode(4) , new TreeNode(5)) , new TreeNode(3,new TreeNode(6) , new TreeNode(7)));
        TreeNode t2 = new TreeNode(2,new TreeNode(4) , new TreeNode(5));
        assertTrue(p572.isSubtree(t1, t2));
    }

    @Test
    void test5(){
        TreeNode t1 = new TreeNode(3,new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode t2 = new TreeNode(4,new TreeNode(1,new TreeNode(1),null) , new TreeNode(2));
        assertFalse(p572.isSubtree(t1, t2));
    }

    @Test
    void test6(){
        TreeNode t1 = new TreeNode(1,new TreeNode(1),null);
        TreeNode t2 = new TreeNode(1);
        assertTrue(p572.isSubtree(t1, t2));
    }

    @Test
    void test7(){
        TreeNode t1 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode t2 = new TreeNode(1, new TreeNode(2),null);
        assertFalse(p572.isSubtree(t1, t2));
    }

    @Test
    void test8(){
        TreeNode t1 = new TreeNode(3,new TreeNode(4, null, new TreeNode(1)),new TreeNode(5,new TreeNode(2),null));
        TreeNode t2 = new TreeNode(3, new TreeNode(1),new TreeNode(2));
        assertFalse(p572.isSubtree(t1, t2));
    }

    @Test
    void test9(){
        TreeNode t1 = new TreeNode(12);
        TreeNode t2 = new TreeNode(2);
        assertFalse(p572.isSubtree(t1, t2));
    }

//    @Test
//    void test9(){
//        //Integer[] input = {29, 28,30,27,29,29,31,26,26,28,28,28,28,30,32,25,25,25,25,27,29,null,29,29,29,null,29,29,29,31,null,26,24,26,26,26,null,24,null,null,26,28,null,28,28,30,28,30,30,null,null,30,30,30,30,null,32,27,27,null,25,25,null,null,25,27,27,null,null,null,null,27,27,27,29,null,null,null,31,29,null,31,null,29,29,null,null,29,31,null,29,29,31,null,31,null,null,null,28,24,24,24,26,24,24,null,28,26,28,26,null,null,null,28,28,null,28,null,null,28,30,32,null,30,28,28,28,null,null,null,null,28,30,28,28,null,null,null,null,27,null,null,null,23,25,null,null,null,null,null,null,null,null,27,27,null,null,null,29,null,null,null,null,27,29,null,27,27,null,null,null,null,31,29,29,27,29,null,29,27,29,null,null,null,null,27,null,null,29,null,null,22,22,null,26,null,null,26,28,28,28,null,28,null,28,null,28,null,null,null,null,null,null,null,28,null,28,28,null,30,null,null,null,null,null,26,null,28,30,21,23,null,null,null,25,null,27,null,null,null,null,27,29,27,29,27,27,null,null,null,null,29,null,27,null,null,null,25,27,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,28,null,null,null,null,null,null,null,null,26,null,null,24,null,28,null,null,null,null,null,23};
//        Integer[] input = {1,2,3,4,5,6};
//        Queue<Integer> queue = new LinkedList<>(Arrays.asList(input));
//        TreeNode head = new TreeNode(queue.poll());
//        addNode(head, queue);
//
//        System.out.println(head.val);
//        System.out.println(head.left.val);
//        System.out.println(head.right.val);
//        System.out.println(head.left.left.val);
//        System.out.println(head.left.right.val);
//        System.out.println(head.right.left.val);
//        System.out.println(head.right.right.val);
//    }
//
//    void addNode(TreeNode tn , Queue<Integer> input){
//        if(input.size()!=0) {
//            Integer value = input.poll();
//            if (value != null) {
//                tn.left = new TreeNode(value);
//            }
//        }
//
//        if(input.size()!=0) {
//            Integer value = input.poll();
//            if (value != null) {
//                tn.right = new TreeNode(value);
//            }
//        }
//        addNode(tn.left, input);
//        addNode(tn.right, input);
//        }
}

