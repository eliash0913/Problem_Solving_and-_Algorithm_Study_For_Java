package LeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P122_Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)
            return 0;
        int profit = 0;
        for(int i = prices.length-1; i > 0 ; i--){
            if(prices[i]-prices[i-1]>0){
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }

//    public int maxProfit(int[] prices) {
//        if(prices.length<=1)
//            return 0;
//        Stack<Integer> s = new Stack<>();
//        int profit = 0;
//        for(int i = 0; i < prices.length; i++){
//            s.add(prices[i]);
//        }
//        int lastNumber = s.pop();
//        System.out.printf("last number: %d, top number: %d\n",lastNumber, s.peek());
//        while(!s.isEmpty()){
//            if(lastNumber>s.peek()) {
//                profit = profit + lastNumber - s.peek();
//            }
//            lastNumber = s.pop();
//        }
//        return profit;
//    }
}
