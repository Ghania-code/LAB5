public class Demo1{
    public static void main(String args[]) {
        Product1 P1 = new Product1("Sumavia", 4200.0, 2);
        System.out.println("Information of first object:");
        P1.displayProduct();

        Product1 P2 = new Product1("Shazeena", 4500.0, 3);
        System.out.println("Information of second object:");
        P2.displayProduct();

        Product1 P3 = new Product1("Sohaib", 9000.0, 7);
        System.out.println("Information of Third object:");
        P3.displayProduct();

        Product1 P4 = new Product1("Haseeb", 2000.0, 6);
        System.out.println("Information of Fourth object:");
        P4.displayProduct();

        Product1.displayMaxMin();
    }
}