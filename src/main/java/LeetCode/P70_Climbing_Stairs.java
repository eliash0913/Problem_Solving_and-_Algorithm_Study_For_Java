package LeetCode;

public class P70_Climbing_Stairs {
    public int climbStairs(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        int[] memory = new int[3];
        memory[0]=1;
        memory[1]=2;
        memory[2]=memory[0]+memory[1];
        for(int i = 4; i <= n; i++){
            memory[0]=memory[1];
            memory[1]=memory[2];
            memory[2]=memory[0]+memory[1];
        }
        return memory[2];
    }
}
