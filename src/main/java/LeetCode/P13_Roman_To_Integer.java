package LeetCode;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class P13_Roman_To_Integer {
    public int romanToInt(String s) {
        int num = 0;

        int c = 0;
        while (c < s.length()) {
            char current = s.charAt(c);
            if (c + 1 < s.length()) {
                char next = s.charAt(c + 1);
                if (current == 'I' && (next == 'V' || next == 'X')) {
                    num += toInt(next) - 1;
                    c += 2;
                } else if (current == 'X' && (next == 'L' || next == 'C')) {
                    num += toInt(next) - 10;
                    c += 2;
                } else if (current == 'C' && (next == 'D' || next == 'M')) {
                    num += toInt(next) - 100;
                    c += 2;
                } else {
                    num += toInt(current);
                    c++;
                }
            } else {
                num += toInt(current);
                c++;
            }
        }

        return num;
    }

    private static int toInt(char num) {
        switch (num) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
        }
    }
}


