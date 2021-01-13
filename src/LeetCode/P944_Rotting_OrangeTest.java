package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P944_Rotting_OrangeTest {
    P944_Rotting_Orange p944 = new P944_Rotting_Orange();

    @Test
    void orangesRotting1() {
        int[][] sample1 = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(p944.orangesRotting(sample1), 4);
    }

    @Test
    void orangesRotting2() {
        int[][] sample2 = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertEquals(p944.orangesRotting(sample2), -1);
    }

    @Test
    void orangesRotting3() {
        int[][] sample3 = new int[][]{{0,2}};
        assertEquals(p944.orangesRotting(sample3), 0);
    }

    @Test
    void orangesRotting4() {
        int[][] sample3 = new int[][]{{0}};
        assertEquals(p944.orangesRotting(sample3), 0);
    }

    @Test
    void orangesRotting1_2() {
        int[][] sample1 = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(p944.orangesRotting2(sample1), 4);
    }

    @Test
    void orangesRotting2_2() {
        int[][] sample2 = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertEquals(p944.orangesRotting2(sample2), -1);
    }

    @Test
    void orangesRotting3_2() {
        int[][] sample3 = new int[][]{{0,2}};
        assertEquals(p944.orangesRotting2(sample3), 0);
    }

    @Test
    void orangesRotting4_2() {
        int[][] sample4 = new int[][]{{0}};
        assertEquals(p944.orangesRotting2(sample4), 0);
    }
}