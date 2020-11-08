import java.util.Scanner;

public class Homework4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input positive number");
            number = scan.nextInt();
        } while(number < 1);
        System.out.println("Fibonacci numbers are)");
        fibon(number);

        System.out.println("\nFibonacci numbers are (with recursive function)");
        int fib = 1;
        while(fibonRecursive(fib) <= number) {
            System.out.print(fibonRecursive(fib) + "\t");
            fib += 1;
        }
    }

    public static void fibon(int n) {
        //  method prints Fibonacci series, up to a given number
        int prev1 = 0;
        int prev2 = 0;
        int next = 1;
        while (next <= n){
            System.out.print(next + "\t");
            prev1 = prev2;
            prev2 = next;
            next = prev1 + prev2;
        }
    }

    // rekursiv tarberak
    public static int fibonRecursive(int n) {
        //  method  returns the Fibonacci number up to a given number
        if (n <= 2) {
            return 1;
        }
        else return fibonRecursive(n-1) + fibonRecursive(n-2);
    }
}