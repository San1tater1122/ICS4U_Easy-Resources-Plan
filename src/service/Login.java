package service;

// Responsible by San1tater

import model.User;
import repository.UserPropertiesFileParsing;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import ui.Colours;

public class Login {
    public static boolean loginFunction() throws IOException {
        Scanner sc = new Scanner(System.in);

        List<User> userList = UserPropertiesFileParsing.loadUsers();

        System.out.println(Colours.GREEN + "Username: " + Colours.RESET);
        String userName = sc.nextLine();
        System.out.println(Colours.GREEN + "Password: " + Colours.RESET);
        String userPassword = sc.nextLine();

        boolean isAdmin = false;
        boolean infoCorrect = false;
        while (true){
            for (User user: userList){
                if(user.getUserName().equals(userName) && user.getPassword().equals(userPassword)){
                    infoCorrect = true;
                    System.out.println("Login Success!");
                    if(user.getRole().equals("ADMIN")){
                        isAdmin = true;
                    }
                    break;
                }
            }
            if(infoCorrect){break;}
            System.out.println(Colours.GREEN + "Username or the Password is wrong! ");
            System.out.println("Please re-enter your Username and Password");
            System.out.println("Username: " + Colours.RESET);
            userName = sc.nextLine();
            System.out.println(Colours.GREEN + "Password: " + Colours.RESET);
            userPassword = sc.nextLine();
        }
        return isAdmin;
    }
}
