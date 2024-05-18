package polymorphismPractice;

public class OverRidingSubParent {
    static int length= 3;
    static float width= 4.12f;
    public void areaofcircle(){
        int radius = 7;
        double d= Math.PI*radius*radius ;
        System.out.println("Area of circle is "+ d);

    }

    public  void areaofSquare(){
        int side= 2;
        int square = side*side;
        System.out.println("Area of square is "+ square);
    }
    public  void areaofRectangle (){ //static method can not  override.
        float rectangle= length*width;
        System.out.println("Area of rectangle is "+rectangle);

    }

    public static void main(String[] args) {
        OverRidingSubParent obj=  new OverRidingSubParent ();



    }






}
