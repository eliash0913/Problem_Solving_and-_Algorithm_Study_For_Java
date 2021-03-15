package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class P528_Random_Pick_With_WeightTest {
    P528_Random_Pick_With_Weight p528;
    @Test
    void test1(){
        int[] input = {1,3};
        p528 = new P528_Random_Pick_With_Weight(input);
        int[] output = {p528.pickIndex(), p528.pickIndex(), p528.pickIndex(), p528.pickIndex()};
        HashMap<Integer,Integer> actual = new HashMap<>();
        HashMap<Integer,Integer> expected = new HashMap<>();
        expected.put(0,1);
        expected.put(1,3);
        System.out.println(Arrays.toString(output));
        for(int i : output){
            if(actual.containsKey(i)){
                actual.replace(i,actual.get(i)+1);
            } else {
                actual.put(i,1);
            }
        }
        for(int key : expected.keySet()){
            assertEquals(expected.get(key), actual.get(key));
        }
    }
}