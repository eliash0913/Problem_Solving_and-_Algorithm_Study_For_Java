package LeetCode;

import java.util.Stack;

public class P682_Baseball_Game {
    public int calPoints(String[] ops) {
        Stack<Integer> scores = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    scores.pop();
                    break;
                case "+":
                    scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
                    break;
                case "D":
                    scores.add(2 * scores.lastElement());
                    break;
                default:
                    scores.add(Integer.parseInt(op));
                    break;
            }
        }
        int points = 0;
        for(int score : scores)
            points+=score;
        return points;
    }
}
