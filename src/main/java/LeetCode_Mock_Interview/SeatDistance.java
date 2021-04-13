package LeetCode_Mock_Interview;

import java.util.ArrayList;
import java.util.Collections;

public class SeatDistance {
    public int maxDistToClosest(int[] seats) {
        int gap = 0;
        int max = 0;
        boolean leftEnd=seats[0]==0 ? true : false;
        boolean rightEnd=seats[seats.length-1]==0 ? true : false;
        int leftSize = 0;
        for(int i=0; i < seats.length; i++){
            if(seats[i]==0){
                gap++;
            } else {
                if(gap>max){
                    if(leftEnd && leftSize == 0){
                        leftSize = gap;
                    }
                    max = gap;
                }
            }
        }
        if(gap>max){
            max = gap;
        }
        return leftEnd || rightEnd ? max : (max)/2;
    }
}
