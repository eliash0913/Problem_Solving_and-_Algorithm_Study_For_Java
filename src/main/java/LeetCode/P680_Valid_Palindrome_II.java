package LeetCode;

class P680_Valid_Palindrome_II {
    public boolean validPalindrome(String s) {
        int leftCount = 0;
        int rightCount = 0;
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            if(leftCount==0 && rightCount ==0) {
                if (s.charAt(l) == s.charAt(r)) {
                    l++;
                    r--;
                } else {
                    leftCount++;
                    rightCount++;
                }
            } else {
                if(s.charAt(l+1) != s.charAt(r)){
                    leftCount++;
                }
                if(s.charAt(l) != s.charAt(r-1)){
                    rightCount++;
                }
                l++;
                r--;
            }
            if(leftCount >= 2 && rightCount >= 2)
                return false;
        }
        return true;
    }
}
