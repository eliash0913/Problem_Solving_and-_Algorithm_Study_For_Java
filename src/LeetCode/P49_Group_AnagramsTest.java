package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P49_Group_AnagramsTest {
    P49_Group_Anagrams p49 = new P49_Group_Anagrams();
    @Test
    void test1(){
        String[] sample = {"eat","tea","tan","ate","nat","bat"};
        ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
        output.add(new ArrayList<String>(Arrays.asList("bat")));
        output.add(new ArrayList<String>(Arrays.asList("tan","nat")));
        output.add(new ArrayList<String>(Arrays.asList("eat","tea","ate")));
        assertIterableEquals(output, p49.groupAnagrams(sample));
    }

    @Test
    void test2(){
        String[] sample = {""};
        ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
        output.add(new ArrayList<String>(Arrays.asList("")));
        assertIterableEquals(output, p49.groupAnagrams(sample));
    }

    @Test
    void test3(){
        String[] sample = {"a"};
        ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
        output.add(new ArrayList<String>(Arrays.asList("a")));
        assertIterableEquals(output, p49.groupAnagrams(sample));
    }

    @Test
    void test4(){
        String[] sample = {"ddddddddddg","dgggggggggg"};
        ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
        output.add(new ArrayList<String>(Arrays.asList("dgggggggggg")));
        output.add(new ArrayList<String>(Arrays.asList("ddddddddddg")));
        assertIterableEquals(output, p49.groupAnagrams(sample));
    }
}