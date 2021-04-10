package LeetCode;

import java.util.Arrays;

public class P66_Plus_One {
    public int[] plusOne(int[] digits) {
        int[] result;
        int carry = 1;
        for(int index = digits.length-1; index >= 0; index--){
            if(digits[index]+carry>9){
                digits[index] = 0;
                carry = 1;
            } else {
                digits[index]=digits[index]+carry;
                carry=0;
            }
        }
        if(carry>0){
            result = new int[digits.length+1];
            result[0]=carry;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
