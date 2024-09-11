package operatorler;

import java.util.Scanner;

public class SoruÇozumleri {
    public static void main(String[] args) {
        Scanner tara =new Scanner(System.in);

        System.out.println("birinci sayiyi giriniz ");
        int sayi1= tara.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int sayi2= tara.nextInt();

        System.out.println("üçüncü sayiyi giriniz");
        int sayi3= tara.nextInt();

        double ortalama = ((double)sayi1+sayi2+sayi3)/ 3.0d;
        System.out.println("üç sayinin ortalaması");
        System.out.printf("%.4f" , ortalama);
    }
}
