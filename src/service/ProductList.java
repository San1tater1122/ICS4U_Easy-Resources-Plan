package service;

// Responsible by San1tater

import model.Product;
import java.util.ArrayList;
import static service.InputTest.integerInputTest;

public class ProductList {
    // the storage for all the product
    private ArrayList<Product> ProductData = new ArrayList<>();

    public void addProduct(short id, String ProductName, int ProductPrice, String ProductCategory, String ProductSupplier){
        Product newProduct = new Product(id, ProductName, ProductPrice, ProductCategory, ProductSupplier);
        ProductData.add(newProduct);
        System.out.println("Success! Item " + newProduct.getProductName() + "is added");
    }

    // give the product to increase stock
    public void addStock(Product product){
        System.out.println("There is " + product.getStock() + " stock of item " + product.getProductName() + ".");
        System.out.println("How many stock you want to add?");
        product.increaseStock(integerInputTest());
        System.out.println("Success! Now you have " + product.getStock() + " stock of item " + product.getProductName() + ".");
    }

    // give the product to decrease stock
    public void decreaseStock(Product product){
        System.out.println("There is " + product.getStock() + " stock of item " + product.getProductName() + ".");
        System.out.println("How many stock you want to remove?");
        int input = integerInputTest();
        while (true){
            if(product.getStock() - input < 0){
                System.out.println("Insufficient Stock! You only have " + product.getStock() + " of this item!");
                input = integerInputTest();
            }else{
                product.decreaseStock(input);
                break;
            }
        }
        System.out.println("Success! Now you have " + product.getStock() + " stock of item " + product.getProductName() + ".");
    }
}
