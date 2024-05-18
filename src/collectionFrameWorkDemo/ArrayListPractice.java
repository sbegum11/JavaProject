package collectionFrameWorkDemo;

import java.util.*;

public class ArrayListPractice {
    //Java ArrayList class can contain duplicate elements.
    // Java ArrayList class maintains insertion order.
    // Java ArrayList class is non synchronized.
    public void myArray (){
        ArrayList<Integer>list1=new ArrayList<Integer>();
        boolean b = list1.isEmpty();

        System.out.println("is list empty? "+b);
        //System.out.println("is list empty "+ list1.isEmpty());
        System.out.println(list1.size());

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);

    HashSet<Integer> hashdata = new HashSet<Integer>(list1); // remove dulicate value, use hashset.
        System.out.println("this is for hashset data "+hashdata);



        System.out.println("after adding " +list1.size());

        System.out.println("is list empty "+ list1.isEmpty());

        System.out.println(list1);

        list1.add(8,90);

        System.out.println("after adding " +list1.size());
        System.out.println(list1);

        list1.remove(4);
        System.out.println(list1);

        list1.add(0,100); //change the element of index 0
        System.out.println(list1);

        System.out.println("is there 30? "+list1.contains(30));



        Collections.sort(list1);
        System.out.println(list1);

        int maxvalue = Collections.max(list1);
        System.out.println(maxvalue);

        int minvalue = Collections.min(list1);
        System.out.println(minvalue);

        Collections.reverse(list1);
        System.out.println(list1);

        Collections.shuffle(list1);
        System.out.println(list1);

    }

    public static void main(String[] args) {
        ArrayListPractice obj = new ArrayListPractice();
        obj.myArray();
    }









}
