package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P118_Pascals_TriangleTest {
    P118_Pascals_Triangle p118 = new P118_Pascals_Triangle();
    @Test
    void test1(){
        int numRows = 5;
        List<List<Integer>> expected = new ArrayList<>();
        Integer[][] arr = {{1}, {1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        int row = 0;
        for(Integer[] sub : arr){
            expected.add(new ArrayList<>());
            for(Integer n : sub){
                expected.get(row).add(n);
            }
            row++;
        }
        assertIterableEquals(expected, p118.generate(numRows));
    }

    @Test
    void test2(){
        int numRows = 2;
        List<List<Integer>> expected = new ArrayList<>();
        Integer[][] arr = {{1}, {1,1}};
        int row = 0;
        for(Integer[] sub : arr){
            expected.add(new ArrayList<>());
            for(Integer n : sub){
                expected.get(row).add(n);
            }
            row++;
        }
        assertIterableEquals(expected, p118.generate(numRows));
    }
}