package repository;

// Responsible by San1tater

import model.User;
import java.util.*;
import java.io.*;

public class AddNewUserToProperties {
    private static File file = new File("data/users.properties");

    public static void addUser(User newUser) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(file));

        // find the next available index
        int index = 0;
        while (prop.containsKey("user" + index + ".userID")) {
            index++;
        }

        prop.setProperty("user" + index + ".userID", String.valueOf(newUser.getUserID()));
        prop.setProperty("user" + index + ".userName", newUser.getUserName());
        prop.setProperty("user" + index + ".password", newUser.getPassword());
        prop.setProperty("user" + index + ".role", newUser.getRole());


        prop.store(new FileOutputStream(file), "Responsible by San1tater\nAdded new user" + newUser.getUserName() );
    }
}
