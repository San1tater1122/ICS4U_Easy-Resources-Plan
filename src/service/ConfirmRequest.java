package service;

import java.util.Scanner;

public class ConfirmRequest {
    public static String confirm(String item){
        Scanner sc = new Scanner(System.in);
        String output = sc.nextLine();;
        String confirm = " ";

        while (true){
            System.out.println("Your input is " + output + ". Please Press Y to confirm or ant other to re-input");
            confirm = sc.nextLine().toUpperCase();
            if(confirm.equals("Y")){
                System.out.println("Request Confirmed!");
                break;
            }
            System.out.println("Not confirmed, please re-input the " + item);
            output = sc.nextLine();
        }

        return output;
    }
}
