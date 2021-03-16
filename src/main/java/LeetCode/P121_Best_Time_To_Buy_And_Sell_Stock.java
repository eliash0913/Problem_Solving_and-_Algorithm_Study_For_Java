package LeetCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class P121_Best_Time_To_Buy_And_Sell_Stock {
    public int maxProfit(int[] prices) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        pq.add(prices[index]);
        int maxProfit = 0;
        while(++index < prices.length){
            int profit = prices[index]-pq.peek();
            if(maxProfit<profit)
                maxProfit = profit;
            pq.add(prices[index]);
        }
        return maxProfit > 0 ? maxProfit : 0;
    }

//    public int maxProfit(int prices[]) {
//        int minprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minprice)
//                minprice = prices[i];
//            else if (prices[i] - minprice > maxprofit)
//                maxprofit = prices[i] - minprice;
//        }
//        return maxprofit;
//    }

//    public int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for(int lowIndex = 0; lowIndex < prices.length-1; lowIndex++){
//            for(int highIndex = lowIndex+1; highIndex < prices.length; highIndex++){
//                int profit = prices[highIndex]- prices[lowIndex];
//                if(profit>maxProfit)
//                    maxProfit=profit;
//            }
//        }
//        return maxProfit;
//    }
}
