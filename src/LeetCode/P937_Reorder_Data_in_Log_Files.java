package LeetCode;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P937_Reorder_Data_in_Log_Files {
    public String[] reorderLogFiles(String[] logs) {
        String[] result = new String[logs.length];
        String letterPattern = "^([\\w\\d]+ )([a-z ]*)";
        Pattern letterRex = Pattern.compile(letterPattern);
        ArrayList<String> digitLog = new ArrayList<>();
        HashMap<String,String> letterLog = new HashMap<>();
        HashMap<String,ArrayList<String>> duplicatedletterLog = new HashMap<>();

        for(String str : logs){
            Matcher m = letterRex.matcher(str);
            if(m.matches()) {
                String key = m.group(2);
                String value = m.group(0);
                if(letterLog.containsKey(key))
                    if(duplicatedletterLog.containsKey(key))
                        duplicatedletterLog.get(key).add(value);
                    else {
                        duplicatedletterLog.put(key, new ArrayList<>(Arrays.asList(letterLog.get(key), value)));
                    }
                else
                    letterLog.put(key,value);
            }
            else
                digitLog.add(digitLog.size(),str);

        }
        ArrayList<String> tmp = new ArrayList<>();
        tmp.addAll(letterLog.keySet());
        Collections.sort(tmp);
        int resultIndex = 0;

        for(String x : tmp){

            if(duplicatedletterLog.keySet().contains(x)){
                ArrayList<String> z = duplicatedletterLog.get(x);
                Collections.sort(z);
                for(String y : z)
                    result[resultIndex++] = y;
            } else {
                result[resultIndex++] = letterLog.get(x);
            }
        }

        for(String x : digitLog){
            result[resultIndex++] = x;
        }

        for(String x : result)
            System.out.println(x);

        return result;
    }
}
