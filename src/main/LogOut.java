package main;

// responsible by San1tater

import ui.Colours;
import java.util.Scanner;

public class LogOut {
    public static void logout(){
        Scanner sc = new Scanner(System.in);
        System.out.println(Colours.BLUE + "Log out Menu" + Colours.RESET);
        System.out.println("1: Log out of your account");
        System.out.println("2: exit the Program");
        System.out.println("Or type /return to return to the last menu");

        String action = sc.nextLine();

        while (true){
            if(action.equals("1")){
                Main.priMenu = false;
                System.out.println("Successful Log Out!");
                break;
            } else if (action.equals("2")) {
                sc.close();
                System.exit(0);
            } else if (action.equals("/return")) {
                break;
            } else{
                System.out.println(Colours.RED + "This is NOT a Function");
            }
        }

    }
}
