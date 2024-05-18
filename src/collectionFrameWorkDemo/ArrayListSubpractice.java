package collectionFrameWorkDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSubpractice {
    //Java ArrayList class can contain duplicate elements.
    // Java ArrayList class maintains insertion order.
    // Java ArrayList class is non synchronized.

    public void myArraypractice(){
        ArrayList<String> List2= new ArrayList<>();

        boolean b= List2.isEmpty();
        System.out.println("is list empty? "+b);

        List2.add("USA");
        List2.add("UK");
        List2.add("Canada");
        List2.add("China");
        List2.add("Bangladesh");
        System.out.println(List2);

        System.out.println("after adding "+List2.size());
        System.out.println("after adding "+List2.isEmpty());
        System.out.println(List2.size());
        List2.add("");
        System.out.println("after adding "+ List2.size());
        System.out.println(List2);
        System.out.println("is there Canada? " +List2.contains("Canada"));
        List2.remove(1);
        System.out.println(List2);
        Collections.sort(List2);
        System.out.println(List2);
        Collections.reverse(List2);
        System.out.println(List2);
        Collections.shuffle(List2);
        System.out.println(List2);
        String maxvalue= Collections.max(List2);
        System.out.println(maxvalue);
        String minvalue= Collections.min(List2);
        System.out.println(minvalue);

    }

    public static void main(String[] args) {
        ArrayListSubpractice obj= new ArrayListSubpractice ();
        obj.myArraypractice();





    }








}
