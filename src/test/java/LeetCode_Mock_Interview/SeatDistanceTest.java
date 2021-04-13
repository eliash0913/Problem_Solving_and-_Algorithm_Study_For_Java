package LeetCode_Mock_Interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatDistanceTest {
    SeatDistance sd = new SeatDistance();
    @Test
    void test1(){
        int[] input =  {1,0,0,0,1,0,1};
        int output = 2;
        assertEquals(output,sd.maxDistToClosest(input));
    }

    @Test
    void test2(){
        int[] input =  {1,0,0,0};
        int output = 3;
        assertEquals(output,sd.maxDistToClosest(input));
    }

    @Test
    void test3(){
        int[] input =  {1,0,1};
        int output = 1;
        assertEquals(output,sd.maxDistToClosest(input));
    }
}