package loopPractice;

public class LoopDemo2 {
    /*
    there are 3 types of Loop
    1. While Loop
    2. For Loop
    3. Do-while Loop
     */
   public void whileLoop(){
//       int x= 5; //initialization
//       while(x<=10){ //condition
//           System.out.println("I'm running repeatedly " +x); //statement
//        //   x++; //increment
//           x=x+2; // increment by different number
       int x=5;
       while (x<=6){
           System.out.println(x);
       }
       x++;
//      int y= 20;
//       while(y>=1){
//           System.out.println("I am running repeatedly " +y);
//           y-- ; //decrement
//       }

   }
    public void forLoop(){
    for (int i= 0; i<5;i++){
    System.out.println(i);
}

   }
   public void doWhileLoop(){
    int x= 5;
    do{
        System.out.println(x);
        x++;
    }
   while (x<=5);

   }
   public void forloop1(){
//       for(int i=1; i<=10;i++){
//           System.out.println(i);
//       }

//        for(int i=10;i>=1; i-- ){
//            System.out.println(i);
//        }

     int firstnumber=0;
        int secondnumber=1;

        for(int i=1;i<=10;i++){ // 0,1,1,,2,3,5,,8,13

            int thirdNumber=firstnumber+secondnumber;
             firstnumber=secondnumber;
            secondnumber=thirdNumber;
            System.out.println(secondnumber);
            if (secondnumber%2==0){
                System.out.println(secondnumber +" this is even number");
            }
            else {
                System.out.println(secondnumber + " this is odd number");
            }
        }
   }

   public void startone(){
       for (int i =1; i<=10; i++){
           for (int j =1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }
/*
****************************
     ***************************
            **************************
 */
//mentoring access, if else stmt and loop.
    public static void main(String[] args) {
        LoopDemo2 obj= new LoopDemo2 ();
      //  obj.whileLoop();
     //  obj.forLoop();
        //obj.doWhileLoop();
        //obj.forloop1();
        obj.startone();
    }

}
