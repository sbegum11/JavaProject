package arraysDemo;

public class ArrayPractice {
    // Array can hold multiple values
    public void singleArray(){
        int [] x= {5,7,8,9,10};
        System.out.println(x[0]);

        int[]y= new int [7];
        y[0]=1;
        y[1]=2;
        y[2]=3;
        y[3]=4;
        y[4]=5;
        y[5]=6;
        y[6]=7;
        System.out.println(y[3]);

        String []name= {"Subarna","Emu","bashir","musa"};
        System.out.println(name[0] +"\n"+name[1]+ "\n"+name[2]+"\n"+ name[3] ); //escape sequence

        for (int i = 0; i<x.length; i++){
            System.out.println("this is for whole array"+ x[i]);
        }


    }


    public static void main(String[] args) {
        ArrayPractice obj= new ArrayPractice ();
        obj.singleArray();
    }
}
