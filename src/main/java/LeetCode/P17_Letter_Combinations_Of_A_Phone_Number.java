package LeetCode;

import java.util.*;

public class P17_Letter_Combinations_Of_A_Phone_Number {
    Map<String, String> button = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            answer = generate(answer, button.get(String.valueOf(digits.charAt(i))));
        }
        return answer;
    }

    ArrayList<String> generate(ArrayList<String> a, String b) {
        ArrayList<String> output = new ArrayList<>();
        if(a.isEmpty()){
            for(Character x:b.toCharArray())
                output.add(String.valueOf(x));
        } else {
            for (String x : a) {
                for (Character y : b.toCharArray()) {
                    output.add(x + y);
                }
            }
        }
        return output;
    }


    //Solution from Leetcode
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> output = new ArrayList<String>();

    public void backtrack(String combination, String next_digits) {
        // if there is no more digits to check
        if (next_digits.length() == 0) {
            // the combination is done
            output.add(combination);
        }
        // if there are still digits to check
        else {
            // iterate over all letters which map
            // the next available digit
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                // append the current letter to the combination
                // and proceed to the next digits
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }

    public List<String> letterCombinationsA(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }
}
