package repository;

// responsible by San1tater

import model.User;
import java.util.*;
import java.io.*;

public class UserPropertiesFileParsing {

    // 读取所有用户到 List<User>
    public static List<User> loadUsers() throws IOException {

        // 作用：创建一个空的 Properties 对象，用来存储键值对数据（key=value）。
        // 用途：后面我们会把文件里的所有 user0.userName=Justin 这样的行加载到这个对象里。
        Properties prop = new Properties();

        // 作用：创建一个 File 对象，代表磁盘上的文件（这里是 "data/users.properties"）。
        // 注意：这一步只是创建 文件的路径对象，并没有真正读取文件内容。
        final String filePath = "data/users.properties";
        File file = new File(filePath);

        // 作用：用 FileInputStream 打开文件，然后把文件内容 加载到 Properties 对象里。
        // 过程：
        // FileInputStream(file) → 打开文件，准备读取字节流
        // prop.load(...) → 解析文件里的每一行 key=value，存进 prop
        // 结果：现在 prop 里就有了所有用户的数据，可以通过 prop.getProperty("user0.userName") 访问
        prop.load(new FileInputStream(file));

        List<User> users = new ArrayList<>();
        int index = 0;

        // 判断 Properties 文件里是否存在当前索引的用户, 当找不到 "userX.userID" 时，说明所有用户都读取完了，循环停止
        while (prop.containsKey("user" + index + ".userID")) {

            short userID = Short.parseShort(prop.getProperty("user" + index + ".userID"));
            String userName = prop.getProperty("user" + index + ".userName");
            String password = prop.getProperty("user" + index + ".password");
            String role = prop.getProperty("user" + index + ".role");

            users.add(new User(userID, password, userName, role));
            index++;
        }
        return users;
    }
}
