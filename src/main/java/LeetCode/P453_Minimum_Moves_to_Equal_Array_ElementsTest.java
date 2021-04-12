package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class P453_Minimum_Moves_to_Equal_Array_ElementsTest {
    P453_Minimum_Moves_to_Equal_Array_Elements p453 = new P453_Minimum_Moves_to_Equal_Array_Elements();
    @Test
    void test1(){
        int[] input = {1,2,3};
        int output = 3;
        assertEquals(output, p453.minMoves(input));
    }
}