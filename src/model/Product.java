package model;

public class Product {
    private short id;
    private String ProductName;
    private int ProductPrice;
    private String ProductCategory;
    private String ProductSupplier;

    public Product(short id, String ProductName, int ProductPrice, String ProductCategory, String ProductSupplier){
        this.id = id;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductCategory = ProductCategory;
        this.ProductSupplier = ProductSupplier;
    }

    public short getID(){return id;}
    public String getProductName(){return ProductName;}
    public int getProductPrice(){return ProductPrice;}
    public String getProductCategory(){return ProductCategory;}
    public String getProductSupplier(){return ProductSupplier;}

    public short resetID(short ID){return this.id = ID;}
    public String resetProductName(String PN){return this.ProductName = PN;}
    public int resetProductPrice(int PP){return this.ProductPrice = PP;}
    public String resetProductCategory(String PC){return this.ProductCategory = PC;}
    public String resetProductSupplier(String PS){return this.ProductSupplier = PS;}

    public String toCSV(){
        return id + "," + ProductName + "," + ProductPrice + "," + ProductCategory + "," + ProductSupplier;
    }
}
