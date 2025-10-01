package main;

//

import java.io.IOException;
import service.Login;

public class Main {
    public static boolean isAdmin;

    public static void main(String[] args) throws IOException {
        // while(true){
            isAdmin = Login.loginFunction();
            System.out.println("Admin = " + isAdmin);
            // 界面function
        //}

    }
}
