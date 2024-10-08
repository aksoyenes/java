import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("ankara");
        sehirler.add("istanbul");
        sehirler.add("izmir");
        sehirler.add("aydın");
        sehirler.remove("istanbul");
        Collections.sort(sehirler);
        for(String iller : sehirler){
            System.out.println(iller);
        }

    }
}