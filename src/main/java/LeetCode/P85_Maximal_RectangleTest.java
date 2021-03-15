package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P85_Maximal_RectangleTest {
    P85_Maximal_Rectangle p85 = new P85_Maximal_Rectangle();
    @Test
    void test1(){
        char[][] input = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int output = 6;
        assertEquals(output,p85.maximalRectangle(input));
    }

    @Test
    void test2(){
        char[][] input = {{'0'}};
        int output = 0;
        assertEquals(output,p85.maximalRectangle(input));
    }

    @Test
    void test3(){
        char[][] input = {{'1'}};
        int output = 1;
        assertEquals(output,p85.maximalRectangle(input));
    }

    @Test
    void test4(){
        char[][] input = {{'0','0'}};
        int output = 0;
        assertEquals(output,p85.maximalRectangle(input));
    }
}