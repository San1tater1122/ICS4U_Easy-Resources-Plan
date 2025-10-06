package model;

// Responsible by San1tater

public class Product {
    private int id;
    private String ProductName;
    private float ProductPrice;
    private String ProductCategory;
    private String ProductSupplier;
    private int stock;

    public Product(int id, String ProductName, float ProductPrice, String ProductCategory, String ProductSupplier){
        this.id = id;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductCategory = ProductCategory;
        this.ProductSupplier = ProductSupplier;
        this.stock = 0;
    }

    // the port to increase or decrease the number of stock
    public void increaseStock(int input){this.stock += input;}
    public void decreaseStock(int input){this.stock -= input;}

    // all the method to get the information of this product
    public int getID(){return id;}
    public String getProductName(){return ProductName;}
    public float getProductPrice(){return ProductPrice;}
    public String getProductCategory(){return ProductCategory;}
    public String getProductSupplier(){return ProductSupplier;}
    public int getStock(){return stock;}

    // all the method to reset the information for this product
    public void resetID(int ID){this.id = ID;}
    public void resetProductName(String PN){this.ProductName = PN;}
    public void resetProductPrice(float PP){this.ProductPrice = PP;}
    public void resetProductCategory(String PC){this.ProductCategory = PC;}
    public void resetProductSupplier(String PS){this.ProductSupplier = PS;}
    public void resetStock(int newStock){this.stock = newStock;}

    // the method made previously to change to CSV file format.
    public String toCSV(){
        return id + "," + ProductName + "," + ProductPrice + "," + ProductCategory + "," + ProductSupplier;
    }
}
