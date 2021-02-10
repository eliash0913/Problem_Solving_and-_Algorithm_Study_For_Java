package LeetCode;

public class P14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String str = strs[0];
        for(int index = 1; index < strs.length; index++) {
            for(int charIndex = 0; charIndex < str.length(); charIndex++){
                if(str.startsWith(strs[index])) {
                    str = strs[index];
                } else {
                    if(charIndex < strs[index].length()) {
                        if(str.charAt(charIndex) != strs[index].charAt(charIndex)) {
                            str = str.substring(0, charIndex);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return str;
    }
}
