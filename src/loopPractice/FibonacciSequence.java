package loopPractice;

public class FibonacciSequence {
    public void fibonacciLoop() { //fibonacchi numbers : 0,1,1,2,3,5,8,13,21,34,55......
    int firstnumber= 0;
    int secondnumber=1;
    for(int i=1; i<=11; i++) {
        System.out.println("interation "+i);
        int add=firstnumber+ secondnumber;
        firstnumber=secondnumber;
        secondnumber=add;
        System.out.println(secondnumber);

    }
    }
    public void fibonacciLoop1(){
        int a=0;
        int b=1;
        for(int i=1; i<=11; i++){
            System.out.println("interation" +i);
        int add=a+b;
        a=b;
        b=add;
            System.out.println(b);

        }

    }
    public static void main(String[] args) {
//        int a1 = 0, a2 = 1, sum = 0;
//        System.out.println(a1+ "  "+a2);
//        for(int i=2;i<10; i++){
//            sum=a1+a2;
//            System.out.println(" "+sum);
//            a1=a2;
//            a2=sum;
        FibonacciSequence obj= new FibonacciSequence();
        obj.fibonacciLoop1();
    }






}


