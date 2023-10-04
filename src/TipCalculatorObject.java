import java.util.Scanner;

public class TipCalculatorObject {
    private double subtotal;
    private double gratuityRate;

    // Constructor to initialize the object with subtotal and gratuityRate.
    public TipCalculatorObject(double subtotal, double gratuityRate) {
        this.subtotal = subtotal;
        this.gratuityRate = gratuityRate;
    }

    // Method to calculate and return the gratuity amount.
    public double calculateGratuity() {
        return (subtotal * gratuityRate) / 100;
    }

    // Method to calculate and return the total bill amount.
    public double calculateTotal() {
        return subtotal + calculateGratuity();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the subtotal.
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        // Prompt the user to enter the gratuity rate in percentage.
        System.out.print("Enter the gratuity rate (in percentage): ");
        double gratuityRate = input.nextDouble();

        // Create an instance of TipCalculatorObject with user-provided values.
        TipCalculatorObject calculator = new TipCalculatorObject(subtotal, gratuityRate);

        // Calculate and display the gratuity amount.
        System.out.println("The gratuity is AED " + calculator.calculateGratuity());

        // Calculate and display the total bill amount.
        System.out.println("The total is AED " + calculator.calculateTotal());

        // Close the Scanner.
        input.close();
    }
}
