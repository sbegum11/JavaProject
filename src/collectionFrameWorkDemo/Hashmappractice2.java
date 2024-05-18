package collectionFrameWorkDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Hashmappractice2 {
    // Map in an interface, Hashmap is a class , HashMap class implement the map interface.
    // Hashmap has key and value that means we can use 2 data type at the same time
    //Hashmap contains key/value pair, that's why we can use 2 data type
    //Hashmap keys are unique, it will take only one key.
    public void Hashmapdemo1(){
        HashMap<Integer,String> cars= new HashMap<>();
        cars.put(1,"Volvo");
        cars.put(2, "Honda");
        cars.put(3, "Toyota");
        cars.put(4, "mazda");
        cars.put(5, " BMW");
        cars.put(6, "Nissan");
        cars.put(6, "infinity");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.containsKey(2));
        System.out.println(cars.containsValue("Nissan"));
        cars.replace(5,"Nissan");
        System.out.println(cars);
        cars.clear();


        System.out.println(cars);
        System.out.println(cars.isEmpty());








    }

    public static void main(String[] args) {
        Hashmappractice2 obj= new Hashmappractice2();
        obj.Hashmapdemo1();
    }



















}
