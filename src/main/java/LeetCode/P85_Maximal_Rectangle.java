package LeetCode;

public class P85_Maximal_Rectangle {
    boolean visited[][];

    public int maximalRectangle(char[][] matrix) {
        visited = new boolean[matrix.length][matrix[0].length];
        int maxArea = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == '1') {
                }
            }
        }
        return maxArea;
    }
}
