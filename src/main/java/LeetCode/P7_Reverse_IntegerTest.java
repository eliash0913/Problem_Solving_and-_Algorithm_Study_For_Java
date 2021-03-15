package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P7_Reverse_IntegerTest {
    P7_Reverse_Integer p7 = new P7_Reverse_Integer();
    @Test
    void Test1() {
        int sample = 123;
        assertEquals(321, p7.reverse(sample));
    }
    @Test
    void Test2() {
        int sample = -123;
        assertEquals(-321, p7.reverse(sample));
    }
    @Test
    void Test3() {
        int sample = 120;
        assertEquals(21, p7.reverse(sample));
    }
    @Test
    void Test4() {
        int sample = 0;
        assertEquals(0, p7.reverse(sample));
    }

    @Test
    void Test5() {
        int sample = 1;
        assertEquals(1, p7.reverse(sample));
    }

    @Test
    void Test6() {
        int sample =10;
        assertEquals(1, p7.reverse(sample));
    }

    @Test
    void Test7() {
        int sample = 1534236469;
        assertEquals(0, p7.reverse(sample));
    }

    @Test
    void Test8() {
        int sample =1999999992;
        assertEquals(0, p7.reverse(sample));
    }
    @Test
    void Test9() {
        int sample =-2147483648;
        assertEquals(0, p7.reverse(sample));
    }
    @Test
    void Test10() {
        int sample =-2147483412;
        assertEquals(-2143847412, p7.reverse(sample));
    }
    P7A_Reverse_Integer p7a = new P7A_Reverse_Integer();
    @Test
    void Test1A() {
        int sample = 123;
        assertEquals(321, p7a.reverse(sample));
    }
    @Test
    void Test2A() {
        int sample = -123;
        assertEquals(-321, p7a.reverse(sample));
    }
    @Test
    void Test3A() {
        int sample = 120;
        assertEquals(21, p7a.reverse(sample));
    }
    @Test
    void Test4A() {
        int sample = 0;
        assertEquals(0, p7a.reverse(sample));
    }

    @Test
    void Test5A() {
        int sample = 1;
        assertEquals(1, p7a.reverse(sample));
    }

    @Test
    void Test6A() {
        int sample =10;
        assertEquals(1, p7a.reverse(sample));
    }

    @Test
    void Test7A() {
        int sample = 1534236469;
        assertEquals(0, p7a.reverse(sample));
    }

    @Test
    void Test8A() {
        int sample =1999999992;
        assertEquals(0, p7a.reverse(sample));
    }
    @Test
    void Test9A() {
        int sample =-2147483648;
        assertEquals(0, p7a.reverse(sample));
    }
    @Test
    void Test10A() {
        int sample =-2147483412;
        assertEquals(-2143847412, p7a.reverse(sample));
    }
    @Test
    void Test11A() {
        int sample =563847412;
        assertEquals(214748365, p7a.reverse(sample));
    }
}