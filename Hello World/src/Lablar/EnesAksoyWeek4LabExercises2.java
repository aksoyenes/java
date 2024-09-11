package Lablar;

import javax.swing.*;

public class EnesAksoyWeek4LabExercises2 {
    public static void main(String[] args) {
        try {
            Worker w1 = new Worker("enes", 500);
            Worker w2=new Worker("furkan",600);
            Worker w3=new Worker("ayhan",700);
            System.out.println(Worker.sayac);
            w1.setSalary(0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    }

    class Worker {
        private String isim;
        private int salary;
        public static int sayac;

        public Worker(String isim, int salary) {
            this.isim = isim;
            this.salary = salary;
            sayac++;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public void setSalary(int salary) {
            if (salary > 0) {
                this.salary = salary;
            } else {
            throw new IllegalArgumentException("salary amount must be greater than zero");

            }
        }
    }