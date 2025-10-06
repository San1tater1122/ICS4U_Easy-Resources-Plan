package main;

import java.util.Scanner;
import ui.Colours;

//Created by MN
// bug fixed by San1tater

public class Primenu {
    public static void primenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(Colours.BLUE + "ERP Menu" + Colours.RESET);
        System.out.println("1: Products Information");
        System.out.println("2: Purchasing Management");
        System.out.println("3: Sales Management");
        System.out.println("4: Storage Management");
        System.out.println("5: System Parameter");
        System.out.println("6: Consultant & Statement");
        System.out.println("7: User Permission");
        System.out.println("8: Log Out");
        System.out.println("Choose Function to Use:");

        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                ProductsInformation.productsInformation();
                break;

            case "2":
                System.out.println("采购管理");
                break;

            case "3":
                System.out.println("销售管理");
                break;
                    
            case "4":
                System.out.println("仓库管理");
                break;

            case "5":
                System.out.println("系统参数");
                break;
                    
            case "6":
                System.out.println("查询/报表");
                break;

            case "7":
                System.out.println("用户权限");
                break;

            case "8":
                LogOut.logout();
                break;

            default:
                System.out.println(Colours.RED + "This is NOT a Function");
        }
    }
}
