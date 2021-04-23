package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P119_Pascals_Triangle_IITest {
    P119_Pascals_Triangle_II p119 = new P119_Pascals_Triangle_II();
    @Test
    void test1(){
        int numRows = 3;
        List<Integer> expected = new ArrayList<>();
        Integer[] arr = {1,3,3,1};
        expected.addAll(Arrays.asList(arr));
        assertIterableEquals(expected, p119.getRow(numRows));
    }

    @Test
    void test2(){
        int numRows = 0;
        List<Integer> expected = new ArrayList<>();
        Integer[] arr = {1};
        expected.addAll(Arrays.asList(arr));
        assertIterableEquals(expected, p119.getRow(numRows));
    }

    @Test
    void test3(){
        int numRows = 1;
        List<Integer> expected = new ArrayList<>();
        Integer[] arr = {1,1};
        expected.addAll(Arrays.asList(arr));
        assertIterableEquals(expected, p119.getRow(numRows));
    }
}