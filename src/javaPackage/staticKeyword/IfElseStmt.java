package javaPackage.staticKeyword;

public class IfElseStmt {


    public static void main(String[] args) {

        int a= 2;
        int b= 3;
        int c= 4;
        int d= 5;

        if (a==b){
            System.out.println("a is equel to b");

        }
        else if (b<a){
            System.out.println("b is smaller than a");
        }

        else if (c>b){
            System.out.println("c is greater than b");

        }
        else{
            System.out.println("b is equal to a ");
        }



        int x=1;
        int y=2;
        int z=3;

   // xyz all equal --- if
        //x is smaller than y or y is equal to z -- else if
        // Y is greater than z and z is equal to x -- else if
        // none of the above right - -else
     if ((x==y) && (y==z)){
        System.out.println("x,y,s are all equal");
        }

     else if ((x<y)|| (y==z)){
            System.out.println("y is greater than x or y is equal to z");
        }
     else if  ((y>z) || (z==x)){
            System.out.println("y is greater than z or z is equal to x");
        }
      else{
          System.out.println("none of the above right");
        }
    }









}
