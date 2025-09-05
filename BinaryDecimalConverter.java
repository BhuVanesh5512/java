import java.util.Scanner;

public class BinaryDecimalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");

        int choice = getUserChoice(scanner);

        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            String binaryInput = scanner.next();

            // Validate binary input
            if (isValidBinary(binaryInput)) {
                int decimalResult = binaryToDecimal(binaryInput);
                System.out.println("Decimal equivalent: " + decimalResult);
            } else {
                System.out.println("Invalid binary input. Please enter a valid binary number.");
            }
        } else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            // Validate decimal input
            if (scanner.hasNextInt()) {
                int decimalInput = scanner.nextInt();
                String binaryResult = decimalToBinary(decimalInput);
                System.out.println("Binary equivalent: " + binaryResult);
            } else {
                System.out.println("Invalid decimal input. Please enter a valid decimal number.");
            }
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }

    private static int getUserChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextInt();
    }

    private static boolean isValidBinary(String binary) {
        return binary.matches("[01]+");
    }

    private static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    private static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
