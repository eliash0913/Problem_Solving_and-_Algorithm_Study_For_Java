package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P67_Add_BinaryTest {
    P67_Add_Binary p67 = new P67_Add_Binary();
    @Test
    void test1(){
        String input1 = "11";
        String input2 = "1";
        String output = "100";
        assertEquals(output,p67.addBinary(input1,input2));
    }

    @Test
    void test2(){
        String input1 = "1010";
        String input2 = "1011";
        String output = "10101";
        assertEquals(output,p67.addBinary(input1,input2));
    }


    @Test
    void test3(){
        String input1 = "101111";
        String input2 = "10";
        String output = "110001";
        assertEquals(output,p67.addBinary(input1,input2));
    }
}