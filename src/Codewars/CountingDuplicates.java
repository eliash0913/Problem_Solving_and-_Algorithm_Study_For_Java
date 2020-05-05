package Codewars;

import java.util.HashSet;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        HashSet<Character> hs = new HashSet<Character>();
        HashSet<Character> tmp = new HashSet<Character>();
        for(int i = 0; i < text.length(); i++){
            Character ch = text.toLowerCase().charAt(i);
            if(!tmp.contains(ch))
                tmp.add(ch);
            else
                hs.add(ch);
        }
        return hs.size();
    }
}
