package collectionFrameWorkDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class InterviewQuestions {

    // lets say there are some numbers like 2,3,4,4,5,6,6,6,7,8,9,10 in a list ,  can you please remove duplicate value from here?

    public void arraylist11() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(6);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        System.out.println(a);
//        HashSet<Integer> b=  new HashSet<>(a);
//        System.out.println(b);
        Collections.reverse(a);
        System.out.println(a);




    }

    public static void main(String[] args) {
        InterviewQuestions obj= new InterviewQuestions();
        obj.arraylist11();
    }







    }

