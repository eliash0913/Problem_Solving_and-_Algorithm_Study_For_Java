package LeetCode;

public class P453_Minimum_Moves_to_Equal_Array_Elements {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int moves = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min)
                min = nums[i];
        }

        for(int i = 0; i < nums.length;i++){
            moves += nums[i]-min;
        }
        return moves;
    }
}
