package LeetCode;

public class P9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        int num = x;
        if(x<0)
            return false;
        int reverse = 0;
        while(x>0){
            reverse = reverse * 10 + x%10;
            x/=10;
        }
        return num == reverse;
    }
}
