package Random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressedArrayTest {
    CompressedArray ca;
    @Test
    void test1(){
        Integer[] input = new Integer[]{3,1,4,2,2,3,1,1};
        Integer[] expectedOutput = {3,4,4,2,2,2,1};
        Integer[] actualOutput = new Integer[expectedOutput.length];
        ca = new CompressedArray(input);
        int index = 0;
        while(ca.hasNext()){
            actualOutput[index++]=ca.next();
        }
        assertArrayEquals(expectedOutput,actualOutput);
    }

    @Test
    void test2(){
        Integer[] input = new Integer[]{5,2,4,3,5,1,2,2};
        Integer[] expectedOutput = {5,5,4,4,4,5,2,2};
        Integer[] actualOutput = new Integer[expectedOutput.length];
        ca = new CompressedArray(input);
        int index = 0;
        while(ca.hasNext()){
            actualOutput[index++]=ca.next();
        }
        assertArrayEquals(expectedOutput,actualOutput);
    }
}