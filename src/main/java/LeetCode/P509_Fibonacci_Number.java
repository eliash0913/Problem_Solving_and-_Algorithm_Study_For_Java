package LeetCode;

import org.junit.jupiter.api.Test;

public class P509_Fibonacci_Number {
    //Dynamic Programming
    public int fib(int n) {
        if(n<2)
            return n;
        int[] memory = new int[3];
        memory[1] = 1;
        memory[2] = 1;
        for(int i = 3; i <= n; i++){
            memory[0] = memory[1];
            memory[1] = memory[2];
            memory[2] = memory[0] + memory[1];
        }
        return memory[2];
    }

//    //Recursive
//    public int fib(int n) {
//        if(n < 2)
//            return n;
//        return fib(n-2) + fib(n-1);
//    }
}
