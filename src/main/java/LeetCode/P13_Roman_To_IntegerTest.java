package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P13_Roman_To_IntegerTest {
    P13_Roman_To_Integer p13 = new P13_Roman_To_Integer();
    @Test
    void Test1(){
        String sample = "III";
        assertEquals(3, p13.romanToInt(sample));
    }

    @Test
    void Test2(){
        String sample = "IV";
        assertEquals(4, p13.romanToInt(sample));
    }

    @Test
    void Test3(){
        String sample = "IX";
        assertEquals(9, p13.romanToInt(sample));
    }

    @Test
    void Test4(){
        String sample = "VII";
        assertEquals(7, p13.romanToInt(sample));
    }

    @Test
    void Test5(){
        String sample = "VIII";
        assertEquals(8, p13.romanToInt(sample));
    }

    @Test
    void Test6(){
        String sample = "XIII";
        assertEquals(13, p13.romanToInt(sample));
    }

    @Test
    void Test7(){
        String sample = "XVI";
        assertEquals(16, p13.romanToInt(sample));
    }

    @Test
    void Test8(){
        String sample = "XV";
        assertEquals(15, p13.romanToInt(sample));
    }

    @Test
    void Test9(){
        String sample = "LVIII";
        assertEquals(58, p13.romanToInt(sample));
    }

    @Test
    void Test10(){
        String sample = "XIX";
        assertEquals(19, p13.romanToInt(sample));
    }

    @Test
    void Test11(){
        String sample = "CXC";
        assertEquals(190, p13.romanToInt(sample));
    }

    @Test
    void Test12(){
        String sample = "MCMXCIV";
        assertEquals(1994, p13.romanToInt(sample));
    }
}