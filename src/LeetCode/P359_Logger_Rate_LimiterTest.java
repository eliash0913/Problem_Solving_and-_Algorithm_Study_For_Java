package LeetCode;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P359_Logger_Rate_LimiterTest {
    P359_Logger_Rate_Limiter p359 = new P359_Logger_Rate_Limiter();
    @Test
    void test1(){
        String[] cmds = {"Logger", "shouldPrintMessage", "shouldPrintMessage", "shouldPrintMessage", "shouldPrintMessage", "shouldPrintMessage", "shouldPrintMessage"};
        ArrayList<Pair<Integer,String>> vals = new ArrayList<>();
        vals.add(null);
        vals.add(new Pair<>(1, "foo"));
        vals.add(new Pair<>(2, "bar"));
        vals.add(new Pair<>(3, "foo"));
        vals.add(new Pair<>(8, "bar"));
        vals.add(new Pair<>(10, "foo"));
        vals.add(new Pair<>(11, "foo"));
        assertIterableEquals(new ArrayList<Boolean>(Arrays.asList(null, true, true, false, false, false, true)), p359.helper(cmds,vals));
    }
}