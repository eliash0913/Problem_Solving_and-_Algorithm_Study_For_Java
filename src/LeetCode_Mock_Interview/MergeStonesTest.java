package LeetCode_Mock_Interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStonesTest {
    MergeStones ms = new MergeStones();

    @Test
    void test1() {
        int[] sample1 = {3,2,4,1};
        int result = ms.mergeStones(sample1, 2);

        assertEquals(20, result);
    }

    @Test
    void test2() {
        int[] sample1 = {3,2,4,1};
        int result = ms.mergeStones(sample1, 3);

        assertEquals(-1, result);
    }

    @Test
    void test3() {
        int[] sample1 = {3,5,1,2,6};
        int result = ms.mergeStones(sample1, 3);

        assertEquals(25, result);
    }

    @Test
    void test4() {
        int[] sample1 = {3,7,2,3};
        int result = ms.mergeStones(sample1, 2);

        assertEquals(30, result);
    }

    @Test
    void test5() {
        int[] sample1 = {6,4,4,6};
        int result = ms.mergeStones(sample1, 2);

        assertEquals(40, result);
    }
}