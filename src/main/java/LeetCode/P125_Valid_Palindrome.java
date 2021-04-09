package LeetCode;

public class P125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(l<s.length()-1&&!Character.isLetter(s.charAt(l))&&!Character.isDigit(s.charAt(l)))
                l++;
            while(r>0&&!Character.isLetter(s.charAt(r))&&!Character.isDigit(s.charAt(r)))
                r--;
            if(l>r)
                return true;
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
