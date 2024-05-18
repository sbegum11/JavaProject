package accesDemo.noAccessPractice;


import accesDemo.AccessModifier1;

public class AccessModifier3  extends AccessModifier1 {




    public static void main(String[] args) {
        AccessModifier3 obj= new AccessModifier3();
        obj.areaofcircle();//public
        obj.areaoftrangle();//protected
    }
}