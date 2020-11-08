import java.util.Scanner;

public class Homework4_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {10, 30, 50, -9, -6, 5};
        System.out.println("Input an integer ");
        int number = scan.nextInt();
        if (containsNumber(array, number)) {
            System.out.printf("Array contains given number");
        }
        else {
            System.out.println("Array doesn't contain given element");
        }
    }

    public static boolean containsNumber (int[] arr, int number) {
        //  method  tests if an integer array contains a specific given value
        for (int element : arr) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }
}

// for-ը հնարավորություն է տալիս աշխատել զանգվածի տարրերի հետ դրանց ինդեքսների միջոցով
// forech-ը հնարավորություն է տալիս միանգամից վերցնել զանգվածի տարրերը առանց ինդեքս օգտագործելու