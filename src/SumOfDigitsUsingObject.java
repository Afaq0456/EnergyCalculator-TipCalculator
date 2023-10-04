import java.util.Scanner;

public class SumOfDigitsUsingObject {
    private int number;

    // Constructor to initialize the object with the provided number.
    public SumOfDigitsUsingObject(int number) {
        this.number = number;
    }

    // Method to calculate and return the sum of the digits.
    public int calculateSumOfDigits() {
        int sum = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            tempNumber /= 10; // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number between 0 and 1000.
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // Check if the entered number is within the valid range.
        if (number < 0 || number > 1000) {
            System.out.println("Please enter a valid number between 0 and 1000.");
        } else {
            // Create an instance of SumOfDigitsUsingObject with the user-provided number.
            SumOfDigitsUsingObject calculator = new SumOfDigitsUsingObject(number);
            int sum = calculator.calculateSumOfDigits();

            // Display the sum of the digits.
            System.out.println("The sum of the digits is " + sum);

            // Check if the sum is even or odd and display the result.
            if (sum % 2 == 0) {
                System.out.println("The sum is even.");
            } else {
                System.out.println("The sum is odd.");
            }
        }

        // Close the Scanner.
        input.close();
    }
}
