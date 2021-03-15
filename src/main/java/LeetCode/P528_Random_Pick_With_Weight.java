package LeetCode;

public class P528_Random_Pick_With_Weight {
    //w is weight
    int sum;
    int[] count;
    int pickCount = 0;
    int size;
    int[] weight;
    public P528_Random_Pick_With_Weight(int[] w) {
        for(int weight : w){
            sum+=weight;
        }
        size = w.length;
        count = new int[size];
        weight = w;
    }

    public int pickIndex() {
        if(pickCount==size)
            pickCount = 0;
        pickCount++;
        int result = 0;
        for(int index = 0; index < size; index++){
            if(weight[index] > count[index]){
                count[index]++;
                result = index;
                break;
            }
        }
        return result;
    }
}
//    private int[] prefixSums;
//    private int totalSum;
//
//    public Solution(int[] w) {
//        this.prefixSums = new int[w.length];
//
//        int prefixSum = 0;
//        for (int i = 0; i < w.length; ++i) {
//            prefixSum += w[i];
//            this.prefixSums[i] = prefixSum;
//        }
//        this.totalSum = prefixSum;
//    }
//
//    public int pickIndex() {
//        double target = this.totalSum * Math.random();
//
//        // run a binary search to find the target zone
//        int low = 0, high = this.prefixSums.length;
//        while (low < high) {
//            // better to avoid the overflow
//            int mid = low + (high - low) / 2;
//            if (target > this.prefixSums[mid])
//                low = mid + 1;
//            else
//                high = mid;
//        }
//        return low;
//    }
