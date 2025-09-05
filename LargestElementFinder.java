import java.util.Scanner;

public class LargestElementFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[n];

        // Input elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find the largest element
        int largestElement = findLargestElement(array);

        System.out.println("The largest element in the array is: " + largestElement);

        scanner.close();
    }

    private static int findLargestElement(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
