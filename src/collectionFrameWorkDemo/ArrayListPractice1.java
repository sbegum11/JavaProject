package collectionFrameWorkDemo;

import java.util.*;

public class ArrayListPractice1 {
    //ArrayList class can contain duplicate elements
    // Arraylist class is maintains insertion order
    // This class is non-synchronized.
    // List is an interface and ArrayList is a class
    public void myArrayListDemo(){
        List<Integer> list= new ArrayList<Integer>();
         boolean b= list.isEmpty();System.out.println("is list empty? "+b);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);//ArrayList class can contain duplicate elements
        list.add(50);//ArrayList class can contain duplicate elements
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println("after adding the size is  "+list.size());
        System.out.println("is list empty? "+list.isEmpty());
        list.add(3, 90);
        System.out.println(list); // will print 10, 20, 30, 40, 50, 50, 60, 70, 80... since it maintains insertion order
      //  System.out.println(list.size());

        //list.remove(4);
       // System.out.println(list.size());
        //System.out.println(list);
        list.add(0,100);
        System.out.println(list);
//        System.out.println("is there any number 30? "+list.contains(30));
//        System.out.println("is there any number 110? "+list.contains(110));
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        int maxvalue=Collections.max(list);
//        System.out.println(maxvalue);
//        int minvalue= Collections.min(list);
//        System.out.println(minvalue);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);





        // do the same thing with String
        // use a for each loop with Index



    }

    public static void main(String[] args) {
        ArrayListPractice1 obj= new ArrayListPractice1();
        obj.myArrayListDemo();
    }















}
