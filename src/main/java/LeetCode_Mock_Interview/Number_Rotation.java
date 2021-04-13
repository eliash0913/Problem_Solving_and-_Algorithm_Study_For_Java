package LeetCode_Mock_Interview;

public class Number_Rotation {
    public int rotatedDigits(int N) {
        int count = 0;
        boolean mirrored;
        for(int i = 1; i <= N; i++){
            mirrored = true;
            if(i<10 && (i == 2 || i ==6 || i ==9 || i ==5))
                count++;
            else if(i>9){
                int mCount = 0;
                int remain = i;
                while(remain > 0){
                    int digit = remain%10;
                    remain = remain/10;
                    boolean mir = digit == 2 || digit ==6 || digit ==9 || digit ==5;
                    boolean ignore = digit == 0 || digit ==1 || digit ==8;
                    if(mir)
                        mCount++;
                    else if(!ignore){
                        mirrored=false;
                        break;
                    }
                }
                if(mirrored && mCount>0) {
                    count++;
                }
            }
        }
        return count;
    }
}
