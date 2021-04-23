package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class P118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        current.add(1);
        result.add(current);
        if(numRows==1)
            return result;

        current = new ArrayList<>();
        current.add(1);
        current.add(1);
        result.add(current);
        if(numRows==2)
            return result;

        for(int row = 3; row <= numRows; row++) {
            current = new ArrayList<>();
            List<Integer> previous = result.get(row - 2);
            current.add(1);
            for (int i = 0; i < previous.size() - 1; i++) {
                current.add(previous.get(i) + previous.get(i + 1));
            }
            current.add(1);
            result.add(current);
        }
        return result;
    }
}
