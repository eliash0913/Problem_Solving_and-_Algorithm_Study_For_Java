package CodeSignal;

import java.util.Stack;

public class ReverseInParentheses {
    String reverseInParentheses(String inputString) {
        Stack<Character> stack = new Stack<>();
        for(int index = 0; index < inputString.length(); index++){
            char c = inputString.charAt(index);
            if(c==')'){
                String temp = "";
                while(stack.peek()!='('){
                    temp+=stack.pop();
                }
                stack.pop();
                for(int j = 0; j < temp.length(); j++){
                    stack.add(temp.charAt(j));
                }
            } else {
                stack.add(c);
            }
        }
        String result = "";
        while(!stack.isEmpty()){
            result = stack.pop() + result;
        }
        return result;
    }
}
