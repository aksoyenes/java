package Lablar;

import java.util.Scanner;

public class EnesAksoyWeek2 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        Employe enes=new Employe("enes",123,10,5);
        enes.displayInfo();
        enes.displaySalary();
        Employe emine=new Employe();
        System.out.println("ad giriniz" );
        emine.name=tara.next();
        System.out.println("socialSecurityNumber giriniz" );
        emine.socialSecurityNumber=tara.nextInt();
        System.out.println("wage giriniz" );
        emine.wage=tara.nextFloat();
        System.out.println("workinHoursgiriniz giriniz" );
        emine.workingHours=tara.nextInt();
        emine.displayInfo();
        emine.displaySalary();
    }
}
class Employe{
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public Employe(){

    }

    public Employe(String name,int socialSecurityNumber,float wage,int workingHours){
        this.name=name;
        this.socialSecurityNumber=socialSecurityNumber;
        this.wage=wage;
        this.workingHours=workingHours;

    }
    public void displayInfo(){
        System.out.println("name:" + name+ "socialsecuritynumber:" + socialSecurityNumber);

    }
   public void  displaySalary(){
        float salary=wage*workingHours;
       System.out.println("salary:" + salary);
   }
}