package accesDemo;

public class AccessModifier2 {

    public static void main(String[] args) {
        AccessModifier1 obj = new AccessModifier1();
        obj.areaoftrangle();//protected
        obj.areaofcircle();//public
        obj.areaofrectangle();//no access
    }
}
