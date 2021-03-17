package LeetCode;

public class P415_Add_Strings {
    public String addStrings(String num1, String num2) {
        int n1Size = num1.length();
        int n2Size = num2.length();
        String small = n1Size > n2Size ? num2 : num1;
        String big = n1Size > n2Size ? num1 : num2;
        String result = "";

        int carry=0;
        for(int i = 0; i < small.length(); i++){
            int num = Integer.parseInt(String.valueOf(num1.charAt(num1.length()-i-1))) + Integer.parseInt(String.valueOf(num2.charAt(num2.length()-i-1))) + carry;
            carry = num/10;
            num = num%10;
            result = String.valueOf(num) + result;
        }
        for(int i = small.length(); i < big.length(); i++){
            int num = Integer.parseInt(String.valueOf(big.charAt(big.length()-i-1))) + carry;
            carry = num/10;
            num = num%10;
            result = String.valueOf(num) + result;
        }
        if(carry!=0)
            result = String.valueOf(carry) + result;
        return result;
    }
}
