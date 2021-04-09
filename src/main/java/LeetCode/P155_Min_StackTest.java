package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P155_Min_StackTest {
    P155_Min_Stack p155 = new P155_Min_Stack();
    @Test
    void test1(){
        String[] input1 = {"MinStack","push","push","push","getMin","pop","top","getMin"};
        Integer[][] input2 = {{},{-2},{0},{-3},{},{},{},{}};
        Integer[] actual = getExpected(input1,input2);
        Integer[] expected = {null,null,null,null,-3,null,0,-2};
        assertArrayEquals(expected,actual);
    }

    Integer[] getExpected(String[] input1, Integer[][] input2){
        Integer[] actual = new Integer[input1.length];
        actual[0]=null;
        for(int i = 1; i<input1.length; i++){
            String cmd = input1[i];
            if(cmd=="push"){
                p155.push(input2[i][0]);
                actual[i]=null;
            } else if(cmd=="getMin") {
                actual[i]=p155.getMin();
            } else if(cmd=="pop"){
                p155.pop();
                actual[i]=null;
            } else if(cmd=="top"){
                actual[i]=p155.top();
            }
        }
        return actual;
    }
}