package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello James, congrats on feeling better! :D");

        final double stateTaxRate = 0.04;
        final double countyTaxRate = 0.02;

        double purchasePrice = inputPurchasePrice();

        double stateTax = calculateTax(purchasePrice, stateTaxRate);
        double countyTax = calculateTax(purchasePrice, countyTaxRate);
        double totalTax = calculateTotal(stateTax, countyTax);
        double totalPrice = calculateTotal(purchasePrice, totalTax);

        displayTotals(purchasePrice, stateTax, countyTax, totalTax, totalPrice);
    }

    public static double inputPurchasePrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the item:");
        return Double.valueOf(scanner.nextLine());
    }

    public static double calculateTax(double price, double taxRate) {
        return price * (taxRate / 100.0);
    }

    public static double calculateTotal(double value1, double value2) {
        return value1 + value2;
    }

    public static void displayTotals(double purchasePrice, double stateTax, double countyTax, double totalTax, double totalPrice) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Format to two decimal places

        System.out.println("Purchase Price: $" + decimalFormat.format(purchasePrice));
        System.out.println("State Tax: $" + decimalFormat.format(stateTax));
        System.out.println("County Tax: $" + decimalFormat.format(countyTax));
        System.out.println("Total Tax: $" + decimalFormat.format(totalTax));
        System.out.println("Total Price: $" + decimalFormat.format(totalPrice));
    }
}
