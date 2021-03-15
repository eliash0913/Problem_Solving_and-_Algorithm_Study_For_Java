package SortingAlgorithm;
//https://www.geeksforgeeks.org/timsort/
public class TimSort {
    static int RUN = 32;

    void insertionSort(int left, int right, int[] arr) {
        for(int i = left + 1; i < right; i++) {
            for(int j = i; j >= 1; j--) {
                if(arr[j-1] > arr[j]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    void merge(int left, int m, int right, int[] arr) {
        int ls = m - left + 1;
        int rs = right - m;

        int[] larr = new int[ls];
        int[] rarr = new int[rs];

        for(int i = 0; i < ls; i++)
            larr[i] = arr[left+i];
        for(int j = 0; j < rs; j++)
            rarr[j] = arr[m+j+1];

        int index = left;
        int lindex = 0;
        int rindex = 0;
        while(lindex < ls && rindex < rs) {
            if(larr[lindex] <= rarr[rindex])
                arr[index++] = larr[lindex++];
            else
                arr[index++] = rarr[rindex++];
        }

        while(lindex < ls) {
            arr[index++] = larr[lindex++];
        }

        while(rindex < rs) {
            arr[index++] = rarr[rindex++];
        }
    }

    void timSort(int n, int[] arr) {
        for(int i = 0; i < n; i+=RUN) {
            insertionSort(i, Math.min((i+31), (n-1)), arr);
        }

        for(int size = RUN; size < n; size = 2*size) {
            for(int left = 0; left < n; left+=2*size) {
                int mid = left + size -1;
                int right = Math.min((left + 2 * size - 1), (n-1));
                merge(left, mid, right, arr);
            }
        }
    }

    void mergeSort(int low, int high, int[] arr) {
        if(low<high) {
            int mid = (high + low) / 2;
            mergeSort(low, mid, arr);
            mergeSort(mid+1, high, arr);
            merge(low, mid, high, arr);
        }
    }
}
