package accesDemo;

import java.util.Collections;

public class Array1 {

    public void myArray() {
        String [] a= {"USA", "UK", "Canada"};
        System.out.println(a[0]+" " +a[1]+" " +a[2]);
        System.out.println(a);
        for (int i=0; i<=2; i++) {
            System.out.println(a[i]);
        }

     int b[]={1,2,3,4};
        System.out.println(b[0]+" "+b[1]+" "+b[2]);
    }

    public static void main(String[] args) {
        Array1 obj= new Array1 ();
        obj.myArray();



    }



}
