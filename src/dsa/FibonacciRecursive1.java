package dsa;
public class FibonacciRecursive1 {
    static int fibonacci(int n) {
        if (n <= 1) { 
            return n; 
        }
           return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(7));
    }
}