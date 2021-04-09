package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class P412_Fizz_Buzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <=n; i++){
            String tmp = "";
            if(i%3==0)
                tmp+="Fizz";
            if(i%5==0)
                tmp+="Buzz";
            if(tmp.length()==0)
                tmp+=String.valueOf(i);
            result.add(tmp);
        }
        return result;
    }
}
