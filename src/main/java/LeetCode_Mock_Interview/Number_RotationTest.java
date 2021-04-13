package LeetCode_Mock_Interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Number_RotationTest {
    Number_Rotation nr = new Number_Rotation();
    @Test
    void test1(){
        int input = 10;
        int output = 4;
        assertEquals(output, nr.rotatedDigits(input));
    }

    @Test
    void test2(){
        int input = 20;
        int output = 9;
        assertEquals(output, nr.rotatedDigits(input));
    }

    @Test
    void test3(){
        int input = 857;
        int output = 247;
        assertEquals(output, nr.rotatedDigits(input));
    }
}