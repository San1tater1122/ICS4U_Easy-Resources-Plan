package dataAnalyze;

// Responsible by San1tater

import java.util.*;
import java.io.*;

public class AddNewUserToProperties {
    private static File file = new File("data/users.properties");

    /**
     *
     * @param id
     * @param UN
     * @param PW
     * @param role
     * @throws IOException
     */
    public static void addUser(String id, String UN, String PW, String role) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(file));

        // find the next available index
        int index = 0;
        while (prop.containsKey("user" + index + ".userID")) {
            index++;
        }

        prop.setProperty("user" + index + ".userID", id);
        prop.setProperty("user" + index + ".userName", UN);
        prop.setProperty("user" + index + ".password", PW);
        prop.setProperty("user" + index + ".role", role);

        prop.store(new FileOutputStream(file), "Responsible by San1tater\n");
    }
}
