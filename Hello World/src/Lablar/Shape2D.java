package Lablar;

public abstract class Shape2D {
    final double PI=3.14d;
    double height;
    double raadius;
     double width;
    public Shape2D(double height,double width){
        this.height=height;
        this.width=width;
    }
    public Shape2D(double radius){
        this.raadius=radius;
    }
    public  double getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return height+","+raadius+ ","+ width;
    }
}
class Cicle extends Shape2D{
    public Cicle(double radius){
        super(radius);

    }


    @Override
    public double getArea() {
        return super.PI*raadius*raadius;
    }
}
class Square extends Shape2D{
    public Square(double width){
        super(width);

    }

    @Override
    public double getArea() {
        return super.width*super.width;
    }
}
class Rectangle extends Shape2D{
    public Rectangle(double height,double width){
        super(height,width);

    }

    @Override
    public double getArea() {
        return super.height*super.width;
    }
}
  class Shape3D extends Shape2D{
    public double depth;
    public Shape3D(double depth,double height,double width){
        super(height, width);
        this.depth=depth;
    }
    public Shape3D(double height,double raadius){
        super(height,raadius);

    }
    public double getVolume0(){
        return 0;

    }

      @Override
      public String toString() {
          return depth+","+raadius+","+height+","+width;
      }
  }
  class Cylinder extends Shape3D{
    public Cylinder(double height,double raadius){
        super(height, raadius);
    }

      @Override
      public double getVolume0() {
          return super.PI*super.raadius*super.raadius*super.height;
      }

      @Override
      public double getArea() {
          return 2*super.PI*super.raadius*(super.raadius+super.height);

      }

  }
  class Sphere extends Shape3D{
    public Sphere(int depth, double raadius){
        super(depth,raadius);
    }

      @Override
      public double getVolume0() {
          return 4 / 3 * super.PI*super.raadius*super.raadius*super.raadius;

      }

      @Override
      public double getArea() {
          return 4*super.PI*super.raadius*super.raadius;
      }
  }
  class TestMain{
      public static void main(String[] args) {
          Shape2D cicle = new Cicle(2d);
          System.out.println(cicle.getArea());
      }
  }

