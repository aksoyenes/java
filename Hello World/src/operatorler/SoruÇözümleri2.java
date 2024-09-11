package operatorler;

import java.util.Scanner;

public class SoruÇözümleri2 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("birinci kenarı giriniz");
        int kenar1= tara.nextInt();
        System.out.println("ikinci kenarı giriniz");
        int kenar2= tara.nextInt();
        System.out.println("üçüncü kenarı giriniz");
        int kenar3= tara.nextInt();

        if(kenar1==kenar2 && kenar1==kenar3){
            System.out.println("eşkenar üçgen");
        } else if (kenar1 ==kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
            System.out.println("ikizkenar üçgen");

        }else{
            System.out.println("çeşit kenar üçgen");
        }
    }
}
