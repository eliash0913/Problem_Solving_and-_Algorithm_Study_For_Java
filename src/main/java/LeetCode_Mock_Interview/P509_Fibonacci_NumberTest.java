package LeetCode_Mock_Interview;

import LeetCode.P509_Fibonacci_Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P509_Fibonacci_NumberTest {
    P509_Fibonacci_Number p509 = new P509_Fibonacci_Number();
    @Test
    void test1(){
        int input = 2;
        int output = 1;
        assertEquals(output, p509.fib(input));
    }

    @Test
    void test2(){
        int input = 3;
        int output = 2;
        assertEquals(output, p509.fib(input));
    }

    @Test
    void test3(){
        int input = 4;
        int output = 3;
        assertEquals(output, p509.fib(input));
    }
}