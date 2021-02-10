package LeetCode;

public class P27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int p = 0;
        for(int i = 0; i < nums.length; i++){
            nums[p] = nums[i];
            if(nums[i]!=val) {
                p++;
            }
        }
        for(int x = 0; x < p; x++) {
            System.out.println(nums[x]);
        }
        return p;
    }
}
