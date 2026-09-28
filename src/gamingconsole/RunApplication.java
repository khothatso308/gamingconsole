/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gamingconsole;

/**
 *
 * @author Admin
 */



import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String consoleType = "";
        String store;
        int totalSales;

        // Display console options
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.println();

        // Get console choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        // Determine console type
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Get store name
        System.out.print("Enter the store: ");
        store = scanner.nextLine();

        // Get total sales
        System.out.print("Enter the total sales of "
                + consoleType + " consoles for "
                + store + ": ");
        totalSales = scanner.nextInt();

        // Create ConsoleSales object
        ConsoleSales sales = new ConsoleSales(
                consoleType,
                store,
                totalSales
        );

        // Print report
        sales.printReport();

        scanner.close();
    }
}