package LeetCode;

public class P58_Length_Of_Last_Word {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for(int index = s.length()-1; index >=0; index--){
            if(Character.isLetter(s.charAt(index))){
                length++;
            } else if(!Character.isLetter(s.charAt(index)) && length > 0){
                return length;
            }
        }
        return length;
    }
}
