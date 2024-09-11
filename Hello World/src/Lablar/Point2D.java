package Lablar;



 class Point2D {
    private int x;
    private int y;
    public Point2D(){
        this.x=0;
        this.y=0;
    }
    public Point2D(int x,int y){
        this.x=x;
        this.y=y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
  class Point3D extends Point2D{
    private int z;
    public Point3D(){
        super();
        this.z=0;

    }
    public Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;

    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public String toString() {
        return "("+ getX()+","+getY()+","+z+")";
    }
}
class Main{

        public static void main(String[] args) {
            // Point2D örneği oluşturma ve kullanımı
            Point2D point2D_1 = new Point2D();
            System.out.println("Point2D 1: " + point2D_1.toString()); // Çıktı: (0,0)

            Point2D point2D_2 = new Point2D(3, 5);
            System.out.println("Point2D 2: " + point2D_2.toString()); // Çıktı: (3,5)

            point2D_2.setX(7);
            point2D_2.setY(2);
            System.out.println("Point2D 2 after modification: " + point2D_2.toString()); // Çıktı: (7,2)

            // Point3D örneği oluşturma ve kullanımı
            Point3D point3D_1 = new Point3D();
            System.out.println("Point3D 1: " + point3D_1.toString()); // Çıktı: (0,0,0)

            Point3D point3D_2 = new Point3D(1, 2, 4);
            System.out.println("Point3D 2: " + point3D_2.toString()); // Çıktı: (1,2,4)

            point3D_2.setZ(8);
            System.out.println("Point3D 2 after modification: " + point3D_2.toString()); // Çıktı: (1,2,8)
        }
    }



