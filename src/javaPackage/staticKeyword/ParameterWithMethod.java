package javaPackage.staticKeyword;

public class ParameterWithMethod {
    //method without return and parameter
    // method with return and without parameter
    //method without return with parameter
    // method with return and parameter

String r = "myview";
  int a= 8;
  int b= 5;

  public void addition (){ //method without return and parameter
      int r= a+b;
     System.out.println("Addition "+r);
      String s= "Subarna";
      System.out.println(s);
  }

    public int Substraction () { //method with return and without parameter
       int re = a - b;
      return re;
   }


    public void Division (int x, int y) {  //method without return with parameter
       float f = (float) x/y;
       System.out.println("Division " + f);
    }



    public int remainder (int u, int v) { // method with return and parameter
         int result = u % v;
         return result;
     }



      public String participant () {
          String s = "this is a void method";
          return s;
      }


      public static void main(String[]arges){
      ParameterWithMethod obj= new ParameterWithMethod();
      obj.addition(); //calling the method

          int sub= obj.Substraction();
            System.out.println("Substraction "+sub);
            // another way to print subtraction
          System.out.println(obj.Substraction());

           obj.Division(3,2);
          obj.Division(5,2);
          obj.Division(7,5);
           int remain= obj.remainder(5,3);
          System.out.println("Remainder is "+remain);

          String S1= obj.participant();
          System.out.println(S1);

          System.out.println(obj.a);
          int x = obj.a;
          System.out.println(x);

      }









}





















