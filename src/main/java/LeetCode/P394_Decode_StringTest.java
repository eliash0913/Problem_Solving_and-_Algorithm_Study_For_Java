package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P394_Decode_StringTest {
    P394_Decode_String p394 = new P394_Decode_String();
    @Test
    void test1(){
        String input = "3[a]2[bc]";
        String output = "aaabcbc";
        assertEquals(output,p394.decodeString(input));
    }

    @Test
    void test2(){
        String input = "3[a2[c]]";
        String output = "accaccacc";
        assertEquals(output,p394.decodeString(input));    }

    @Test
    void test3(){
        String input = "2[abc]3[cd]ef";
        String output = "abcabccdcdcdef";
        assertEquals(output,p394.decodeString(input));    }

    @Test
    void test4(){
        String input = "abc3[cd]xyz";
        String output = "abccdcdcdxyz";
        assertEquals(output,p394.decodeString(input));    }
}