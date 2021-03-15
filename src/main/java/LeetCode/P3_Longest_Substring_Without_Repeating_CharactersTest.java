package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P3_Longest_Substring_Without_Repeating_CharactersTest {
    P3_Longest_Substring_Without_Repeating_Characters p3 = new P3_Longest_Substring_Without_Repeating_Characters();
    @Test
    void Test1() {
        assertEquals(3, p3.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void Test2() {
        assertEquals(1, p3.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void Test3() {
        assertEquals(3, p3.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void Test4() {
        assertEquals(1, p3.lengthOfLongestSubstring("a"));
    }

    @Test
    void Test5() {
        assertEquals(3, p3.lengthOfLongestSubstring("aadsasdasdasdadsdasadsdas"));
    }

    @Test
    void Test6() {
        assertEquals(6, p3.lengthOfLongestSubstring("abcdef"));
    }

    @Test
    void Test7() {
        assertEquals(2, p3.lengthOfLongestSubstring("cdd"));
    }
}