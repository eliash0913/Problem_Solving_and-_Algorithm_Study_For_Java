package SortingAlgorithm;

public class InsertionSort {
    void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while(j>= 0 && tmp < arr[j]) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1]=tmp;
        }
    }
}
