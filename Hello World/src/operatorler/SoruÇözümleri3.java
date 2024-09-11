package operatorler;

import java.util.Scanner;

public class SoruÇözümleri3 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        double vize= tara.nextDouble();
        double finalNotu=tara.nextDouble();
        double sonuc= (vize * 0.4d) + (finalNotu * 0.6d);
        if(sonuc<50){
            System.out.println("kaldınız");
        }else{
            System.out.println("geçtiniz");
        }
        //yüze kadar sayıların toplamı soru çözümü dört
        int toplam=0;
        for(int i=0; i<100; i++){
            toplam+=i;
        }
        System.out.println("toplam:" + toplam);

    }
}
