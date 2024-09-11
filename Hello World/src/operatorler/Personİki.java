package operatorler;

public class Personİki {
    public static void main(String[] args) {
        Person enes= new Person("enes","aksoy");
        System.out.println("ad :" + enes.firstName +" soyad :"+enes.lastName);
        Person cafer=new Person(123);
        cafer.firstName="cafer";
        cafer.lastName="servi";
        System.out.println("ad :" +cafer.firstName +" soyad :" + cafer.lastName + " age :" +cafer.age);


    }
}
