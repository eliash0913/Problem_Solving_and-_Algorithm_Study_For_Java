package LeetCode;

public class P849_Maximize_Distance_to_Closest_Person {
    public int maxDistToClosest(int[] seats) {
        int l = 0;
        int r = seats.length-1;
        for(int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                l++;
            } else {
                break;
            }
        }
        for(int i = 0; i < seats.length; i++) {
            if(seats[seats.length-1-i]==0){
                r--;
            } else {
                break;
            }
        }
        int max = l > seats.length-r-1 ? l : seats.length-r-1;
        int midMax = 0;
        int gap = 0;

        for(int i = l; i < r; i++){
            if(seats[i]==0)
                gap++;
            else{
                if(gap >= midMax){
                    midMax = gap;
                }
                gap = 0;
            }
            System.out.println(gap);
        }
        if(gap > midMax)
            midMax=gap;
        midMax = (midMax+1)/2;
        return max > midMax ? max : midMax;
    }
}
