package collectionFrameWorkDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Arraypractice2 {

           //Java ArrayList class can contain duplicate elements.
        // Java ArrayList class maintains insertion order.
        // Java ArrayList class is non synchronized.

        public void myArraypractice(){
            ArrayList<Integer> List2= new ArrayList<Integer>();

            boolean b= List2.isEmpty();
            System.out.println("is list empty? "+b);

            List2.add(5);
            List2.add(6);
            List2.add(7);
            List2.add(8);
            List2.add(9);
            List2.add(10);
            List2.add(11);
            List2.add(12);
            List2.add(13);
            List2.add(14);
            System.out.println("after adding "+List2.size());
            System.out.println("after adding "+List2.isEmpty());
            System.out.println(List2.size());
            List2.add(0,4);
            System.out.println("after adding "+ List2.size());
            System.out.println(List2);
            System.out.println("is there 15? " +List2.contains(15));
            List2.remove(1);
            System.out.println(List2);
            Collections.sort(List2);
            System.out.println(List2);
            Collections.reverse(List2);
            System.out.println(List2);
            Collections.shuffle(List2);
            System.out.println(List2);
            int maxvalue= Collections.max(List2);
            System.out.println(maxvalue);
            int minvalue= Collections.min(List2);
            System.out.println(minvalue);
        }

        public static void main(String[] args) {
            collectionFrameWorkDemo.ArrayListSubpractice obj= new collectionFrameWorkDemo.ArrayListSubpractice();
            obj.myArraypractice();

        }




        }











