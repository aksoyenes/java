package operatorler;

import java.util.Scanner;

public class SoruÇozumleri7 {
    public static void main(String[] args) {
        Scanner tara =new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int girilenSayi= tara.nextInt();

        int faktoriyel=1;
        for(int i = 1 ;i<=girilenSayi;i++){
            faktoriyel*=i;

        }
        System.out.println("faktöriyel:" + faktoriyel);

    }
}
