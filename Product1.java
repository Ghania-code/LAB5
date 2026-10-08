public class Product1{
    private String ID;
    private double price;
    private int qty;
    String name;
    
   static int count = 1;
   static private double maxPrice = 0;
   static private double minPrice = Double.MAX_VALUE;

 
   Product1(String name, double price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.ID = "P"+String.format("%03d", count++);

        if(price > maxPrice) {
            maxPrice=price;
        }
        if(price < minPrice) {
            minPrice = price;
        }
    }
       
        

    public void displayProduct(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("ID: " + ID);
       
    }

    public static void displayMaxMin(){
        System.out.println("Maximum price: " + maxPrice);
        System.out.println("Minimum price: " + minPrice);
    }
}