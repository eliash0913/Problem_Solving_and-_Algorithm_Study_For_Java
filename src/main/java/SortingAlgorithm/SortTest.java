package SortingAlgorithm;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class SortTest {
    int[] arraySample1 = new int[]{5, 6, 4, 7, 3, 8, 9, 2, 1, 10};

    @Test
    public void MergeSortTest() {
        MergeSort ms = new MergeSort();
        int[] testArray = arraySample1;
        ms.mergeSort(0, testArray.length - 1, testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, testArray);
    }

    @Test
    public void QuickSortTest() {
        QuickSort qs = new QuickSort();
        int[] testArray = arraySample1;
        qs.quickSort(0, testArray.length - 1, testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, testArray);
    }

    @Test
    public void InsertionSortTest() {
        InsertionSort is = new InsertionSort();
        int[] testArray = arraySample1;
        is.insertionSort(testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, testArray);
    }

    @Test
    public void SelectionSortTest() {
        SelectionSort ss = new SelectionSort();
        int[] testArray = arraySample1;
        ss.selectionSort(testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, testArray);
    }

    @Test
    public void TimSort_Insertion() {
        TimSort ts = new TimSort();
        int[] testArray = arraySample1;
        ts.insertionSort(0,testArray.length-1, testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, testArray);
    }

    @Test
    public void TimSortTest() {
        TimSort ts = new TimSort();
        int[] testArray = arraySample1;
        ts.timSort(testArray.length, testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, testArray);
    }

    @TestHelper
    public void TimSort_Merge() {
        TimSort ts = new TimSort();
        int[] testArray = arraySample1;
        ts.mergeSort(0,testArray.length-1, testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, testArray);
    }



    public void DisplayResult(int[] testArray) {
        for(int i : testArray) {
            System.out.println(i);
        }
    }

}
