import java.util.Scanner;

public class Homework4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input positive number");
            number = scan.nextInt();
        } while(number < 0);

        System.out.println("Sum = " + getSum(number));
    }

    public static int getSum(int number) {
        //  method finds the sum of positive numbers up to the given number
        int sum = 0;
        int i = 0;
        do {
            sum += i++;
        } while (i <= number);
        return sum;
    }

}