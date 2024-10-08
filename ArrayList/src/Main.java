import java.util.ArrayList;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList sayılar=new ArrayList();
        sayılar.add(1);
        sayılar.add(2);
        sayılar.add(3);
        sayılar.add("ankara");
        //System.out.println(sayılar.size());
        //sayılar.set(0,100);
       //sayılar.remove(0);
      //  sayılar.clear(); arraylistin içerisinde hiçbir şey olmadığından hata verir
        System.out.println(sayılar.get(0));
        for(Object sayı:sayılar){
            System.out.println(sayı);
        }

    }
}