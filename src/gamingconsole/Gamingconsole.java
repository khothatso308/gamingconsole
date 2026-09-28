/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamingconsole;

/**
 *
 * @author Admin
 */
public class Gamingconsole {

    public class gamingConsoleTestOne {
    public static void main(String[] args) {
        // 1D Array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // 2D Array for sales [City][Console: PS5, XBOX, SWITCH]
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // Header
        System.out.println("-----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-18s%-12s%-12s%-12s%n", "", "PS5", "XBOX", "SWITCH");

        // Display individual city sales
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-12d%-12d%-12d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        // Section for totals
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        // Calculate and display row totals and find the highest selling city
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-18s%-12d%n", cities[i], cityTotal);

            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        // Display city with highest sales
        System.out.println("\nCITY WITH THE MOST SALES: " + topCity);
        System.out.println("-----------------------------------------------------------------");
    }
}
}



//question 2

    
    

