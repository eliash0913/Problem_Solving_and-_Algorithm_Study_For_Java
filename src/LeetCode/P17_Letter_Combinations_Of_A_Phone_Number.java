package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P17_Letter_Combinations_Of_A_Phone_Number {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> answer = new ArrayList<>();
        char[][] map = new char[8][4];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int pos = 0;
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 3; j++){
                map[i][j] = alphabet.charAt(pos++);
            }
        }
        map[7][3] = 'z';

        for(int i = 0; i < digits.length(); i++){
            int digit = Integer.parseInt(String.valueOf(digits.charAt(i)))-2;
            for(int j = 0; i != 8 && j < 3 || i == 8 && j < 4 ; j++) {

            }

        }





//        for(int i = 0; i < 8; i++){
//           for(int j = 0; j < 4;j++){
//               if(i!=7 && j<3 || i==7 && j==3) {
//                   System.out.println(map[i][j]);
//               }
//           }
//        }

        return answer;
    }
}
