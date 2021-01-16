package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class P56_Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        int[][] result;
        ArrayList<int[]> rAl = new ArrayList<>();
        for(int start = 0; start < intervals.length - 1; start++){
            int[] tmp = intervals[start];
            for(int end = start + 1; end < intervals.length; end++) {
                if(intervals[start][1] >= intervals[end][0]){
                    tmp[1] = intervals[end][1];
                   }
            }
        }



        for(int i = 0; i < intervals.length-1; i++){
            int[] tmp = intervals[i];
            int j = i;
            while(j< intervals.length) {
                j++;
                if(tmp[1] >= intervals[j][0]){
                    tmp[1]=intervals[j][1];
                } else {

                }
            }


        }
        return null;
    }
//        public int[][] merge(int[][] intervals) {
//        int max = intervals[intervals.length-1][1];
//        int min = intervals[0][0];
//        int[] count = new int[max-min+2];
//        for(int i = 0; i < intervals.length; i++){
//            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
//                count[j-min]+=(i+1);
//            }
//        }
//        for(int x : count){
//            System.out.println(x);
//        }
//
//
//        ArrayList<int[]> tmp = new ArrayList<>();
//
//        for(int i = 0; i < count.length; i++){
//            if(count[i]>0) {
//
//                int j = i;
//                while (count[j] > 0) {
//                    j++;
//                }
//                tmp.add(new int[]{i + min, j});
//                i = j;
//            }
//        }
//        int[][] result = new int[tmp.size()][2];
//        int n = 0;
//        for(int[] element : tmp){
//            result[n++] = element;
//        }
//        return result;
//    }
}
