package LeetCode;

public class P35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(target<=nums[i])
                return i;
        }
        return nums.length;
    }
}
