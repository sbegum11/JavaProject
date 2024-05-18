package loopPractice;

public class LoopSubPractice {
    public void whileLoop() {
        int a = 1;
        while (a < 10) {
            System.out.println(a);

            a++;
        }
    }

public void forLoop() {
    for (int b=2;b<10; b++) {
        System.out.println(b);
    }
}
public void doWhile () {
        int c = 3;
        do {
            System.out.println(c);
            c++;
        }
        while (c < 8);
    }

    public static void main(String[] args) {
        LoopSubPractice obj= new LoopSubPractice();
        obj.whileLoop();
        obj.forLoop();
        obj.doWhile();



    }








}
