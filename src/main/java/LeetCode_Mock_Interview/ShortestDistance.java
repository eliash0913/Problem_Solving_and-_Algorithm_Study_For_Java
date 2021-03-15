package LeetCode_Mock_Interview;
//TODO: UNDONE
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://leetcode.com/problems/the-maze-ii/
public class ShortestDistance {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        int [][] directions = new int[][] {{1,0}, {0,1}, {-1,0}, {0,-1}};

        Queue<int[]> queue = new LinkedList<>(Arrays.asList(start));
        visited[start[0]][start[1]] = true;
        int count = 0;

        while(!queue.isEmpty()) {
            int[] pos = queue.poll();
            for(int[] direction : directions) {
                int x = pos[0]+direction[0];
                int y = pos[1]+direction[1];
                if(x < maze.length && y < maze[0].length && 0 <= x && 0 <= y) {
                    if(x == destination[0] && y == destination[1])
                        return count;
                    if (maze[x][y] == 0 && !visited[x][y]) {
                        System.out.println("("+x+","+y+")");
                        visited[x][y] = true;
                        queue.add(new int[]{x, y});
                    }
                }
            }
            count++;
        }
        return -1;
    }

    boolean isValid(int[][] maze, int x, int y) {
        if(maze[x][y] == 0) {
            return true;
        }
        return false;
    }
}
