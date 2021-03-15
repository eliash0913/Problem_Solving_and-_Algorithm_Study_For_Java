package LeetCode;

public class P7_Reverse_Integer {
    public int reverse(int x) {
        if(x > -10 && x < 10) {
            return x;
        }
        int base = 10;
        int sign = 1;
        if(x<0) {
            x *= -1;
            sign = -1;
        }

        int tmpResult = x % base;
        int remainder = x / base;

        while(remainder >= 10) {
            tmpResult *= base;
            tmpResult += remainder % base;
            remainder /= base;
        }
        int result = tmpResult * base + remainder;
        result *= sign;
        if(tmpResult != 0) {
            if(tmpResult < 0 || ((tmpResult * base) + remainder)/tmpResult < 10) {
                result = 0;
            }
        }
        return result;
    }
}

class P7A_Reverse_Integer {
    public int reverse(int x) {
        boolean negative = x < 0 ? true : false;
        int result = 0;
        if(negative)
            x *= -1;
        while(x>0){
            if(((result * 10) + (x % 10))/10 != result) {
                return 0;
            }
            result = (result * 10) + (x%10);
            x /= 10;
        }
        return negative ? result * -1 : result;
    }
}
