import Non_SI_Units.*;
import Unit_Adapters.CentimeterAdapter;
import Unit_Adapters.DecimeterAdapter;
import Unit_Adapters.KilometerAdapter;
import Unit_Adapters.MillimeterAdapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length value in any unit of measurement and it will be converted to the SI system:");
        System.out.println("Attention: The unit should match one of the supported units listed in the program, such as \"millimeters,\" \"centimeters,\" \"decimeters,\" or \"kilometers.\"");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            double quantity;
            String unit;

            System.out.print("Quantity: ");
            if (input.hasNextDouble()) {
                quantity = input.nextDouble();
            } else {
                String userInput = input.next();
                if (userInput.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program.");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number or type 'exit' to quit.");
                    continue;
                }
            }

            System.out.print("Unit: ");
            unit = input.next();

            Unit unitToConvert = null;

            switch (unit) {
                case "millimeters" -> unitToConvert = new MillimeterAdapter(new Millimeter(quantity));
                case "centimeters" -> unitToConvert = new CentimeterAdapter(new Centimeter(quantity));
                case "decimeters" -> unitToConvert = new DecimeterAdapter(new Decimeter(quantity));
                case "kilometers" -> unitToConvert = new KilometerAdapter(new Kilometer(quantity));
                default -> System.out.println("Invalid unit. Please enter a valid unit of measurement.");
            }

            if (unitToConvert != null) {
                System.out.println("Result: ");
                double result = unitToConvert.convertToSI();
                System.out.println(quantity + " " + unit + " is equal to " + result + " metre(s)");
            }
        }
    }
}
