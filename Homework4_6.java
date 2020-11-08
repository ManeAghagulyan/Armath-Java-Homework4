public class Homework4_6 {
    public static void main(String[] args) {
        int[] array = {10, 30, 50, -9, -6, 5};
        System.out.println("Print with for");
        printFor(array);
        System.out.println("\n Print with foreach");
        printForeach(array);
    }

    public static void printFor(int[] arr) {
        //  method prints elemets of array used for
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "th element of array is " + arr[i]);
        }
    }
    public static void printForeach(int[] arr) {
        //  method prints elemets of array used foreach
        for (int element : arr) {
            System.out.print("\t"+ element);
        }
    }
}

// for-ը հնարավորություն է տալիս աշխատել զանգվածի տարրերի հետ դրանց ինդեքսների միջոցով
// forech-ը հնարավորություն է տալիս միանգամից վերցնել զանգվածի տարրերը առանց ինդեքս օգտագործելու