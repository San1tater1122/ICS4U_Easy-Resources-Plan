package service;

// responsible by San1tater

import java.util.Scanner;

import main.Main;
import ui.Colours;

public class ReturnToMainMenu {
    public static boolean returnCommand(){
        System.out.println("Type /return to return to the main menu");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        if(command.equals("/return")){
            Main.returnCommand = true;
            return true;
        }else if(command.equals("/help")){
            Help.help();
        }else{
            System.out.println(Colours.RED + "Unknown command! Use /help to check command or /return to return to the main menu" + Colours.RESET);
        }
        return returnCommand(); // Until user type /return
    }
}
