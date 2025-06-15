// E-Commerce Product Catalog
// subclass for Grocery
import java.time.LocalDate;

class Product{
    public String name;
    protected double price;
    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Product name :" + name);
        System.out.println("Product price : $" + price);
    }
}

class Electronics extends Product{
    private int warrantyPeriod;
    public Electronics(String name, double price, int warrantyPeriod){
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty period : " + warrantyPeriod + " months");
    }
}

class Clothing extends Product{
    private String size;
    private String material;
    public Clothing(String name, double price, String size, String material){
        super(name,price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size : " + size);
        System.out.println("Material : " + material);
    }
}


class Grocery extends Product{
    private LocalDate expiryDate;
    public Grocery(String name, double price, LocalDate expiryDate){
        super(name,price);
        this.expiryDate = expiryDate;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Expiry Date : " + expiryDate);
    }
}
public class ProductCatalog{
    public static void main(String[] args){
        Product electronic = new Electronics("Samsung S25 utra",1999.99,24);
        Product cloth = new Clothing("Hermès C.D.S. varsity jacket",2025,"L","100% cotton");
        Product grocery = new Grocery("Milk", 14.5,LocalDate.of(2025,7,15)); // Set local date or expiry date 

        System.out.println("=== ELECTRONICS ===");
        electronic.displayDetails();
        System.out.println("\n=== CLOTHING ===");
        cloth.displayDetails();
        System.out.println("\n=== Grocery ===");
        grocery.displayDetails();
    }
}