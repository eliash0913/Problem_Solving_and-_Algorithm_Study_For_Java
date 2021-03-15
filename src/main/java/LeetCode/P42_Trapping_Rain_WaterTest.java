package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42_Trapping_Rain_WaterTest {
    P42_Trapping_Rain_Water p42 = new P42_Trapping_Rain_Water();
    @Test
    void Test1() {
        assertEquals(6, p42.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    @Test
    void Test2() {
        assertEquals(6, p42.trap(new int[] {1,2,1,2,3,1,0,1,2,0,1,0}));
    }

    @Test
    void Test3() {
        assertEquals(1, p42.trap(new int[] {0,1,0,2}));
    }

    @Test
    void Test4() {
        assertEquals(25, p42.trap(new int[] {0,5,4,3,2,1,0,1,2,3,4,5,0}));
    }

    @Test
    void Test5() {
        assertEquals(25, p42.trap(new int[] {0,5,4,3,2,1,0,1,2,3,4,5,0}));
    }

    @Test
    void Test6() {
        assertEquals(0, p42.trap(new int[] {0}));
    }

    @Test
    void Test7() {
        assertEquals(1, p42.trap(new int[] {4,2,3}));
    }

    @Test
    void Test8() {
        assertEquals(1, p42.trap(new int[] {2,3,5,4,9,4}));
    }

    @Test
    void Test9() {
        assertEquals(1, p42.trap(new int[] {4,9,4,5,3,2}));
    }

    @Test
    void Test10() {
        assertEquals(3, p42.trap(new int[] {9,6,8,8,5,6,3}));
    }

    @Test
    void Test11() {
        assertEquals(3, p42.trap(new int[] {2,1,0,2}));
    }

    @Test
    void Test12() {
        assertEquals(3, p42.trap(new int[] {2,0,1,2}));
    }

    @Test
    void Test13() {
        assertEquals(0, p42.trap(new int[] {}));
    }

    @Test
    void Test14() {
        assertEquals(0, p42.trap(new int[] {0,1,0}));
    }

    @Test
    void Test15() {
        assertEquals(1, p42.trap(new int[] {5,4,1,2}));
    }

    @Test
    void Test16() {
        assertEquals(1, p42.trap(new int[] {2,1,4,5}));
    }

    @Test
    void Test17() {
        assertEquals(14, p42.trap(new int[] {5,2,1,2,1,5}));
    }

    @Test
    void Test18() {
        assertEquals(14, p42.trap(new int[] {0,5,2,1,2,1,5,0}));
    }
}