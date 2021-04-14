package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P83_Remove_Duplicates_From_Sorted_ListTest {
    P83_Remove_Duplicates_From_Sorted_List p83 = new P83_Remove_Duplicates_From_Sorted_List();
    @Test
    void test1(){
        int[] input = {1,1,2,3,3};
        ListNode head = TestHelper.GenerateListNodeFromArray(input);
        Integer[] expected = {1,2,3};
        Integer[] actual = TestHelper.GenerateArrayFromListNodes(p83.deleteDuplicates(head));
        assertArrayEquals(expected,actual);
    }

    @Test
    void test2(){
        int[] input = {1,1,2,3,3,4,5,5,5,6,7,8,9};
        ListNode head = TestHelper.GenerateListNodeFromArray(input);
        Integer[] expected = {1,2,3,4,5,6,7,8,9};
        Integer[] actual = TestHelper.GenerateArrayFromListNodes(p83.deleteDuplicates(head));
        assertArrayEquals(expected,actual);
    }


    @Test
    void test3(){
        int[] input = {};
        ListNode head = TestHelper.GenerateListNodeFromArray(input);
        Integer[] expected = {};
        Integer[] actual = TestHelper.GenerateArrayFromListNodes(p83.deleteDuplicates(head));
        assertArrayEquals(expected,actual);
    }
}