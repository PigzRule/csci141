import java.util.Scanner; // Imported the scanner class

public class Project1 {
    public static void main(String[] args) {

        // Created scanner with the specficied object
        Scanner myObj = new Scanner(System.in);

        // Introduction
        System.out.println(" -- Welcome to EV savings estimator -- ");
        System.out.println(" Please enter the following information: \n");
        
        System.out.print("Enter your local fuel price per gallon: $");
        double gasPricePerGallon = myObj.nextDouble();
        
        System.out.print("Enter your estimated MPG of a gas vehicle: ");
        int estimatedMPG = myObj.nextInt();
        
        System.out.print("Enter an estimated for the kilowatt per hour rate for an electric vehicle: ");
        double estimatedkWhPerMileEV = myObj.nextDouble();
        
        System.out.print("Enter your utility kWh rate: $");
        double utilitykWhRate = myObj.nextDouble();
        
        System.out.print("Finally, enter the total miles you have driven this year: ");
        int totalMilesDriven = myObj.nextInt();
        System.out.print("\n");

        // Calculation implementations
        double calculationsPart1 = ((totalMilesDriven / estimatedMPG) * gasPricePerGallon);
        double calculationsPart2 = ((totalMilesDriven * estimatedkWhPerMileEV) * utilitykWhRate);
        double totalSavingsPerYear = calculationsPart1 -= calculationsPart2;
        
        // Outputting the inputs given from user
        System.out.println("The results are in!!! \n");
        System.out.println("Local fuel price/gallon: $" + gasPricePerGallon);
        System.out.println("Estimated MPG of gas vehicle: " + estimatedMPG);
        System.out.println("Estimated kWh per mile for EV: " + estimatedkWhPerMileEV);
        System.out.println("Utility kWH rate: $" + utilitykWhRate);
        System.out.println("Total miles driven per year: " + totalMilesDriven);
        
        // Calculation results
        System.out.print("\n");
        System.out.println("Calculating ... \n");
        System.out.print("Based on the data provided, you can save $" + totalSavingsPerYear);
        System.out.print(" per year by driving an EV.");
    }
}
