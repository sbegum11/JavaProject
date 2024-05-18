package collectionFrameWorkDemo;

import java.util.HashSet;

public class HashSetpractice1 {
    // Hashset class can not contain duplicate elements
    // it is a best approach to search
    // Hashset class does not maintain insertion order
    // We can add and remove data or element.

    public void hashdemo1(){
        HashSet<String> flowers= new HashSet<String>()  ;

        flowers.add("Rose");
        flowers.add("lily");
        flowers.add("lily");
        flowers.add("orchid");
        flowers.add("sunflower");
        flowers.add("dahliya");
        flowers.add("marygold");
        flowers.add("cosmos");
        System.out.println(flowers);
        System.out.println(flowers.size());
        System.out.println(flowers.contains("cosmos"));
        System.out.println(flowers.isEmpty());
        System.out.println(flowers.remove("lily"));
        System.out.println(flowers);
        System.out.println(flowers);
        flowers.clear();
        System.out.println(flowers);
        System.out.println(flowers.isEmpty());

        System.out.println("---------------");
        HashSet<Integer> num= new HashSet<>();
        num.add(2);
        num.add(1);
        num.add(3);
        num.add(5);
        num.add(4);
        System.out.println(num);
        System.out.println(num.size());

        for(int i=1; i<=10;i++){
            if(num.contains(i)){
                System.out.println(i + "was found in the set");

            }
            else{
                System.out.println(i + "was not found in the set");
            }



        }

    }

    public static void main(String[] args) {
        HashSetpractice1 obj= new HashSetpractice1();
        obj.hashdemo1();
    }














}
