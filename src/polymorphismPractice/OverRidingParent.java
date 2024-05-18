package polymorphismPractice;

public class OverRidingParent {

    static int length= 3;
    static float width= 4.12f;

    public void areaofcircle () {
        int radius = 7;
        double d = Math.PI * radius * radius;
        System.out.println("Area of circle is " + d);
    }
     public void areaofSquare()  {
         int side=2;
        int square=side*side;
         System.out.println("Area of Suquare is "+square);
    }

    public static void areaofRectangle (){
        float rectangle= length*width;
        System.out.println("Area of Rectangle is "+ rectangle);


    }

    public static void main(String[] args) {
        OverRidingParent obj = new OverRidingParent();

    }

}
