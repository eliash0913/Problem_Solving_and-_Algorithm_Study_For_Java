package LeetCode;

public class P69_Sqrt_x {
    public int mySqrt(int x) {
        double sqrt = Math.pow(Math.E, 0.5 * Math.log(x));
        return sqrt > x/sqrt ? (int)sqrt : (int)(x/sqrt);
    }

//    public int mySqrt(int x) {
//          return (int)Math.sqrt(x);
//    }
}
