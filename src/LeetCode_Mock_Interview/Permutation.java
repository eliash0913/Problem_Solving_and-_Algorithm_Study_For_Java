package LeetCode_Mock_Interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        permuteHelper(nums, 0, nums.length-1, results);
        return results;
    }

    void permuteHelper(int[] nums, int l, int r,  List<List<Integer>> results) {
        if(l==r) {
            ArrayList<Integer> result = new ArrayList<>();
            for(int num : nums)
                result.add(num);
            results.add(result);
        }

        for(int i = l; i <= r; i++) {
            nums = swap(l, i, nums);
            permuteHelper(nums,l + 1,r,results);
            nums = swap(l, i, nums);
        }
    }

    int[] swap(int a, int b, int[] nums) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
        return nums;
    }
}
