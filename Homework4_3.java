import java.util.Scanner;

public class Homework4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input number >0");
            number = scan.nextInt();
        } while(number < 1);

        System.out.println("Number in the reverse order");
        ExtractDigits(number);
    }

    public static void ExtractDigits(int number) {
        //  method extracts each digit from an int, in the reverse order
        while(number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
    }

}