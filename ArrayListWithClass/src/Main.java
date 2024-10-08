import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<customer> customers = new ArrayList<customer>();
        customer enes = new customer(1,"enes","aksoy");
        customers.add(enes);
        customers.add(new customer(2,"ahmet","aksoy"));
        customers.add(new customer(3,"furkan","aksoy"));
        customers.remove(enes);
        for(customer i:customers){
            System.out.println(i.firstname);
        }
    }
}