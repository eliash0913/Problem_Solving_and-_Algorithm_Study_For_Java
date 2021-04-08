package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class P53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        System.out.printf("num: %d, sum: %d, maxSum: %d\n", nums[0], sum, maxSum);
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            if(num > sum && sum < 0) {
                sum = num;
            } else {
                sum+=num;
            }
            if(sum > maxSum)
                maxSum = sum;
            System.out.printf("num: %d, sum: %d, maxSum: %d\n", num, sum, maxSum);
        }
        return maxSum;
    }
}
