package operatorler;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double kilo;
        int boy;
        Scanner tara =new Scanner(System.in);
        System.out.println("***** vücüut kitle indeksi hesaplama******");
        System.out.println("lütfen kilo giriniz");
        kilo= tara.nextDouble();
        System.out.println("boyunuzu giriniz");
        boy =tara.nextInt();
        double metre= (double) boy /100 ;
        double karesi=Math.pow(metre,2);
        double endeks=kilo/karesi;
        System.out.println("endeks:" + endeks);

    }
}
