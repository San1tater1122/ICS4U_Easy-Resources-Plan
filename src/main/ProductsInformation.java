package main;

// Responsible by San1tater

import ui.Colours;
import service.ProductList;
import java.util.Scanner;
import service.InputTest;
import service.ConfirmRequest;

public class ProductsInformation {
    public static void productsInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println(Colours.BLUE + "Products Information Menu" + Colours.RESET);
        System.out.println("1: Add product information");
        System.out.println("2: Remove product information");
        System.out.println("3: Reset product information");
        System.out.println("Choose Function to Use:");
        System.out.println("Or type /return to return to the main menu");

        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                System.out.println(Colours.GREEN + "Add product information" + Colours.RESET);
                System.out.println("New product ID: ");
                int id = InputTest.integerInputTest();
                System.out.println("New product Name: ");
                String name = ConfirmRequest.confirm("Name");
                System.out.println("New product Price: ");
                float price = InputTest.floatInputTest();
                System.out.println("New product Category: ");
                String category = ConfirmRequest.confirm("Category");
                System.out.println("New product Supplier: ");
                String supplier = ConfirmRequest.confirm("Supplier");
                ProductList.addProduct(id, name, price, category, supplier);
                break;
            case "2":
                System.out.println(Colours.GREEN + "Remove product information" + Colours.RESET);
                System.out.println("Input the product name or product id: ");
                String input = sc.nextLine();
                int inputID;
                try {
                    inputID = Integer.parseInt(input);
                    ProductList.removeProduct(inputID);
                    break;
                } catch (NumberFormatException e) {
                }
                ProductList.removeProduct(input);
                break;
            case "3":
                System.out.println(Colours.GREEN + "Reset product information" + Colours.RESET);
                System.out.println("Input the product name or product id: ");
                String input1 = sc.nextLine();
                int inputID1;
                try {
                    inputID1 = Integer.parseInt(input1);
                    ProductList.resetProduct(inputID1);
                    break;
                } catch (NumberFormatException e) {
                }
                ProductList.resetProduct(input1);
                break;
            case "/return":
                Main.returnCommand = true;
                break;
            default:
                System.out.println(Colours.RED + "This is NOT a Function" + Colours.RESET);
                productsInformation();
        }

        ReturnToMainMenu.returnCommand();

    }
}
