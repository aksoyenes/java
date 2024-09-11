package Lablar;

public class EnesAksoyWeek5LabExercise1 {
    public static void main(String[] args) {
        double yarıcap[]=new double[3];
        Circle c1=new Circle(5);

        Circle c2=new Circle(10);

        Circle c3=new Circle(15);
      yarıcap[0]= c1.computeArea();
      yarıcap[1]= c2.computeArea();
      yarıcap[2]= c3.computeArea();
        for(double alan:yarıcap){
            System.out.println(alan);
        }


    }
}
class Circle{
    private static double PI =3.141519;
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }
    public double computeArea(){
        return PI*radius*radius;

    }
}
