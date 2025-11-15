/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAnalyze;

import java.io.*;
import java.util.Properties;
import java.util.ArrayList;
import model.Product;
import main.LoginUI;

/**
 *
 * @author zhuangjinghao
 */
public class RebuildProductProperties {

    
    public static void rebuildProductProperties(ArrayList<Product> products){
        
        File file = new File("data/products.properties");
        file.getParentFile().mkdirs(); // 确保目录存在

        Properties props = new Properties();

        // 遍历所有产品
        int index = 0;
        for (Product p : products) {
            if (p == null) continue; // 安全检查
            props.setProperty("product" + index + ".id", String.valueOf(p.getID()));
            props.setProperty("product" + index + ".ProductName", p.getProductName());
            props.setProperty("product" + index + ".ProductPrice", String.valueOf(p.getProductPrice()));
            props.setProperty("product" + index + ".ProductCategory", p.getProductCategory());
            props.setProperty("product" + index + ".ProductSupplier", p.getProductSupplier());
            props.setProperty("product" + index + ".stock", String.valueOf(p.getStock()));
            index++;
        }

        // 写入文件（覆盖旧文件）
        try (FileOutputStream out = new FileOutputStream(file)) {
            props.store(out, "Rebuilt Product Data by: " + LoginUI.currentUser);
            System.out.println("✅ Successfully rebuilt data/products.properties");
        } catch (IOException e) {
            System.err.println("❌ Failed to rebuild product.properties: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
