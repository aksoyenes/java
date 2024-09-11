package Object;

public class Soru4 {
    public static void main(String[] args) {
    BankaHesabi enes=new BankaHesabi(123,500);
    BankaHesabi furkan=new BankaHesabi(456,500);
    enes.paraYatır(200);
    furkan.paraYatır(200);

    BankaHesabi.bankaÖzeti();
    enes.hesapKiyasla(furkan);

    }
}
class BankaHesabi{
    private int  hesapNo;
    private int hesapBakiye;
    private static int tümBankanınBakiyesi=0;
    private static int tümHesapSayisi=0;
    private static int operasyonSayisi=0;
    public BankaHesabi(int hesapNo,int hesapBakiye){
        this.hesapNo=hesapNo;
        this.hesapBakiye=hesapBakiye;
        tümBankanınBakiyesi+=hesapBakiye;
        tümHesapSayisi++;
    }
    public void setHesapNo(int hesapNo){
        this.hesapNo=hesapNo;
    }
    public int getHesapNo(){
        return hesapNo;

    }
    public void setHesapBakiye(int hesapBakiye){
        this.hesapBakiye=hesapBakiye;
        tümBankanınBakiyesi+=hesapBakiye;

    }
    public int getHesapBakiye(){
        return hesapBakiye;

    }
    public void paraYatır(int paraMiktari){
        this.hesapBakiye+=paraMiktari;
        tümBankanınBakiyesi+=paraMiktari;
        operasyonSayisi++;

    }
    public void paraCek(int paraMiktarı){
        if(this.hesapBakiye>=paraMiktarı){
            this.hesapBakiye-=paraMiktarı;
            operasyonSayisi++;
            tümBankanınBakiyesi-=paraMiktarı;
        }else {
            System.out.println("hesabınızda yeterli para yok!!");
        }
    }
    public void hesapKiyasla(BankaHesabi kiyaslanacakHesap){
        if(this.hesapBakiye<kiyaslanacakHesap.hesapBakiye){
            System.out.println(this.hesapNo+  "nolu hesabın bakiyesi" +kiyaslanacakHesap.hesapNo+"nolu hesap bakiyesinden azdır");
        } else if (this.hesapBakiye>kiyaslanacakHesap.hesapBakiye) {
            System.out.println(this.hesapNo+  "nolu hesabın bakiyesi" +kiyaslanacakHesap.hesapNo+"nolu hesap bakiyesinden fazladır");

        }else{
            System.out.println(this.hesapNo+  "nolu hesabın bakiyesi" +kiyaslanacakHesap.hesapNo+"nolu hesap bakiyesine eşittir");
        }
    }
    public static void bankaÖzeti(){
        System.out.println("tüm bankasnın hesap sayisi:" +tümHesapSayisi);
        System.out.println("tüm bamkanin bakiyesi:"+ tümBankanınBakiyesi);
        System.out.println("toplam operasyon sayisi:" +operasyonSayisi);
    }


}
