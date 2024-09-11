package Lablar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnesAksoyWeek4LabExercises1 {
    public static void main(String[] args) {
        try{
            int a;
            Scanner tara=new Scanner(System.in);
            a=tara.nextInt();
        }catch(InputMismatchException e){
            System.out.println(e.toString());

        }
    }



}

