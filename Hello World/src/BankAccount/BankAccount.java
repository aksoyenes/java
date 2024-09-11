package BankAccount;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

   public class BankAccount implements Comparable<BankAccount>{
    private int accountNo;
    private String holderName;
    private double balance;
    public BankAccount(int accountNo,String holderName,double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;

    }
    public void balanceChange(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;

        } else {
            System.out.println("işlem yapılamaz");
        }
    }
    public double getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    @Override
    public int compareTo(BankAccount OtherAccount) {
        return this.holderName.compareTo(OtherAccount.getHolderName());
    }
}
   class TestMain{
    public static void main(String[] args) {
        ArrayList<BankAccount> MyList= new ArrayList<>();

        BankAccount a1=new BankAccount(123,"enes",1000d);
        BankAccount a2=new BankAccount(1234,"emine",1001d);
        BankAccount a3=new BankAccount(12345,"furkan",1002d);
        MyList.add(a1);
        MyList.add(a2);
        MyList.add(a3);
        Collections.sort(MyList);

        for(BankAccount account:MyList){
            account.balanceChange(500);
        }
        for(BankAccount account:MyList){
            System.out.println("account no:"+account.getAccountNo()+"holder name:"+ account.getHolderName()+"balance:"+account.getBalance());
        }
    }

}
