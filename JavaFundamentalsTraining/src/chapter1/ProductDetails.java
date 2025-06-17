package chapter1;
/*This class will demonstrate the use
* of escape characters*/
public class ProductDetails {
    public static void main(String[] args) {
        //1. Declare and initialize
        String productName = "Mango";
        double price = 10;
        boolean inStock = true;

        //2. Consume
//        System.out.println("Product Name: " + productName);
//        System.out.println("Price: " + "R" + price);
//        System.out.println("In Stock: " + inStock);

        System.out.println("Product Name: " + productName + "\n" +
        "Price: " + "R" + price + "\n" + "In Stock? " + inStock);

        System.out.println("=========================================");
        //Name      Price       In Stock
        //Mango     10.55       true
        System.out.println("Name\tPrice\tIn Stock?");
        System.out.println("--------------------------");
        System.out.println(productName + "\t" + price + "\t" + inStock);
        System.out.println("Apple\t5.25\t" + inStock);
        System.out.println("\nMilk\t15.55\t" + inStock);
        System.out.println("Bread\t18.00\t" + inStock);
        System.out.println("Rice\t" + price * 3 + "\t" + inStock);

    }
}
