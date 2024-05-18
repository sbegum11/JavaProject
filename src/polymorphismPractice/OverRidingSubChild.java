package polymorphismPractice;
// we can use override method in the child class if we want to change the method or add but we dont want to
// create a new method
// if we want to keep the same code from the parent method, we can use super keyword
//and add our own code in the override method
//static method cannot be override
public class OverRidingSubChild extends OverRidingSubParent {
    @Override
    public void areaofcircle() {
        int radius = 9;
        double d = Math.PI * radius * radius;
        super.areaofcircle();
        System.out.println("Area of circle is " + d);
        System.out.println(radius);
    }

    @Override
    public void areaofSquare() {
        int side = 3;
        int square = side * side;
        System.out.println("Area of Square " + square);
        System.out.println(side);
    }

    public static void main(String[] args) {
        OverRidingSubChild obj = new OverRidingSubChild();
        obj.areaofcircle();
        obj.areaofSquare();

    }
}













