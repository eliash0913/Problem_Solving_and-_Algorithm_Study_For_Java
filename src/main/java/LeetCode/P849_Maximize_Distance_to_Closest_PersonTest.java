package LeetCode;

import LeetCode_Mock_Interview.SeatDistance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P849_Maximize_Distance_to_Closest_PersonTest {
    P849_Maximize_Distance_to_Closest_Person p849 = new P849_Maximize_Distance_to_Closest_Person();
    @Test
    void test1(){
        int[] input =  {1,0,0,0,1,0,1};
        int output = 2;
        assertEquals(output,p849.maxDistToClosest(input));
    }

    @Test
    void test2(){
        int[] input =  {1,0,0,0};
        int output = 3;
        assertEquals(output,p849.maxDistToClosest(input));
    }

    @Test
    void test3(){
        int[] input =  {1,0,1};
        int output = 1;
        assertEquals(output,p849.maxDistToClosest(input));
    }

    @Test
    void test4(){
        int[] input =  {0,1,0,1,0};
        int output = 1;
        assertEquals(output,p849.maxDistToClosest(input));
    }

    @Test
    void test5(){
        int[] input =  {0,0,0,1};
        int output = 3;
        assertEquals(output,p849.maxDistToClosest(input));
    }

    @Test
    void test6(){
        int[] input =  {1,0,0,1,1};
        int output = 1;
        assertEquals(output,p849.maxDistToClosest(input));
    }

    @Test
    void test7(){
        int[] input =  {1,1,1,0,1,0,1,1,0,0,1};
        int output = 1;
        assertEquals(output,p849.maxDistToClosest(input));
    }

    @Test
    void test8(){
        int[] input =  {1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1};
        int output = 4;
        assertEquals(output,p849.maxDistToClosest(input));
    }
}