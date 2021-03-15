package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P17_Letter_Combinations_Of_A_Phone_NumberTest {
    P17_Letter_Combinations_Of_A_Phone_Number p17 = new P17_Letter_Combinations_Of_A_Phone_Number();
    @Test
    void test1(){
        String input = "23";
        List<String> output = new ArrayList<String>(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"));
        assertIterableEquals(output, p17.letterCombinations(input));
    }

    @Test
    void test2(){
        String input = "";
        List<String> output = new ArrayList<String>(Arrays.asList());
        assertIterableEquals(output, p17.letterCombinations(input));
    }

    @Test
    void test3(){
        String input = "2";
        List<String> output = new ArrayList<String>(Arrays.asList("a","b","c"));
        assertIterableEquals(output, p17.letterCombinations(input));
    }
}