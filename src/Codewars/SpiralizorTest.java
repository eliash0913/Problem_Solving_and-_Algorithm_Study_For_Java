package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralizorTest {
    @Test
    public void test1() {
        assertArrayEquals(
                new int[][] {
                        { 1 }
                },
                Spiralizor.spiralize(1));
    }
    @Test
    public void test2() {
        assertArrayEquals(
                new int[][] {
                        { 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1 }
                },
                Spiralizor.spiralize(5));
    }
    @Test
    public void test3() {
        assertArrayEquals(
                new int[][] {
                        { 1, 1 },
                        { 0, 1 }
                },
                Spiralizor.spiralize(2));
    }

    @Test
    public void test4() {
        assertArrayEquals(
                new int[][] {
                },
                Spiralizor.spiralize(0));
    }

    @Test
    public void test5() {
        assertArrayEquals(
                new int[][] {

                        { 1, 1, 1 },
                        { 0, 0, 1 },
                        { 1, 1, 1 }
                },
                Spiralizor.spiralize(3));
    }
    @Test
    public void test6() {
        assertArrayEquals(
                new int[][] {
                        { 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1 },
                },
                Spiralizor.spiralize(8));
    }
    @Test
    public void test7() {
        assertArrayEquals(
                new int[][] {
                        { 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 1 },
                        { 1, 0, 0, 0, 0, 0, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1 },
                },
                Spiralizor.spiralize(8));
    }
}