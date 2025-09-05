import java.util.Scanner;

public class MaxSecondMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get array size from user
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        
        // Validate array size
        if (n < 2) {
            System.out.println("Array should have at least 2 elements!");
            return;
        }
        
        // Create and populate array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find max and second max
        findMaxAndSecondMax(arr);
        
        scanner.close();
    }
    
    public static void findMaxAndSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        // Single pass to find both max and second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;  // Update second max before updating max
                max = arr[i];     // Update max
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];  // Update second max
            }
        }
        
        // Display results
        System.out.println("\nArray elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("Maximum element: " + max);
        
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found (all elements are same)");
        } else {
            System.out.println("Second maximum element: " + secondMax);
        }
    }
}
