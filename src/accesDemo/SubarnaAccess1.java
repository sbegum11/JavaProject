package accesDemo;

public class SubarnaAccess1 {
 //There are four types of access:
 //1.public 2.private 3.no-access or package private 4. protected

    public float radius= 2.4f;  // public variable can be used in anywhere in the package
    public double d;
    private int side= 3 ;// private variable can only be used in class
    int widht= 5; // you can use "no access variable & method" in any class of current package
                  // but you can not use it in other package, even though the package was open under that
                  // package , thats why it is called package private
    int length = 6;
    protected int height= 4;
    protected int base= 4;

    public void areaofcircle (){ //public method can be used in the package
        double circle = Math.PI*radius;
        System.out.println(circle);
            }
    private void areaofsqure (){ //private method can be used in class only
        int squre= side * side;
        System.out.println(squre);

    }
    void areaofrectangle() {
        int rectangle = widht * length;
        System.out.println(rectangle);

    }
    protected void areaoftrangle () { //you can use protected modifier in any class of current package but
        // to use in different package you have to inherit/extend the class
        float triangle = (height * base) / 2;
        System.out.println(triangle);
    }

    public static void main(String[] args) {
        SubarnaAccess1 obj= new SubarnaAccess1 ();
        obj.areaofcircle();
        obj.areaofrectangle();
        obj.areaoftrangle();
        obj.areaofsqure();

    }
    }






