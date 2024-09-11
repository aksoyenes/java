package operatorler;

import java.util.Scanner;

public class VeriAlma2 {
    public static void main(String[] args) {
        Scanner sayi=new Scanner(System.in);
        int sayi2= sayi.nextInt();
        System.out.println("sayi :" +sayi2);
        sayi.nextLine();
        String isim= sayi.nextLine();
        System.out.println("isim :" +isim);
       char harf = sayi.next().charAt(0);
        System.out.println("char :" + harf);
    }
}
