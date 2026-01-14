package Lab1_525H0088_HuynhAnhThu;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("----Menu----");
            System.out.println("1. Coca");
            System.out.println("2. Pepsi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Shutdown Machine");
            System.out.print("Please enter the number: ");

            int choice = scanner.nextInt();
            double price = 0;
            String itemName = "";

            switch (choice) {
                case 1:
                    itemName = "Coca";
                    price = 2.0;
                    break;
                case 2:
                    itemName = "Pepsi";
                    price = 2.0; 
                    break;
                case 3:
                    itemName = "Sprite";
                    price = 2.0; 
                    break;
                case 4:
                    itemName = "Snack";
                    price = 1.0; 
                    break;
                case 5:
                    System.out.println("Machine is shutting down.");
                    isRunning = false; 
                    break;
                default:
                    System.out.println("Please enter the valid number.");
            }

            if (isRunning && choice >= 1 && choice <= 4) {
                System.out.print("The price of " + itemName + " is: " + (int)price + "$, please enter the amount of money: ");
                
                double moneyInput = scanner.nextDouble();

                if (moneyInput >= price) {
                    double change = moneyInput - price;
                    System.out.println("Your change is " + change + "$.");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again.");
                }
            }
        }
        scanner.close();
    }
}