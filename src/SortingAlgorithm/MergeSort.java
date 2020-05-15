package SortingAlgorithm;

public class MergeSort {
    void mergeSort(int low, int high, int[] arr) {
        if(low<high) {
            int mid = (high + low) / 2;
            mergeSort(low, mid, arr);
            mergeSort(mid+1, high, arr);
            merge(low, mid, high, arr);
        }
    }

    void merge(int low, int mid, int high, int[] arr) {
        int leftSize = mid-low+1;
        int rightSize = high-mid;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for(int i = 0; i<leftSize; i++)
            leftArr[i] = arr[low+i];
        for(int i = 0; i<rightSize; i++)
            rightArr[i] = arr[mid+1+i];
        int l = 0;
        int r = 0;
        int index = low;
        while(l<leftSize && r<rightSize) {
            if(leftArr[l]<=rightArr[r]) {
                arr[index++] = leftArr[l++];
            } else {
                arr[index++] = rightArr[r++];
            }
        }

        while(l<leftSize) {
            arr[index++] = leftArr[l++];
        }
        while(r<rightSize) {
            arr[index++] = rightArr[r++];
        }
    }
}
