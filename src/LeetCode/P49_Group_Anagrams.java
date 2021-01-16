package LeetCode;

import java.util.*;

public class P49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<ArrayList<Character>,ArrayList<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int['z'-'a'+1];
            for(Character c : str.toCharArray()){
                int x = c - 'a';
                count[x]++;
            }
            ArrayList<Character> cAl = new ArrayList<>();
            for(int n = 0; n < count.length; n++){
                if(count[n]>0){
                    for(int k = count[n]; count[n]>0;k--) {
                        char y = (char) (n + 'a');
                        cAl.add(y);
                        count[n]--;
                    }
                }
            }
            if(map.containsKey(cAl)) {
                map.get(cAl).add(str);
            } else {
                map.put(cAl, new ArrayList<String>(Arrays.asList(str)));
            }
        }
        answer.addAll(map.values());
        return answer;
    }

    //Leetcode Answer
    public List<List<String>> groupAnagramsA(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}


