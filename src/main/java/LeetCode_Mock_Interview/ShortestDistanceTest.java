package LeetCode_Mock_Interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestDistanceTest {
    ShortestDistance sd = new ShortestDistance();

    @Test
    void ShortestDistanceTest1() {
        int[][] sample1 = new int[][] {
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,1,0},
                {1,1,0,1,1},
                {0,0,0,0,0}};
        int[] start = {0,4};
        int[] dest = {4,4};

        int result = sd.shortestDistance(sample1, start, dest);

        assertEquals(7, result);
    }

}