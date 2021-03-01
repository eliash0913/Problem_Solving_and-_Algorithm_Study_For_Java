package LeetCode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class P359_Logger_Rate_Limiter {
    ArrayList<Boolean> helper(String[] cmds, ArrayList<Pair<Integer, String>> vals){
        Logger logger = new Logger();
        ArrayList<Boolean> result = new ArrayList<>();
        for(int i = 0; i < cmds.length; i++){
            switch (cmds[i]){
                case "Logger": {
                    logger = new Logger();
                    result.add(null);
                    break;
                }
                case "shouldPrintMessage": {
                    result.add(logger.shouldPrintMessage(vals.get(i).getKey(), vals.get(i).getValue()));
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}

class Logger {
    HashMap<String, Integer> loggerMap;
    /** Initialize your data structure here. */
    public Logger() {
        loggerMap = new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!loggerMap.containsKey(message)){
            loggerMap.put(message,timestamp);
            return  true;
        } else {
            if(loggerMap.get(message)+10 <= timestamp) {
                loggerMap.replace(message, timestamp);
                return true;
            } else {
                return false;
            }
        }
    }
}