package collectionFrameWorkDemo;
// Map is an interface, HashMap is a class. HashMap class implements the Map Interface.
// HashMap has key and value that means we can use two datatype
//Hashmap contains key/value pair.that's why we can use 2 data type at the same time.
//Hashmap keys are unique, it will take only one key.

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public void Hashmapdemo() {

    HashMap<Integer, String> cars = new HashMap<Integer, String>();
    cars.put(1,"Volvo");
    cars.put(2, "Hyundai");
    cars.put(3, "Toyota");
    cars.put(4,"Honda");
    cars.put(5,"Mazda");
    cars.put(6, "BMW");
        System.out.println(cars);
        System.out.println(cars.get(3));
    int size =cars.size();
        System.out.println(size);
}
     public static void main(String[] args) {
        HashMapPractice obj= new HashMapPractice ();
        obj.Hashmapdemo();



    }
}
