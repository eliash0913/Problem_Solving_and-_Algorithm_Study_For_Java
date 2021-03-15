package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P695_Max_Area_Of_IslandTest {
    P695_Max_Area_Of_Island p695 = new P695_Max_Area_Of_Island();
    @Test
    void test1(){
        int[][] input = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int output = 6;
        assertEquals(output,p695.maxAreaOfIsland(input));
    }

    @Test
    void test2(){
        int[][] input = {{0,0,0,0,0,0,0,0,0}};
        int output = 0;
        assertEquals(output,p695.maxAreaOfIsland(input));
    }  
    
    @Test
    void test3(){
        int[][] input = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        int output = 4;
        assertEquals(output,p695.maxAreaOfIsland(input));
    }
}