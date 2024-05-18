package accesDemo;

public class AccessModifier1 {
    /*4 types of access
    //a) public-variable and method can be access throw out the project
    //b)private- variable and method are accessible only in the class.
    //c)default/no-access/package private- variable and method are accessible only within the package.
    d)protected - variable and method accessible outside  the package., when there is an inheritance.
*/
    public float radius =4.7f;//public variable can be used in anywhere in the package
    public double d;
    private int side=3;//private variable can only be used in class
    int width =7; //you can use "no access variable & method" in any class of current package but you can not use it in other package
    int length =8;// even though the package was open under that package.That is why it is also called package private
    protected int height = 3;
    protected int base = 3;


    public void areaofcircle (){ //public method can be used in anywhere in the package
        double circle= Math.PI*radius*radius;
        System.out.println(circle);
    }
    private void areaofsquare(){//private method can only be used in class
        int square=side*side;
        System.out.println(square);
    }
    void areaofrectangle(){// no access- its package private
         int rectangle=width*length;
        System.out.println(rectangle);
    }
    protected void areaoftrangle(){ //you can use protected modifier in eny class of current package but to use it in
        // different package you have to inherit/extend the class
        float triangle = (height*base)/2;
        System.out.println(triangle);
    }

    public static void main(String[] args) {

        AccessModifier1 obj =new AccessModifier1();
        obj.areaofcircle();
        obj.areaofrectangle();
        obj.areaofsquare();
        obj.areaoftrangle();
    }
}
