package day16;

public class ExceptionsPractice {

    public static void main(String[] args) {
        // Example of a checked exception:
        // int[] intArray = int[10](); This is wrong therefore editor checks this code.
        // The code should look like...
        // int[] intArray = new int[10];

        // Unchecked exceptions occur at the time your program is executed (logic).
        // System.out.println(intArray[10]);
        // The 10th index doesn't actually exists and so this is the unchecked exception.

        try {
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }

        System.out.println("Finished try-catch.");
    }
}
