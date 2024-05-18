package practiceConstructor;

public class ConstructorOverloading {

    int modelyear;
    int speed;
    String modelname;

    String color;
    int wheels = 4;


    public ConstructorOverloading(int modelyear, int speed, String modelname) {
        this.modelyear = modelyear;
        this.speed = speed;
        this.modelname = modelname;
    }


    public ConstructorOverloading(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }


    public static void main(String[] args) {
        // Constructor Parameter

        ConstructorOverloading obj1 = new ConstructorOverloading(2020, 1000, "Nishan");
        //ConstructorMainMethod b= new ConstructorMainMethod("Nissan");
        //obj1.modelname = "Nishan";
        //obj1.modelyear = 2020;
        //obj1.speed = 1000;
        System.out.println(obj1.speed);
        System.out.println(obj1.modelyear);
        System.out.println(obj1.modelname);

        ConstructorOverloading obj2 = new ConstructorOverloading("Green", 4);
        System.out.println(obj2.color);
        System.out.println(obj2.wheels);


    }
}