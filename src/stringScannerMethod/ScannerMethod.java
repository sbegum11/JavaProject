package stringScannerMethod;

import java.util.Scanner;

public class ScannerMethod {

        public void scaNNerMethod () {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter country");
            String country = input.nextLine();
            System.out.println("Enter your name:");
            String name = input.nextLine();

            System.out.println("enter your age:");
            int age = input.nextInt();
            // int age = 31;
//            System.out.println("Enter your name");
//           String name = input.nextLine();

            System.out.println("enter marks");
            int marks = input.nextInt();
            if (marks > 80) {
                System.out.println("got higher class");
            }
            else{
                System.out.println("failed");
            }
    /*
    1. instantiate scanner class
    2. take input "Enter name"
    3. take input "Enter Age"
    4. Take input " Enter Country"
    5. Take input "Enter Marks"
    6. if marks is greater than 80... print " Got higher class)
       else "got Average
             */
        }
    public static void main(String[] args) {
        ScannerMethod obj= new ScannerMethod();
        obj.scaNNerMethod();

    }
}
