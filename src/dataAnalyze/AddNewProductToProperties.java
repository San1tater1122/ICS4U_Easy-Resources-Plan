package dataAnalyze;

// Responsible by San1tater

import java.util.*;
import java.io.*;

public class AddNewProductToProperties {
    private static File file = new File("data/products.properties");
    
    // id, name, price, category, supplier
    public static void addproduct(String id, String name, String price, String category, String supplier) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(file));
        
        
        // find the next available index
        int index = 0;
        while (prop.containsKey("product" + index + ".id")) {
            index++;
        }
        
        prop.setProperty("product" + index + ".id", id);
        prop.setProperty("product" + index + ".ProductName", name);
        prop.setProperty("product" + index + ".ProductPrice", price);
        prop.setProperty("product" + index + ".ProductCategory", category);
        prop.setProperty("product" + index + ".ProductSupplier", supplier);
        prop.setProperty("product" + index + ".stock", "0");

        //product0.id = 1001
        //product0.ProductName = Large Eggs 30pk
        //product0.ProductPrice = 14.74
        //product0.ProductCategory = dairy
        //product0.ProductSupplier = Burnbrae Farms
        //product0.stock = 0

        prop.store(new FileOutputStream(file), "Responsible by San1tater\n");
    }
}
