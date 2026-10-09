public class New{
  private String name;
  private String ID;
  private int qty;
  private double price;
  static int count=0;
  static double maxPrice;
  static double minPrice;

  New(String name,double price,int qty){
       this.name=name;
       this.price=price;
       this.qty=qty;
       this.ID=String.format("P%03d",count++);
       
       if(count==1){
           minPrice=price;
           maxPrice=price;
       }
       
       if(count>1){
           if(price>maxPrice){
              maxPrice=price;
           }
           if(price<minPrice){
              minPrice=price;
           }
       }
  }

 public void displayNew(){
       System.out.printf("Name: %s \n",name);
       System.out.printf("ID :%s \n",ID);
       System.out.printf("Quantity:%d \n",qty);
       System.out.printf("Price: %.2f \n",price);
       System.out.printf("Maximum price:%.2f \n",maxPrice);
       System.out.printf("Minimum price:%.2f \n",minPrice);
 }

 public static void displayMaxMin(){
       System.out.printf("Maximum price:%.2f \n",maxPrice);
       System.out.printf("Minimum price:%.2f \n",minPrice);
     
 }
}
      

   
       
        