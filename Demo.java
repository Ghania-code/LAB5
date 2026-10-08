public class Demo{
public static void main(String args[]){
Product P1=new Product("Ghania",4200.0,2);
System.out.println("Information of first object");
P1.displayProduct();

Product P2=new Product("Shazeena",4500.0,3);
System.out.println("Information of second object");
P2.displayProduct();


Product P3=new Product("Sohaib",9000.0,7);
System.out.println("Information of Third object");
P3.displayProduct();



Product P4=new Product("Haseeb",2000.0,6,new Date(8,10,2026));
System.out.println("Information of Fourth object");
P4.displayProduct();

Product.displayMaxMin();




}
}

