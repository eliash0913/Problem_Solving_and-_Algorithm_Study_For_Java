package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P203_Remove_Linked_List_ElementsTest {
    P203_Remove_Linked_List_Elements p203 = new P203_Remove_Linked_List_Elements();
    @Test
    void test0(){
        int[] nodeValues = {1,2,3,4,5,6,7};
        int input = 2;
        Integer[] expected = {1,3,4,5,6,7};
        ListNode head = TestHelper.GenerateListNodeFromArray(nodeValues);
        Integer[] actual =  TestHelper.GenerateArrayFromListNodes(p203.removeElements(head,input));
        assertArrayEquals(expected,actual);
    }

    @Test
    void test1(){
        int[] nodeValues = {1,2,6,3,4,5,6};
        int input = 6;
        Integer[] expected = {1,2,3,4,5};
        ListNode head = TestHelper.GenerateListNodeFromArray(nodeValues);
        Integer[] actual =  TestHelper.GenerateArrayFromListNodes(p203.removeElements(head,input));
        assertArrayEquals(expected,actual);
    }

    @Test
    void test2(){
        int[] nodeValues = {};
        int input = 1;
        Integer[] expected = {};
        ListNode head = TestHelper.GenerateListNodeFromArray(nodeValues);
        Integer[] actual =  TestHelper.GenerateArrayFromListNodes(p203.removeElements(head,input));
        assertArrayEquals(expected,actual);
    }

    @Test
    void test3(){
        int[] nodeValues = {7,7,7,7};
        int input = 7;
        Integer[] expected = {};
        ListNode head = TestHelper.GenerateListNodeFromArray(nodeValues);
        Integer[] actual =  TestHelper.GenerateArrayFromListNodes(p203.removeElements(head,input));
        assertArrayEquals(expected,actual);
    }


}