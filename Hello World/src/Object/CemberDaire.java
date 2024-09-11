package Object;


import java.util.concurrent.Callable;

public class CemberDaire {
    public static void main(String[] args) {
        Cember a = new Cember(5.0);
        System.out.println("yariçap :" + a.getYaricap());
        System.out.println("alan:" + a.alanHesapla());
        System.out.printf("çevre: %.2f" , a.çevreHesapla());
    }
}
class Cember{
   private double yaricap;

   public Cember(double yaricap){
       this.yaricap=yaricap;
   }
   public void setYaricap(double yaricap){
       this.yaricap=yaricap;

   }
   public double getYaricap(){
       return yaricap;
   }
   public double çevreHesapla(){
      return  2*(3.14)*yaricap ;
   }
   public double alanHesapla(){
       return   (3.14)*yaricap*yaricap;
   }


}
