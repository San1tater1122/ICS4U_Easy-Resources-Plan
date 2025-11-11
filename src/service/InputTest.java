package service;

// Responsible by San1tater

import java.util.Scanner;

public class InputTest {
    public static boolean integerInputTest(String input){
        Scanner sc = new Scanner(System.in);
        int output;
        try {
            output = Integer.parseInt(input);
            if(output < 0){
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean floatInputTest(String input){
        Scanner sc = new Scanner(System.in);
        float output;
        try {
            output = Float.parseFloat(input);
            if(output < 0){
                return false;
            }        
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
