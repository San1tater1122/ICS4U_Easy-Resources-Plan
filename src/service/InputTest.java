package service;

// Responsible by San1tater

import java.util.Scanner;

public class InputTest {
    public static int integerInputTest(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output;

        while (true) {
            try {
                output = Integer.parseInt(input);
                if(output < 0){
                    System.out.println("You have to input a positive integer!");
                    input = sc.nextLine();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("You have to input a positive integer!");
                input = sc.nextLine();
            }
        }

        return output;
    }


}
