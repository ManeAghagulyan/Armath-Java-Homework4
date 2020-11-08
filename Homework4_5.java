public class Homework4_5 {
    public static void main(String[] args) {
        int[] array = {10, 30, 50, -9, -6, 5};

        System.out.println("Index of smallest element is " + getIndexOfMin(array));
    }

    public static int getIndexOfMin(int[] arr) {
        //  method returns the index of the smallest element.
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

}