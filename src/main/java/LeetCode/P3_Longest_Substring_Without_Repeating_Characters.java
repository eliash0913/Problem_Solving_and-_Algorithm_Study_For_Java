package LeetCode;

import java.util.*;

public class P3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        int max = 1;
        for(int i = 0; i < s.length() - 1; i++) {
            int length = 0;
            boolean isExist = false;
            int j = i + 1;
            while(!isExist && j < s.length()) {
                char ch = s.charAt(j);
                if(!s.substring(i,j).contains(Character.toString(ch))) {
                    length = s.substring(i, j).length() + 1;
                } else {
                    isExist = true;
                }
                j++;
            }

            if(max < length)
                max = length;
        }
        return max;
    }


}

class P3_Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
}
