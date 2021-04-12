package LeetCode;

public class P387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        for(int index = 0; index < s.length(); index++){
            char c = s.charAt(index);
            if(s.indexOf(c) == s.lastIndexOf(c))
                return s.indexOf(c);
        }
        return -1;
    }
}
