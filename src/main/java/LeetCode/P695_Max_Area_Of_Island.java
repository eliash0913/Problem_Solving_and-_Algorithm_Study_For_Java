package LeetCode;

import java.util.ArrayList;

public class P695_Max_Area_Of_Island {
    boolean[][] traveled;
    ArrayList<Integer[]> island;
    public int maxAreaOfIsland(int[][] grid) {
        traveled = new boolean[grid.length][grid[0].length];
        int areaMax = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1 && traveled[i][j] != true){
                    island = new ArrayList<>();
                    travel(grid,i,j);
                    int area = island.size();
                    if(area>areaMax) {
                        areaMax = island.size();
                    }
                }
            }
        }
        return areaMax;
    }

    void travel(int[][] grid,int i, int j){
        if(grid[i][j]==1 && !traveled[i][j]) {
            island.add(new Integer[]{i,j});
            traveled[i][j] = true;
            int[] shifts = {-1, 1};
            for (int shift : shifts) {
                int x = i + shift;
                int y = j + shift;
                if (x >= 0 && x < grid.length && grid[x][j] == 1 && !traveled[x][j]) {
                    travel(grid, x, j) ;
                }
                if (y >= 0 && y < grid[0].length && grid[i][y] == 1 && !traveled[i][y]) {
                    travel(grid, i, y);
                }
            }
        }
    }
}
