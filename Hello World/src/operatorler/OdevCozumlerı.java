package operatorler;

public class OdevCozumlerı {
    public static void main(String[] args) {
        int saniye = 4283;
        int dakika;
        int saniye2;
        dakika = saniye / 60;
        saniye2 = saniye % 60;
        System.out.println("1200 saniye şu kadar dakika " + dakika +"şu kadar saniye " + saniye2);
    }
}
