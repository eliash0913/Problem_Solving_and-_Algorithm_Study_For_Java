package LeetCode;

public class P283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int numIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                nums[numIndex++]=nums[i];
            }
        }
        while(numIndex<nums.length){
            nums[numIndex++]=0;
        }
    }
}
