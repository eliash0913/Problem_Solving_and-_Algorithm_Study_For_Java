package Codewars;

import java.util.ArrayList;
import java.util.Collections;

/**
 * TODO Not done yet! need to optimize.
 */
public class DoubleLinear {
    public static int dblLinear (int n) {
        int i = 1;
        int max = 0;
        while(Math.pow(2,i)<n){
            i++;
        }
        max = (int)Math.pow(2,i+1);
        int[] tmp = new int[max];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        int index=0;
        while(arr.size()<max){
            int num = arr.get(index++);
            if(!arr.contains(2*num+1))
                arr.add(2*num+1);
            if(!arr.contains(3*num+1))
                arr.add(3*num+1);
            Collections.sort(arr);
        }
        return arr.get(n);
    }
/*    public static int dblLinear (int n) {
        int i = 1;
        int max = 0;
        while(Math.pow(2,i)<n){
            i++;
        }
        max = (int)Math.pow(2,i+1);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        int index=0;
        while(arr.size()<max){
            int num = arr.get(index++);
            if(!arr.contains(2*num+1))
                arr.add(2*num+1);
            if(!arr.contains(3*num+1))
                arr.add(3*num+1);
            Collections.sort(arr);
        }
        return arr.get(n);
    }*/


   /* public static int dblLinear (int n) {
        int i = 1;
        int max = 0;
        while(Math.pow(2,i)<n){
            i++;
            max = (int)Math.pow(2,i);
        }
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(1)));
        int count = 1;
        int depth = 0;
        for(int x = 0; x < i+1; x++){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int y = 0; y < al.get(x).size(); y++){
                int num = al.get(x).get(y);
                tmp.add(num * 2+1);
                tmp.add(num * 3 + 1);
                count+=2;
            }
            //Collections.sort(tmp);
            al.add(tmp);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(ArrayList<Integer> a : al){
            for(int b : a){
                System.out.print(b+" ");
                if(!result.contains(b))
                    result.add(b);
            }
            System.out.println();
        }
        Collections.sort(result);
        return result.get(n);
    }

    class Node{
        Node left;
        Node right;
        int value;
        Node(int value){
            this.value=value;
        }
    }*/
}
