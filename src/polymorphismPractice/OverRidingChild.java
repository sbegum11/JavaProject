package polymorphismPractice;

public class OverRidingChild extends OverRidingParent {
    // we can use override method in the child class if we want to change the method or add but we dont want to
    // create a new method
    // if we want to keep the same code from the parent method, we can use super keyword
    //and add our own code in the orverride method
    //static method cannot be override

    @Override
    public void areaofcircle () {
       int radius= 9;
        double d = Math.PI * radius * radius;
        super.areaofcircle();

        System.out.println("Area of circle is " + d);
        System.out.println(radius);

    }
    @Override
    public void areaofSquare() {

        int side = 3;
        int square = side * side;
        super.areaofSquare();

        System.out.println("Area of Suquare is " + square);
        System.out.println(side);
    }
//    @Override - static method cannot be override.
//    public static void areaofRectangle () {
//        float rectangle = length * width;
//        System.out.println("Area of Rectangle is " + rectangle);
//
//    }
      public static void main(String[] args) { //main method can not be override.
          OverRidingChild obj= new OverRidingChild ();
          obj.areaofcircle();
          obj.areaofSquare();




}

}
