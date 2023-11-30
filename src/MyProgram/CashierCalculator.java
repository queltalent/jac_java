package MyProgram;

import java.util.Scanner;

public class CashierCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);

        // Constants for tax rates and maximum/minimum values
        final double MIN_GST_RATE = 0;
        final double MAX_GST_RATE = 14;
        final double MIN_QST_RATE = 0;
        final double MAX_QST_RATE = 17;

        // Initialize variables to keep track of invalid inputs and calculate totals
        int invalidInputCount = 0;
        double subTotal = 0;
        double gstRate = 0;
        double qstRate = 0;

        // Prompt the user for the number of items bought [1...10]
        int numItems;
        do {
            System.out.print("Please enter the number of items bought [1...10]: ");
            numItems = kb.nextInt();
            if (numItems < 1 || numItems > 10) {
//                System.out.println("Invalid input. Number of items must be between 1 and 10.");
                invalidInputCount++;
            }
        } while (numItems < 1 || numItems > 10);

        // Input prices of items and calculate subTotal
        for (int i = 1; i <= numItems; i++) {
            double itemPrice;
            do {
                System.out.print("Please enter the price of item " + i + " [1...1000]: ");
                itemPrice = kb.nextDouble();
                if (itemPrice < 1 || itemPrice > 1000) {
//                    System.out.println("Invalid input. Price must be between 1 and 1000.");
                    invalidInputCount++;
                }
            } while (itemPrice < 1 || itemPrice > 1000);
            subTotal += itemPrice;
        }

        // Input GST rate in percentage [0...14]
        do {
            System.out.print("Please enter the tax rate of GST in % [0...14]: ");
            gstRate = kb.nextDouble();
            if (gstRate < MIN_GST_RATE || gstRate > MAX_GST_RATE) {
//                System.out.println("Invalid input. GST rate must be between 0 and 14.");
                invalidInputCount++;
            }
        } while (gstRate < MIN_GST_RATE || gstRate > MAX_GST_RATE);

        // Input QST rate in percentage [0...17]
        do {
            System.out.print("Please enter the tax rate of QST in % [0...17]: ");
            qstRate = kb.nextDouble();
            if (qstRate < MIN_QST_RATE || qstRate > MAX_QST_RATE) {
//                System.out.println("Invalid input. QST rate must be between 0 and 17.");
                invalidInputCount++;
            }
        } while (qstRate < MIN_QST_RATE || qstRate > MAX_QST_RATE);

        kb.close();

        // Calculate taxes and totals
        double gst = (gstRate / 100) * subTotal;
        double qst = (qstRate / 100) * (subTotal + gst);
        double total = subTotal + gst + qst;

        // Display results with formatted output
        System.out.println("\nYou have entered " + invalidInputCount + " invalid inputs.");
        System.out.printf("Sub Total: $ %.2f%n", subTotal);
        System.out.printf("GST: $ %.2f%n", gst);
        System.out.printf("QST: $ %.2f%n", qst);
        System.out.printf("Total: $ %.2f%n", total);
    }


}
