package loopPractice;

import javax.swing.*;

public class LoopDemo {

    public void whileLoop() { //while loop: A while loop is a control flow statement that allows
                              // code to be executed repeatedly based on a given Boolean condition.
                              // The while loop can be thought of as a repeating if statement.


        int x = 1;
        while (x < 10) {
            System.out.println(x);
            x++;
        }
    }

    public void forLoop() {

        for (int y = 2; y < 10; y++) { //for loop: for loop provides a concise way of writing the loop structure.
                                       // Unlike a while loop, a for statement consumes the initialization,
                                       // condition and increment/decrement in one line thereby providing a shorter,
                                       // easy to debug structure of looping.
            System.out.println(y);

        }
    }

    public void dowhile() {
        int z = 3;
        do {
            System.out.println(z);
            z++;
        }
        while(z>8);

    }
    public void print10(){
//               for (int a=1;a<=10;a++){
//            System.out.println(a);
        //print 50-1
//        for(int b=50; b>=1; b--){
//            System.out.println(b);
        for(int b=50;b>=1; b=b-2){
            System.out.println(b);
        }

    }
    public void arrayLoop() {
//      int s[]={10,20,30,40};
//        System.out.println(s.length);
//        for(int i=0; i<=s.length; i++){
//            System.out.println(s[i]);
//                    }
        //list 4 car name and print out in for loop-Nissan, Toyota, Honda, Murir Tin
//        String car[]= {"Nissan","Toyota","Honda","Murir tin"};
//        System.out.println(car.length);
//        for(int i=0;i<= car.length; i++ )
//            System.out.println(car[i]);
        String[] cars = new String[4];
        cars[0] = "Nissan";
        cars[1] = "Toyota";
        cars[2] = "Honda";
        cars[3] = "Murir tin";
//        System.out.println(cars.length);
//        for (int i = 0; i <cars.length; i++) {
//            System.out.println(cars[i]);
        for(String s:cars){   // for each loop
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        LoopDemo obj= new LoopDemo();
//        obj.whileLoop();
//        obj.forLoop();
  //     obj.dowhile();
        //obj.print10();
        obj.arrayLoop();
    }
}







