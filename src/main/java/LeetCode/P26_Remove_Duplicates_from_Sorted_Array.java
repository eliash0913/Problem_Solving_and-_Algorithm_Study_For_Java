package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        else if(nums.length == 1)
            return 1;
        int count = 1;
        int previousNumber = nums[0];
        int currentIndex = 1;
        for(int index = 1; index < nums.length; index++){
            if(previousNumber != nums[index]) {
                nums[currentIndex++] = nums[index];
                count++;
            }
            previousNumber = nums[index];
        }
        for(int i = 0; i < count; i++){
            System.out.println(nums[i]);
        }
        return count;
    }
}
