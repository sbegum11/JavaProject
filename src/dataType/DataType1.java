package dataType;

import java.sql.SQLOutput;

public class DataType1 {
   /* There are 2 types of data type:
   1. Primitive data type - char, int, float, double, long,boolean,byte.
   2. Non-Primitive data type- String, Classes, Interfaces, Arrays.

    */
   public static void main(String[] args) {
       byte b = -128;
       short s = -32768;
       int i = 2147483645;
       long l = 9223372036854775807l; //we put l after the number to let java know that it's a large number
       float f= 3.444444f;
       double d= 2.12345678987654321234555777888999455667889876544322324455667788889776544;
       char c= 's';
       boolean b1= true;
       boolean b3= false;
       String st= "subarna"; //non-primitive data type
       System.out.println(b);
       System.out.println(s);
       System.out.println(i);
       System.out.println(l);
       System.out.println(f);
       System.out.println(d);
       System.out.println(c);
       System.out.println(st);
       System.out.println(b1);
       System.out.println(b3);
   }

   }
