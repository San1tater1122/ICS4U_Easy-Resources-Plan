package main;

// responsible by San1tater

import java.io.IOException;
import service.Login;
import ui.Colours;

public class Main {
    public static boolean isAdmin;
    public static boolean priMenu;
    public static boolean returnCommand = true;

    public static void main(String[] args) throws IOException {
        while(true){
            priMenu = true;
            isAdmin = Login.loginFunction();
            System.out.println("Admin = " + isAdmin);
            while (priMenu){
                while(returnCommand){
                    returnCommand = false;
                    System.out.println(Colours.GREEN + "---------------------------------------" + Colours.RESET);
                    Primenu.primenu();
                    System.out.println(Colours.GREEN + "---------------------------------------" + Colours.RESET);
                }
            }
        }

    }
}
