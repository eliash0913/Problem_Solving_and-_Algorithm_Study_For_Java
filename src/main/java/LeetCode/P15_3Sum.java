package LeetCode;

import java.util.*;

public class P15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++) {
            int L = i+1;
            int R = nums.length - 1;
            while(L < R) {
                if(nums[i] + nums[L] + nums[R] > 0 && L!=R)
                    R--;
                if(nums[i] + nums[L] + nums[R] < 0 && L!=R)
                    L++;
                if(nums[i] + nums[L] + nums[R] == 0 && L!=R) {
                    set.add(new ArrayList<>(Arrays.asList(nums[i], nums[L], nums[R])));
                    R--;
                    L++;
                }
            }
        }
        for(ArrayList<Integer> al : set) {
            result.add(al);
        }
        return result;
    }
}

class P15_solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i])
                twoSumII(nums, i, res);
        return res;
    }
    void twoSumII(int[] nums, int i, List<List<Integer>> res) {
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0 || (lo > i + 1 && nums[lo] == nums[lo - 1]))
                ++lo;
            else if (sum > 0 || (hi < nums.length - 1 && nums[hi] == nums[hi + 1]))
                --hi;
            else
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
        }
    }
}
