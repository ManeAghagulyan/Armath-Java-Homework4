import java.util.Scanner;

public class Homework4_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input number >0");
            number = scan.nextInt();
        } while(number < 1);
        if(isPolindrom(number)){
            System.out.println("Number is polindrom");
        }
        else {
            System.out.println("Number isn't polindrom");
        }
    }

    public static boolean isPolindrom(int num) {
        //  method checks if given integer is palindrome or not
        int num1 = num, num2 = 0, num3;
        while (num1 > 0) {
            num3 = num1 % 10;
            num2 = num2 * 10 + num3;
            num1 /= 10;
        }
        if (num == num2) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}