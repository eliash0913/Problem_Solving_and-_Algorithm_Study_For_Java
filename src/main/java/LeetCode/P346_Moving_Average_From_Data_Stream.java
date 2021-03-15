package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P346_Moving_Average_From_Data_Stream {
    ArrayList<Double> movingAverage(String[] cmds, int[] vals){
        MovingAverage ma = new MovingAverage(0);
        ArrayList<Double> result = new ArrayList<>();
        for(int i = 0; i < cmds.length; i++){
            switch (cmds[i]){
                case "MovingAverage": {
                    ma = new MovingAverage(vals[i]);
                    result.add(null);
                    break;
                }
                case "next": {
                    result.add(ma.next(vals[i]));
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}

class MovingAverage {
    int size;
    int sum = 0;
    int count = 0;
    int oldIndex = 0;
    int[] window;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
        this.window = new int[size];
    }

    public double next(int val) {
        sum+=val;
        if(count < size) {
            window[count++]=val;
        }
        else{
            if(oldIndex==size)
                oldIndex = 0;
            sum-=window[oldIndex];
            window[oldIndex++]=val;
        }
        return (double)sum/(double)count;
    }
}

//class MovingAverage {
//    int size;
//    int sum = 0;
//    Queue<Integer> queue = new LinkedList<>();
//    /** Initialize your data structure here. */
//    public MovingAverage(int size) {
//        this.size = size;
//    }
//
//    public double next(int val) {
//        sum+=val;
//        queue.add(val);
//        if (queue.size() > size) {
//            sum -= queue.poll();
//        }
//        return (double)sum/(double)queue.size();
//    }
//}


//class MovingAverage {
//    int size;
//    ArrayList<Integer> al = new ArrayList<>();
//    /** Initialize your data structure here. */
//    public MovingAverage(int size) {
//        this.size = size;
//    }
//
//    public double next(int val) {
//        al.add(val);
//        int sum = 0;
//        int count = 0;
//        while(al.size()-count > 0 && count < size){
//            sum+=al.get(al.size()-count-1);
//            count++;
//        }
//        return (double)sum/(double)count;
//    }
//}