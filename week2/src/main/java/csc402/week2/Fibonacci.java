package csc402.week2;

public class Fibonacci {
    public static int fibonacci(int n) {

        if (n <= 1) { // Base cases
            return n;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls
    }

    public static int fib_iterative(int n){
        if (n <= 1) { // Base cases
            return n;
        }

        int prev1 = 0;
        int prev2 = 1;
        int current = 0;

        for(int i=2; i <= n; i++)
        {
            current = prev1+prev2;
            prev1 = prev2;
            prev2 = current;
        }
        
        return current;
    }

    public static void main(String[] args) {
        int n = 50;
        long start = System.currentTimeMillis();
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        long stop = System.currentTimeMillis();
        long elapsed = stop - start;
        float seconds = elapsed / 1000;
        System.out.println("Fibonacci recursion took " + seconds + "seconds");

        start = System.currentTimeMillis();
        System.out.println("Fibonacci number at position " + n + " is: " + fib_iterative(n));
        stop = System.currentTimeMillis();
        elapsed = stop - start;
        seconds = elapsed / 1000;
        System.out.println("Fibonacci non-recursion took " + seconds + "seconds");

    }
}