package LeetCode;

import java.net.CookieHandler;
import java.util.Arrays;
import java.util.Stack;

public class P42_Trapping_Rain_Water {
    public int trap(int[] height) {
        int result = 0;
        int endIndex = height.length;
        for(int leftIndex = 0; leftIndex<height.length;){
            int max = 0;
            for(int rightIndex = height.length-1; rightIndex>leftIndex; rightIndex--){
                if(max < height[rightIndex] || height[leftIndex] <= height[rightIndex]) {
                    max = height[rightIndex];
                    endIndex = rightIndex;
                }
            }
            if(endIndex-leftIndex>1){
                for(int startIndex = leftIndex + 1;startIndex<endIndex;startIndex++){
                    if(height[leftIndex]> height[endIndex])
                        result+=(height[endIndex]-height[startIndex]);
                    else
                        result+=(height[leftIndex]-height[startIndex]);
                }
                leftIndex = endIndex;
            } else {
                leftIndex++;
            }
        }
        return result;
    }
}


