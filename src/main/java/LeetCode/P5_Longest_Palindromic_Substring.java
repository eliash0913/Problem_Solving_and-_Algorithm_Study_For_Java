package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P5_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if(s.length() == 0)
            return "";
        if(isPalindrome(s,0,s.length()-1))
            return s;
        String result = Character.toString(s.charAt(0));
        for(int i = 0; i < s.length() - 1; i++) {
            String str = "";
            for(int j = i + 1; j < s.length(); j++) {
                if(isPalindrome(s, i, j)) {
                    str = s.substring(i, j + 1);
                }
            }
            if(result.length() < str.length())
                result = str;
        }
        return result;
    }

    boolean isPalindrome(String s, int start, int end) {
        for(int i = 0; i <= (end - start) / 2; i++) {
            if(s.charAt(start + i) != s.charAt(end - i)) {
                return false;
            }
        }
        return true;
    }
}

class P5_Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
