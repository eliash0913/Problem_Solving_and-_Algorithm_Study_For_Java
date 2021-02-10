package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P27_Remove_ElementTest {
    P27_Remove_Element p27 = new P27_Remove_Element();

    @Test
    void sample1(){
        assertEquals(2, p27.removeElement(new int[]{3,2,2,3}, 3));
    }

    @Test
    void sample2(){
        assertEquals(5, p27.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

}