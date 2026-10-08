public class Product{
private String ID;
private double price;
private int qty;
String name;
static int count=1;
static private double maxPrice=0;
static private double minPrice=Double.MAX_VALUE;

Product(String name,double price,int qty){
	this(name,price,quantity,new Date(1,1,1));
}

Product(String name,double price, int quantity, Date md){
    this.name=name;
	this.price=price;
	this.ID="P"+String.format("%03d",count++);
	this.qty=qty;
        this.md=md;

	if(price>maxPrice){
		maxPrice=price;
	}
	if(price<minPrice){
		minPrice=price;
     }
}


public void displayProduct(){
	System.out.println("Name:"+name);
	System.out.println("Price:"+price);
	System.out.println("quantity:"+qty);
	System.out.println("ID:"+ID);
        System.out.println("Manufacturing date:%d \n",md);
}

static void displayMaxMin(){
	System.out.println("Maximum price:"+maxPrice);
	System.out.println("Minimum price:"+minPrice);

}

}



 