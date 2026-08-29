/* 
64. TASK 5 - PRODUCT INVENTORY
-----------------------------
Required filename: ProductInventory.java
Create a Product class and a public ProductInventory driver.
Product requirements:
- code, name, unit price, quantity, and a static product counter
- overloaded constructors for zero quantity and supplied quantity
- positive price and non-negative quantity invariants
- restock(int amount)
- sell(int amount), rejecting unavailable quantities
- getInventoryValue()
- static getProductCount()
- toString()
Create several products and demonstrate independent quantities and one shared
static count.
*/
class Product {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;
    private static int productCount = 0;
    public Product(String code, String name, double unitPrice) {
        this.code = code;
        this.name = name;
        if (unitPrice <= 0) {
            System.out.println("Price must be positive");
            this.unitPrice = 0;
        } else {
            this.unitPrice = unitPrice;
        }
        this.quantity = 0;

        productCount++;
    }
    public Product(String code, String name,double unitPrice, int quantity) {
        this.code = code;
        this.name = name;
        if (unitPrice <= 0) {
            System.out.println("Price must be positive");
            this.unitPrice = 0;
        } else {
            this.unitPrice = unitPrice;
        }
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
        productCount++;
    }
    public void restock(int amount) {
        if (amount <= 0) {
            System.out.println("Restock amount must be positive");
            return;
        }
        quantity = quantity + amount;
    }
    public boolean sell(int amount) {
        if (amount <= 0) {
            System.out.println("Sell amount must be positive");
            return false;
        }
        if (amount > quantity) {
            System.out.println("Not enough quantity available");
            return false;
        }
        quantity = quantity - amount;
        return true;
    }
    public double getInventoryValue() {
        return unitPrice * quantity;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public  int getProductCount() {
        return productCount;
    }
    @Override
    public String toString() {
        return "Product{" +
               "code='" + code + '\'' +
               ", name='" + name + '\'' +
               ", unitPrice=" + unitPrice +
               ", quantity=" + quantity +
               ", inventoryValue=" + getInventoryValue() +
               '}';
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("P101","Laptop",50000);
        Product p2 = new Product("P102","Mouse",800,10);
        Product p3 = new Product("P103","Keyboard",1500,5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();
        p1.restock(5);
        System.out.println("After restocking Laptop:");
        System.out.println(p1);
        System.out.println();
        System.out.println("Sell 3 Mouse: " + p2.sell(3));
        System.out.println(p2);
        System.out.println("Sell 20 Mouse: " + p2.sell(20));
        System.out.println(p2);
        System.out.println();
        System.out.println("Laptop quantity: " + p1.getQuantity());
        System.out.println("Mouse quantity: " + p2.getQuantity());
        System.out.println("Keyboard quantity: " + p3.getQuantity());
        System.out.println();
    }
}


