package Object;

public class Soru2 {
    public static void main(String[] args) {
        Talebe ToplamOgrenci[]=new Talebe[100];
        for(int i=0; i< ToplamOgrenci.length;i++){
            int rastgeleId= (int)(Math.random()*500);
            int rastgeleNot= (int)(Math.random()*100);
            Talebe yeni= new Talebe(rastgeleId,rastgeleNot);
            ToplamOgrenci[i]=yeni;

        }
        ogrencileriNotlarınaGoreSırala(ToplamOgrenci);
        for(int i=0;i<100;i++){
            ToplamOgrenci[i].ogrenciBilgileriniYazdır();
        }

    }
    private static void ogrencileriNotlarınaGoreSırala(Talebe ToplamOgrenci[]){
        for(int i=0;i< ToplamOgrenci.length-1;i++){
            int BuyukSayı=ToplamOgrenci[i].getSınavNotu();
            int BuyukIndex=i;
            for(int j=i+1;j<ToplamOgrenci.length;j++){
                if(BuyukSayı<ToplamOgrenci[j].getSınavNotu()){
                    BuyukSayı=ToplamOgrenci[j].getSınavNotu();
                    BuyukIndex=j;
                }
            }
            if(BuyukIndex!=i){
                ToplamOgrenci[BuyukIndex]=ToplamOgrenci[i];
                ToplamOgrenci[i].setSınavNotu(BuyukSayı);
            }
        }
    }


}
class Talebe {
    int id;
    int sınavNotu;


    public Talebe(int id,int sınavNotu){
        this.id=id;
        this.sınavNotu=sınavNotu;

    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setSınavNotu(int sınavNotu){
        this.sınavNotu=sınavNotu;
    }
    public int getSınavNotu(){
        return sınavNotu;
    }
    public void ogrenciBilgileriniYazdır(){
        System.out.println("id:" + id + "not:" +sınavNotu);
    }
}