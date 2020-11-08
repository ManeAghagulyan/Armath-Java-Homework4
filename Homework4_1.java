import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input positive number");
            number = scan.nextInt();
        } while(number < 0);
        System.out.println("Factorial of given number = " + factorial(number));
        System.out.println("Factorial of given number = " + factorialRecursive(number));
    }

    public static int factorial(int n) {
        //  method  returns the factorial of a number
        if (n < 2) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // rekursiv tarberak
    public static int factorialRecursive(int n) {
        //  method  returns the factorial of a number
        if (n < 2) {
            return 1;
        }
        else return n * factorial(n-1);
    }
}