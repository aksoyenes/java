package Object;

public class Ogrenci {
    int id;
    String isim;

    public Ogrenci(){

    }
    public Ogrenci(int id,String isim){
        this.id=id;
        this.isim=isim;

    }
    public void OgrenciYazdır(){
        System.out.println("ogrencinin id:" +id + " isim :" + isim);
    }


}


