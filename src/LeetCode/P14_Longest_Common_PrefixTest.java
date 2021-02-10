package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P14_Longest_Common_PrefixTest {
    P14_Longest_Common_Prefix p14 = new P14_Longest_Common_Prefix();

    @Test
    void sample1(){
        assertEquals("fl", p14.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    void sample2(){
        assertEquals("", p14.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    void sample3(){
        assertEquals("dog", p14.longestCommonPrefix(new String[]{"dog"}));
    }

    @Test
    void sample4(){
        assertEquals("racecar", p14.longestCommonPrefix(new String[]{"racecar","racecar","racecar"}));
    }

    @Test
    void sample5(){
        assertEquals("", p14.longestCommonPrefix(new String[]{"dog","","car"}));
    }

    @Test
    void sample6(){
        assertEquals("a", p14.longestCommonPrefix(new String[]{"ab","a"}));
    }
}