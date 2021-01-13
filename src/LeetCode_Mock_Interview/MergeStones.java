package LeetCode_Mock_Interview;

//TODO: UNDONE
import java.util.*;
//https://leetcode.com/problems/minimum-cost-to-merge-stones/
public class MergeStones {
//    public int mergeStones(int[] stones, int K) {
//        if(stones.length == 1)
//            return 0;
//        if(K>stones.length) {
//            return -1;
//        }
//        ArrayList<Integer> al = new ArrayList<>();
//        for(int stone : stones) {
//            al.add(new Integer(stone));
//        }
//
//        int result = 0;
//        int min = 0;
//        int minIndex = 0;
//        for(int j = 0; j < K; j++) {
//            min+=al.get(j);
//        }
//
//        while(al.size()>K) {
//            for(int i = 0; i <= al.size()-K; i++) {
//                int sum = 0;
//                for(int j = 0; j < K; j++) {
//                    sum+=al.get(j+i);
//                }
//                if(sum < min) {
//                    min = sum;
//                    minIndex = i;
//                }
//            }
//
//
//            for(int n : al) {
//                System.out.print(n+ " ");
//            }
//            System.out.println();
//
//            for(int j = 0; j < K ; j++) {
//                if(minIndex<al.size())
//                    al.remove(minIndex);
//            }
//
//            al.add(minIndex, min);
//
//            result+=min;
//            min = 0;
//            minIndex = 0;
//            for(int j = 0; j < K; j++) {
//                if(j<al.size())
//                    min+=al.get(j);
//            }
//        }
//        if(al.size()==K) {
//            for(int x : al) {
//                result+=x;
//            }
//        } else
//            return -1;
//        return result;
//    }

    public int mergeStones(int[] stones, int K) {
        int n = stones.length;
        if ((n - 1) % (K - 1) > 0) return -1;

        int[] prefix = new int[n+1];
        for (int i = 0; i <  n; i++)
            prefix[i + 1] = prefix[i] + stones[i];

        int[][] dp = new int[n][n];
        for (int m = K; m <= n; ++m)
            for (int i = 0; i + m <= n; ++i) {
                int j = i + m - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int mid = i; mid < j; mid += K - 1)
                    dp[i][j] = Math.min(dp[i][j], dp[i][mid] + dp[mid + 1][j]);
                if ((j - i) % (K - 1) == 0)
                    dp[i][j] += prefix[j + 1] - prefix[i];
            }
        return dp[0][n - 1];
    }

//    public int mergeStones(int[] stones, int k) {
//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
//        for(int stone : stones)
//            queue.add(stone);
//        int sum = 0;
//
//        while(queue.size()>=k) {
//            int tmp = 0;
//            for(int i = 0; i < k; i++)
//                tmp+=queue.poll();
//            queue.add(tmp);
//            sum += tmp;
//        }
//        if(queue.size()!=1)
//            return -1;
//        return sum;
//    }
}
