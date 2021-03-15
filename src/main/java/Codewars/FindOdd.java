package Codewars;
import java.util.HashMap;

public class FindOdd {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            if(!hs.containsKey(a[i]))
                hs.put((a[i]),1);
            else
                hs.replace(a[i],hs.get(a[i])+1);
        }
        int ans = 0;
        for(int key : hs.keySet()){
            if(Math.abs(hs.get(key))%2==1){
                ans = key;
            }
        }
        return ans;
    }
}
