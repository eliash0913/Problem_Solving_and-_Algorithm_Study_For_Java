package LeetCode;

public class P1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int index = 1; index < nums.length; index++) {
            for(int pairIndex = 0; pairIndex < nums.length; pairIndex++) {
                if(nums[index] + nums[pairIndex] == target && index != pairIndex) {
                    result[0] = index > pairIndex ? pairIndex : index;
                    result[1] = index > pairIndex ? index : pairIndex;
                    break;
                }
            }
        }
        return result;
    }
}
