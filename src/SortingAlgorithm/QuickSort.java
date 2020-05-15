package SortingAlgorithm;

public class QuickSort {
    void quickSort(int low, int high, int[] arr) {
        if(low<high) {
            int pivot = partition(low, high, arr);
            quickSort(low, pivot -1, arr);
            quickSort(pivot, high, arr);
        }
    }

    int partition(int low, int high, int[] arr) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;
        return i+1;
    }
}
