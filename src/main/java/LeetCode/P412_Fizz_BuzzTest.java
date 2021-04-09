package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P412_Fizz_BuzzTest {
    P412_Fizz_Buzz p412 = new P412_Fizz_Buzz();

    @Test
    void test1(){
        int input = 3;
        String[] output = {"1","2","Fizz"};
        assertArrayEquals(output, p412.fizzBuzz(input).toArray());
    }


    @Test
    void test2(){
        int input = 5;
        String[] output = {"1","2","Fizz","4","Buzz"};
        assertArrayEquals(output, p412.fizzBuzz(input).toArray());
    }


    @Test
    void test3(){
        int input = 15;
        String[] output = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
        assertArrayEquals(output, p412.fizzBuzz(input).toArray());
    }
}