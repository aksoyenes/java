package Object;

public class Ogrenci2 {
    public static void main(String[] args) {
        Ogrenci tumOgrenciler []= new Ogrenci[5];
        Ogrenci ogrenci1=new Ogrenci(94,"enes");
        ogrenci1.OgrenciYazdır();
        tumOgrenciler[0]=ogrenci1;
        tumOgrenciler[0].OgrenciYazdır();
        tumOgrenciler[1]=new Ogrenci(35,"furkan");
        tumOgrenciler[1].OgrenciYazdır();
    }
}
