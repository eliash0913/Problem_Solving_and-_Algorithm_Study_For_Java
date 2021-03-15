package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P346_Moving_Average_From_Data_StreamTest {
    P346_Moving_Average_From_Data_Stream p346 = new P346_Moving_Average_From_Data_Stream();
    @Test
    void test1(){
        String[] cmds = {"MovingAverage", "next", "next", "next", "next"};
        int[] vals = {3, 1, 10, 3, 5};
        assertIterableEquals(new ArrayList<Double>(Arrays.asList(null, 1.0, 5.5, 4.66667, 6.0)), p346.movingAverage(cmds,vals));
    }
}