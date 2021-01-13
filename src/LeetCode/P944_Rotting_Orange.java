package LeetCode;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class P944_Rotting_Orange {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        int freshOrange = 0;
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                if(grid[x][y] == 2) {
                    queue.add(new Pair<Integer, Integer>(x,y));
                } else if(grid[x][y] == 1) {
                    freshOrange++;
                }
            }
        }

        int count = -1;
        Queue<Pair<Integer, Integer>> newQueue = new LinkedList<>();
        while(!queue.isEmpty()) {
            Pair<Integer,Integer> rottedOrangePos = queue.poll();
            int rox = rottedOrangePos.getKey();
            int roy = rottedOrangePos.getValue();
            if(0<=rox-1) {
                if(grid[rox-1][roy] == 1) {
                    newQueue.add(new Pair<>(rox-1,roy));
                    grid[rox-1][roy] = 2;
                    freshOrange--;
                }
            }
            if(rox+1<grid.length) {
                if(grid[rox+1][roy] == 1) {
                    newQueue.add(new Pair<>(rox + 1, roy));
                    grid[rox+1][roy] = 2;
                    freshOrange--;
                }
            }
            if(0<=roy-1) {
                if(grid[rox][roy-1] == 1) {
                    newQueue.add(new Pair<>(rox, roy - 1));
                    grid[rox][roy-1] = 2;
                    freshOrange--;
                }
            }
            if(roy+1<grid[rox].length) {
                if(grid[rox][roy+1] == 1) {
                    newQueue.add(new Pair<>(rox,roy+1));
                    grid[rox][roy+1] = 2;
                    freshOrange--;
                }
            }

            if(queue.isEmpty()) {
                count++;
                queue.addAll(newQueue);
                newQueue.clear();
            }
        }

        if(freshOrange != 0)
            return -1;
        else if(count == -1)
            return 0;
        return count;
    }




    public int orangesRotting2(int[][] grid) {
        Queue<Pair<Integer, Integer>> queue = new ArrayDeque();

        // Step 1). build the initial set of rotten oranges
        int freshOranges = 0;
        int ROWS = grid.length, COLS = grid[0].length;

        for (int r = 0; r < ROWS; ++r)
            for (int c = 0; c < COLS; ++c)
                if (grid[r][c] == 2)
                    queue.offer(new Pair(r, c));
                else if (grid[r][c] == 1)
                    freshOranges++;

        // Mark the round / level, _i.e_ the ticker of timestamp
        queue.offer(new Pair(-1, -1));

        // Step 2). start the rotting process via BFS
        int minutesElapsed = -1;
        int[][] directions = { {-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        while (!queue.isEmpty()) {
            Pair<Integer, Integer> p = queue.poll();
            int row = p.getKey();
            int col = p.getValue();
            if (row == -1) {
                // We finish one round of processing
                minutesElapsed++;
                // to avoid the endless loop
                if (!queue.isEmpty())
                    queue.offer(new Pair(-1, -1));
            } else {
                // this is a rotten orange
                // then it would contaminate its neighbors
                for (int[] d : directions) {
                    int neighborRow = row + d[0];
                    int neighborCol = col + d[1];
                    if (neighborRow >= 0 && neighborRow < ROWS &&
                            neighborCol >= 0 && neighborCol < COLS) {
                        if (grid[neighborRow][neighborCol] == 1) {
                            // this orange would be contaminated
                            grid[neighborRow][neighborCol] = 2;
                            freshOranges--;
                            // this orange would then contaminate other oranges
                            queue.offer(new Pair(neighborRow, neighborCol));
                        }
                    }
                }
            }
        }

        // return elapsed minutes if no fresh orange left
        return freshOranges == 0 ? minutesElapsed : -1;
    }
}
