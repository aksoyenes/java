package Object;

public class Soru3 {
    public static void main(String[] args) {
        System.out.println("topla:" + HesapMakinesi.Topla(10,12,14));

        System.out.println("çarp:" + HesapMakinesi.Çarp(1,2,3));
        System.out.println("çıkar:" + HesapMakinesi.Çıkar(40,2,3));
        if(HesapMakinesi.Bol(40,0,2)!=-1){
            System.out.println("bölüm:" +HesapMakinesi.Bol(40,0,2) );
        }else{
            System.out.println("bölme işlemi başarısız");
        }
    }
}
class HesapMakinesi{
    public static int Topla(int ... parametreler){
        int toplam=0;
        for(int parametre:parametreler ){
            toplam=toplam+parametre;
        }
        return toplam;
    }
    public static int Çarp(int ... sayılar){
        int çarpım=1;
        for(int a:sayılar){
            çarpım=çarpım*a;
        }
        return çarpım;

    }
    public static int Çıkar(int ... parametreler){
        int fark =parametreler[0];
        for(int i=1;i<parametreler.length;i++){
            fark=fark-parametreler[i];
        }
        return fark;

    }
    public static double Bol(int ... parametreler){
        int bolüm=parametreler[0];
        for(int i=1;i<parametreler.length;i++ ){
            if(parametreler[i]!=0){
                bolüm=bolüm/parametreler[i];
            }else{
                System.out.println("parametrelerden biri 0 bölme yapılamadı");
                return -1;
            }

        }
        return  bolüm;

    }
}
