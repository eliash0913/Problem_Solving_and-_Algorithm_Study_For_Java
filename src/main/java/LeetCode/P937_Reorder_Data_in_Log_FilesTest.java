package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P937_Reorder_Data_in_Log_FilesTest {
    P937_Reorder_Data_in_Log_Files p937 = new P937_Reorder_Data_in_Log_Files();

    @Test
    void test1(){
        String[] input = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String[] output = {"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"};
        assertArrayEquals(output, p937.reorderLogFiles(input));
    }

    @Test
    void test2(){
        String[] input = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] output = {"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};
        assertArrayEquals(output, p937.reorderLogFiles(input));
    }

    @Test
    void test3(){
        String[] input = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};
        String[] output = {"a2 act car","g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};
        assertArrayEquals(output, p937.reorderLogFiles(input));
    }

    @Test
    void test4(){
        String[] input = {"j mo", "5 m w", "g 07", "o 2 0", "t q h"};
        String[] output = {"5 m w","j mo","t q h","g 07","o 2 0"};
        assertArrayEquals(output, p937.reorderLogFiles(input));
    }
}