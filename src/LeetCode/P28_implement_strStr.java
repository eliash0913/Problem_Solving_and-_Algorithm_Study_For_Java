package LeetCode;

class P28_implement_strStr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            boolean isMatch = true;
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    isMatch = false;
                    break;
                }
            }

            if(isMatch)
                return i;
        }
        return -1;
    }
}
