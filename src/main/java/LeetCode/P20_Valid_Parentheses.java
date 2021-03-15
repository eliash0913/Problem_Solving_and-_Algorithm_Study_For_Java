package LeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P20_Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0 || s.length() == 0)
            return false;
        for(int index = 0; index < s.length(); index++){
            if(isOpenSymbol(s.charAt(index)))
                stack.add(s.charAt(index));
            else {
                if(stack.empty())
                    return false;
                if(!isPair(stack.pop(),s.charAt(index))) {
                    return false;
                }
            }
        }
        return stack.size() > 0;
    }

    private boolean isOpenSymbol(Character c) {
        return (c == '(' || c == '[' || c == '{');
    }

    private boolean isPair(Character open, Character close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
