package Codewars;

public class Spiralizor {
    public static int[][] spiralize(int size) {
        int[][] arr = new int[size][size];
        int x = 0;
        int y = 0;
        int xMin = 0;
        int xMax = size-1;
        int yMin = 0;
        int yMax = size-1;
        while(true){
            if(y == yMax && x == xMin){
                xMax-=2;
                yMin+=2;
            }
            else if(y == yMin && x == xMin && x != y)
                yMax-=2;
            else if(y == yMin && x == xMax && yMin != xMin){
                xMin+=2;
            }
            if(x<xMax && y==yMin){
                arr[y][x] = 1;
                x++;
            } else if (x==xMax && y < yMax){
                arr[y][x] = 1;
                y++;
            } else if (y==yMax && x>xMin){
                arr[y][x] = 1;
                x--;
            } else if (x==xMin && y > yMin){
                arr[y][x] = 1;
                y--;
            }
            if(yMax<yMin || xMax<xMin){
                if(size%2==1)
                    arr[y][x] = 1;
                break;
            }
        }
        for(int[] m : arr){
            for(int n : m){
                System.out.print(n);
            }
            System.out.println();
        }
        return arr;
    }
}
