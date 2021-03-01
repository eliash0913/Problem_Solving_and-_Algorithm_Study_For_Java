package LeetCode;

import java.util.*;

public class P819_Most_Common_Word {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, ArrayList<String>> wordsMap = new HashMap<>();
        for (String str : paragraph.split("[\\W]+|[\\s]+")) {
            boolean isBanned = false;
            for(String bannedWord : banned){
                if (str.equalsIgnoreCase(bannedWord)) {
                    isBanned = true;
                    break;
                }
            }
            if(!isBanned) {
                if (wordsMap.containsKey(str.toLowerCase()))
                    wordsMap.get(str.toLowerCase()).add(str);
                else
                    wordsMap.put(str.toLowerCase(), new ArrayList<>(Collections.singletonList(str)));
            }
        }

        int max = 0;
        String key = "";
        for (String str : wordsMap.keySet()) {
            if (wordsMap.get(str).size() > max) {
                key = str;
                max = wordsMap.get(key).size();
            }
        }
        return key;
    }
}
