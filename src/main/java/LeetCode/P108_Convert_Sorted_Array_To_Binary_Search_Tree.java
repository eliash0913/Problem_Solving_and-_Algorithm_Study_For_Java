package LeetCode;

public class P108_Convert_Sorted_Array_To_Binary_Search_Tree {
    boolean[] isVisited;
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        isVisited = new boolean[nums.length];
        int headIndex = nums.length/2;
        isVisited[headIndex]=true;
        TreeNode head = new TreeNode(nums[headIndex]);
        makeTreeNode(0, nums.length, nums,head);
        return head;
    }

    void makeTreeNode(int left, int right, int[] nums, TreeNode head){
        int m = (right + left)/2;
        int l = (left+m)/2;
        int r = (right + m)/2;
        if(l>=0&& !isVisited[l]) {
            head.left = new TreeNode(nums[l]);
            isVisited[l]=true;
            if(l<m)
                makeTreeNode(left,m,nums,head.left);
        }
        if(r>=0 && !isVisited[r]) {
            head.right = new TreeNode(nums[r]);
            isVisited[r]=true;
            if(m<r)
                makeTreeNode(m,right,nums,head.right);
        }
    }

//    public TreeNode sortedArrayToBST(int[] num) {
//        if (num.length == 0) {
//            return null;
//        }
//        TreeNode head = helper(num, 0, num.length - 1);
//        return head;
//    }
//
//    public TreeNode helper(int[] num, int low, int high) {
//        if (low > high) { // Done
//            return null;
//        }
//        int mid = (low + high) / 2;
//        TreeNode node = new TreeNode(num[mid]);
//        node.left = helper(num, low, mid - 1);
//        node.right = helper(num, mid + 1, high);
//        return node;
//    }
}
