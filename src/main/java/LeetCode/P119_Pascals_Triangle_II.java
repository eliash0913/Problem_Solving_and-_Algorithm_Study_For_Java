package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P119_Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++){
            List<Integer> temp = new ArrayList<>();
            if(i<2) {
                for(int j = 0; j <= i; j++) {
                    temp.add(1);
                }
                result = temp;
            } else {
                temp.add(1);
                for(int j = 0; j < result.size()-1; j++){
                    temp.add(result.get(j)+result.get(j+1));
                }
                temp.add(1);
                result=temp;
            }
        }
        return result;
    }
}
