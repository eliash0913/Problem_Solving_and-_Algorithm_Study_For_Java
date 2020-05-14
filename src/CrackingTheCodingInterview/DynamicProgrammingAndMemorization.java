package CrackingTheCodingInterview;

public class DynamicProgrammingAndMemorization {
    //Recursive
    int fibonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-2) + fibonacci(n-1);
    }

    //Top-down Dynamic (or Memorization)
    int fibonacciDTD(int n) {
        return fibonacciDTD(n, new int[n+1]);
    }

    int fibonacciDTD(int n, int[] memo) {
        if(n==0 || n==1)
            return n;
        if(memo[n] == 0)
            memo[n] = fibonacciDTD(n-1, memo) + fibonacciDTD(n-2, memo);
        return memo[n];
    }

    //Bottom-up Dynamic
    int fibonacciDBU(int n){
        if(n == 0 || n== 1)
            return n;
        int[] memo = new int[n];
        memo[0]=0;
        memo[1]=1;
        for(int i = 2; i < n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n-1]+memo[n-2];
    }

    //Bottom-up with out array
    int fibonacciDBU2(int n){
        if(n == 0 || n== 1)
            return n;
        int first=0;
        int second=1;
        for(int i = 2; i < n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return first + second;
    }

    public static void main(String[] args) {
        DynamicProgrammingAndMemorization dpam = new DynamicProgrammingAndMemorization();
        for(int i = 0; i < 10; i++)
            System.out.println(dpam.fibonacci(i));

        for(int i = 0; i < 10; i++)
            System.out.println(dpam.fibonacciDTD(i));

        for(int i = 0; i < 10; i++)
            System.out.println(dpam.fibonacciDBU(i));

        for(int i = 0; i < 10; i++)
            System.out.println(dpam.fibonacciDBU2(i));
    }
}
