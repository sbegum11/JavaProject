package arraysDemo;

public class ArrayDemo1 {
    public void evenOddArray() {
        int a[] = {3, 4, 5, 6, 7, 8, 9, 10};
        //extracting even numbers
//        for (int i = 0;i<a.length;i++){
//          if(a[i]%2==0)
//            System.out.println(a[i]);
//        }
        //extracting odd number
        for (int i = 0; i <= a.length; i++) {
           // System.out.println(i);
            System.out.println(a[i]);
//            if (a[i] % 2 != 0) {
//                System.out.println(a[i]+" -- odd number");
//            } else if (a[i] % 2 == 0) {
//                System.out.println(a[i]+" -- even number");
//            }


        }
    }

    public static void main(String[] args) {
        ArrayDemo1 obj= new ArrayDemo1();
        obj.evenOddArray();
    }
}
