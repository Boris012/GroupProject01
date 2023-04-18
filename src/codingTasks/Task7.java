package codingTasks;

public class Task7 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of
        //Fibonacci series.
        // 1+(1=2) ; 1+2=3 ; 2+3=5 ; 3+5=8 ;....
        int n = 10;
        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }


    }
}


