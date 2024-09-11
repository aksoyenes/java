package Lablar;

public class EnesAksoyWeek3LabExercise1 {
    public static void main(String[] args) {
        Account enes=new Account(500,"enes");
        enes.add(250d);
        System.out.println("balance:"+enes.getBalance());
    }
}
class Account{
    private double balance;
    private String ownerName;

    public Account(double balance,String ownerName){
        this.balance=balance;
        this.ownerName=ownerName;
    }
    public void setOwnerName(String name){
        this.ownerName=name;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }
    public void add(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        this.balance-=amount;
    }
}


