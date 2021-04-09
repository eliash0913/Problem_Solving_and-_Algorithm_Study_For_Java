package LeetCode;

public class P88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1Idx = m-1;
        int n2Idx = n-1;
        int idx = m+n-1;
        while(n1Idx>=0 && n2Idx>=0){
            if(nums1[n1Idx]<nums2[n2Idx])
                nums1[idx--] = nums2[n2Idx--];
            else
                nums1[idx--] = nums1[n1Idx--];
        }
        while(n1Idx>=0){
            nums1[idx--] = nums1[n1Idx--];
        }
        while(n2Idx>=0){
            nums1[idx--] = nums2[n2Idx--];
        }
    }
}
