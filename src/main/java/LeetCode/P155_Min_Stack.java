package LeetCode;

import javafx.util.Pair;

import java.util.*;

public class P155_Min_Stack {

    Stack<Pair<Integer, Integer>> stack;
    public P155_Min_Stack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            stack.add(new Pair<>(val,val));
        } else {
            int min = stack.peek().getValue();
            if(val < min){
                min = val;
            }
            stack.add(new Pair<>(val,min));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().getKey();
    }

    public int getMin() {
        return stack.peek().getValue();
    }




 /*
    List<Integer> list;
    int lastIndex;
    public P155_Min_Stack() {
        list = new ArrayList<>();
        lastIndex = 0;
    }

    public void push(int val) {
        list.add(val);
        lastIndex = list.size() - 1;
    }

    public void pop() {
        list.remove(lastIndex--);
    }

    public int top() {
        return list.get(lastIndex);
    }

    public int getMin() {
        return Collections.min(list);
    }
*/




/*
    int index;
    int increment = 4;
    Integer[] values;
    public P155_Min_Stack() {
        values = new Integer[4];
        index = -1;
    }

    public void push(int val) {
        values[++index]=val;
        if(index == values.length-1){
            values = Arrays.copyOf(values,values.length+increment);
        }
    }

    public void pop() {
        index--;
    }

    public int top() {
        return values[index];
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int n = 0; n <= index; n++){
            if(values[n]<min){
                min=values[n];
            }
        }
        return min;
    }
   */
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */