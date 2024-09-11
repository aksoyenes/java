package Lablar;

import java.util.Scanner;

public class EnesAksoyWeek3LabEvercise2 {
    public static void main(String[] args) {
        Acoount enes=new Acoount("enes",500);
        enes.withdraw(300);
    }
}
class Acoount{
    int pasword=1234;
    int bakiye;
    String isim;

    public Acoount(String isim,int bakiye){
        this.isim=isim;
        this.bakiye=bakiye;
    }
    public void withdraw(int cekilecekMiktar){
        int şifre;
        int sayaç=0;
        System.out.println("lütfen bir şifre giriniz");
        Scanner tara=new Scanner(System.in);
        while(sayaç<3){
            şifre= tara.nextInt();

            if(şifre==pasword){
                bakiye-=cekilecekMiktar;
                break;
            }else{
                sayaç++;

            }


        }
        if(sayaç==3){
            System.out.println("hesabınız bloklandı");
        }



    }
}
