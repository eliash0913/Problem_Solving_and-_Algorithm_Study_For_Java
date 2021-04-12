package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P387_First_Unique_Character_in_a_StringTest {
    P387_First_Unique_Character_in_a_String p387 = new P387_First_Unique_Character_in_a_String();
    @Test
    void test1(){
        String input = "leetcode";
        int output = 0;
        assertEquals(output, p387.firstUniqChar(input));
    }

    @Test
    void test2(){
        String input = "loveleetcode";
        int output = 2;
        assertEquals(output, p387.firstUniqChar(input));
    }

    @Test
    void test3(){
        String input = "aabb";
        int output = -1;
        assertEquals(output, p387.firstUniqChar(input));
    }
}