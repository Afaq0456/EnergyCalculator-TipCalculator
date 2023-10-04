import java.util.Scanner;

public class EnergyCalculatorObject {
    // Declare private instance variables to store water weight and temperatures.
    private double waterWeight;
    private double initialTemperature;
    private double finalTemperature;

    // Constructor to initialize the object with water weight and temperatures.
    public EnergyCalculatorObject(double waterWeight, double initialTemperature, double finalTemperature) {
        this.waterWeight = waterWeight;
        this.initialTemperature = initialTemperature;
        this.finalTemperature = finalTemperature;
    }

    // Method to calculate and return the energy needed.
    public double calculateEnergy() {
        // Use the formula to calculate energy in joules.
        double energy = waterWeight * (finalTemperature - initialTemperature) * 4184;
        return energy;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the water weight in kilograms.
        System.out.print("Enter the amount of water in kilograms: ");
        double waterWeight = input.nextDouble();

        // Prompt the user to enter the initial temperature in degrees Celsius.
        System.out.print("Enter the initial temperature in degrees Celsius: ");
        double initialTemperature = input.nextDouble();

        // Prompt the user to enter the final temperature in degrees Celsius.
        System.out.print("Enter the final temperature in degrees Celsius: ");
        double finalTemperature = input.nextDouble();

        // Create an instance of EnergyCalculatorObject with user-provided values.
        EnergyCalculatorObject calculator = new EnergyCalculatorObject(waterWeight, initialTemperature, finalTemperature);

        // Calculate the energy needed using the calculateEnergy() method.
        double energy = calculator.calculateEnergy();

        // Display the result to the user.
        System.out.println("The energy needed is " + energy + " joules.");

        // Close the Scanner.
        input.close();
    }
}
