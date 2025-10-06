package service;

// Responsible by San1tater

import model.Product;
import service.InputTest;
import service.ConfirmRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import repository.ProductPropertiesFileParsing;

public class ProductList {
    // the storage for all the product
    private static ArrayList<Product> ProductData;

    static {
        try {
            ProductData = (ArrayList<Product>) ProductPropertiesFileParsing.loadProducts();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 添加商品信息
    public static void addProduct(int id, String ProductName, float ProductPrice, String ProductCategory, String ProductSupplier){
        Product newProduct = new Product(id, ProductName, ProductPrice, ProductCategory, ProductSupplier);
        ProductData.add(newProduct);
        System.out.println("Success! Item " + newProduct.getProductName() + " is added");
    }

    // 删除商品信息 by id
    public static void removeProduct(int id) {
        boolean removed = false;
        for (int i = 0; i < ProductData.size(); i++) {
            if (ProductData.get(i).getID() == id) {
                System.out.println("Product removed: " + ProductData.get(i).getProductName());
                ProductData.remove(i);
                removed = true;
                break; // 找到就删除并退出循环
            }
        }
        if (!removed) {
            System.out.println("No product found with ID: " + id);
        }
    }

    // 删除商品信息 by Name
    public static void removeProduct(String productName) {
        boolean removed = false;
        for (int i = 0; i < ProductData.size(); i++) {
            if (ProductData.get(i).getProductName().equals(productName)) {
                System.out.println("Product removed: " + ProductData.get(i).getProductName());
                ProductData.remove(i);
                removed = true;
                break; // 找到就删除并退出循环
            }
        }
        if (!removed) {
            System.out.println("No product found with Name: " + productName);
        }
    }

    // 修改商品信息 by id
    public static void resetProductChoosing(int i){
        System.out.println("Product information you want to change: ");
        System.out.println("1) Product ID: " + ProductData.get(i).getID());
        System.out.println("2) Product Name: " + ProductData.get(i).getProductName());
        System.out.println("3) Product Price: " + ProductData.get(i).getProductPrice());
        System.out.println("4) Product Category: " + ProductData.get(i).getProductCategory());
        System.out.println("5) Product Supplier: " + ProductData.get(i).getProductSupplier());
        System.out.println("Or type /return to return to the main menu");

        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();
        boolean anyMore = true;
        while (anyMore){
            switch (action) {
                case "1":
                    System.out.println("Please input the New ID: ");
                    ProductData.get(i).resetID(InputTest.integerInputTest());
                    System.out.println("Reset ID success! The new ID for product " + ProductData.get(i).getProductName() + " is " + ProductData.get(i).getID());
                    recursiveReset(i);
                    break;
                case "2":
                    System.out.println("Please input the New Name: ");
                    String name = ConfirmRequest.confirm("Name");
                    ProductData.get(i).resetProductName(name);
                    System.out.println("Reset Name success! The new Name is " + ProductData.get(i).getProductName());
                    recursiveReset(i);
                    break;
                case "3":
                    System.out.println("Please input the New Price: ");
                    ProductData.get(i).resetProductPrice(InputTest.floatInputTest());
                    System.out.println("Reset Price success! The new Price for product " + ProductData.get(i).getProductName() + " is " + ProductData.get(i).getProductPrice());
                    recursiveReset(i);
                    break;
                case "4":
                    System.out.println("Please input the New Name: ");
                    String category = ConfirmRequest.confirm("Category");
                    ProductData.get(i).resetProductCategory(category);
                    System.out.println("Reset Name success! The new Category for product " + ProductData.get(i).getProductName() + " is " + ProductData.get(i).getProductCategory());
                    recursiveReset(i);
                    break;
                case "5":
                    System.out.println("Please input the New Supplier: ");
                    String Supplier = ConfirmRequest.confirm("Supplier");
                    ProductData.get(i).resetProductSupplier(Supplier);
                    System.out.println("Reset Name success! The new Supplier for product " + ProductData.get(i).getProductName() + " is " + ProductData.get(i).getProductSupplier());
                    recursiveReset(i);
                    break;
                case "/return":
                    break;
                default:
                    System.out.println("It is not a valid choice!");
                    resetProductChoosing(i);
            }
        }
    }

    public static void recursiveReset(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you need to reset any other value? [Y/Other]");
        String respond = sc.nextLine();
        if(respond.equals("Y") || respond.equals("y")){
            resetProductChoosing(i);
        }
    }

    public static void resetProduct(int id) {
        boolean found = false;
        for (int i = 0; i < ProductData.size(); i++) {
            if (ProductData.get(i).getID() == id) {
                resetProductChoosing(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No product found with ID: " + id);
        }
    }

    public static void resetProduct(String name) {
        boolean found = false;
        for (int i = 0; i < ProductData.size(); i++) {
            if (ProductData.get(i).getProductName().equals(name)) {
                resetProductChoosing(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No product found with Name: " + name);
        }
    }


    // ---------------------------------------------------------------------------
    // 进销存
    // ---------------------------------------------------------------------------

    // give the product to increase stock 采购管理
    public static void addStock(Product product){
        System.out.println("There is " + product.getStock() + " stock of item " + product.getProductName() + ".");
        System.out.println("How many stock you want to add?");
        product.increaseStock(InputTest.integerInputTest());
        System.out.println("Success! Now you have " + product.getStock() + " stock of item " + product.getProductName() + ".");
    }

    // give the product to decrease stock 销售管理
    public static void decreaseStock(Product product){
        System.out.println("There is " + product.getStock() + " stock of item " + product.getProductName() + ".");
        System.out.println("How many stock you want to remove?");
        int input = InputTest.integerInputTest();
        while (true){
            if(product.getStock() - input < 0){
                System.out.println("Insufficient Stock! You only have " + product.getStock() + " of this item!");
                input = InputTest.integerInputTest();
            }else{
                product.decreaseStock(input);
                break;
            }
        }
        System.out.println("Success! Now you have " + product.getStock() + " stock of item " + product.getProductName() + ".");
    }


}
