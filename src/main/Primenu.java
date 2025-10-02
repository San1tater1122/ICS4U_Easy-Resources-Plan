package main;

import java.util.Scanner;
import ui.Colours;

//Created by MN
// bug fixed by San1tater

public class Primenu {
    public static void primenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(Colours.BLUE + "ERP Menu");
        System.out.println(Colours.RESET + "1: Products Information");
        System.out.println(Colours.RESET + "2: Purchasing Management");
        System.out.println(Colours.RESET + "3: Sales Management");
        System.out.println(Colours.RESET + "4: Storage Management");
        System.out.println(Colours.RESET + "5: System Parameter");
        System.out.println(Colours.RESET + "6: Consultant & Statement");
        System.out.println(Colours.RESET + "7: User Permission");
        System.out.println(Colours.RESET + "8: Log Out");
        System.out.println(Colours.BLUE + "Choose Function to Use:");

        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                System.out.print(Colours.GREEN + "前面的区域，以后再来探索吧");
                break;

            case "2":
                System.out.print(Colours.RESET + "前面的区域，以后再来探索吧");
                break;

            case "3":
                System.out.print(Colours.RESET + "前面的区域，以后再来探索吧");
                break;
                    
            case "4":
                System.out.print(Colours.RESET + "前面的区域，以后再来探索吧");
                break;

            case "5":
                System.out.print(Colours.RESET + "前面的区域，以后再来探索吧");
                break;
                    
            case "6":
                System.out.print(Colours.RESET + "前面的区域，以后再来探索吧");
                break;

            case "7":
                System.out.print(Colours.RESET + "前面的区域，以后再来探索吧");
                break;

            case "8":
                System.out.print(Colours.RESET + "前面的区域，以后再来探索吧");
                break;

            default:
                System.out.println(Colours.RED + "This is NOT a Function");
        }
    }
}
