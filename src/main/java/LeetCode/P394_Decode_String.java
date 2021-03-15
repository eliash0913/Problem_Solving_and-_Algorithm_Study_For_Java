package LeetCode;

import java.util.Stack;

public class P394_Decode_String {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int index = 0; index < s.length(); index++){
            String decode= "";
            if(s.charAt(index)==']'){
                while(stack.peek()!='[')
                    decode = stack.pop() + decode;
                stack.pop();
                int numberOfCopy = 1;
                String numberString = "";
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    numberString = stack.pop() + numberString;
                    numberOfCopy = Integer.parseInt(numberString);
                }

                for(int count = 0; count < numberOfCopy; count++){
                    for(Character letter : decode.toCharArray())
                        stack.add(letter);
                }
            } else {
                stack.add(s.charAt(index));
            }
        }
        String result = "";
        while(!stack.isEmpty())
            result = stack.pop() + result;
        return result;
    }
}


//    public String decodeString(String s) {
//        while(s.contains("[")){
//            int endIndex = s.indexOf(']');
//            int startIndex = s.substring(0,endIndex).lastIndexOf('[');
//            int number = 1;
//            String numberString = "";
//            for(int index = startIndex-1; index >= 0; index--){
//                Character digit = s.charAt(index);
//                if(Character.isDigit(digit)){
//                    numberString = digit + numberString;
//                    number = Integer.parseInt(numberString);
//                } else {
//                    break;
//                }
//            }
//            String head = s.substring(0,startIndex-numberString.length());
//            String body = s.substring(startIndex+1, endIndex);
//            String tail = endIndex + 1< s.length() ? s.substring(endIndex+1) : "" ;
//            for(int numberOfCopy = 1; numberOfCopy < number; numberOfCopy++){
//                body+=s.substring(startIndex+1, endIndex);
//            }
//            s = head + body + tail;
//        }
//        return s;
//    }