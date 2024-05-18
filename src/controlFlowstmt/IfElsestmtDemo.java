package controlFlowstmt;

import java.util.Scanner;

public class IfElsestmtDemo {
    public void ifElseDemo() {
        int a = 6;
        int b = 5;
        if (a == b) {
            System.out.println("a is equal to b");
        }

        int c = 9;
        int d = 9;
        if (c == d) {
            System.out.println("c is equal to " + c + "the value of d is " + d);
        } else {
            System.out.println("the value of c " + c + "the value is d " + d);

        }
    }

    /*
        Declare a total marks = 50

        If total marks greater than 80 show message - "Got Higher First Class "

        If total marks greater than or equal 60 and less than 80 --show message - "Got First Class "

        If total marks greater than or equal 40 and less than 60 show message - "Average"
        If those three conditions failed program go to the next coding block .
        If all fails, it will show message "Failed"

     */
    public void practice() {
        int marks = 50;
        if (marks > 80) {
            System.out.println("Got higer first class");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("Got first class");
        } else {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {
        IfElsestmtDemo obj = new IfElsestmtDemo();
        obj.ifElseDemo();
        obj.practice();


        ////1. Write a Java program to test a number is positive or negative.
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        if(num<=1){
            System.out.println(num +"number is positive");

        }
       else{
            System.out.println(num +"number is negative");
        }

       //Write a java program to compare 2 numbers
        int firstNumber;
       int secondNumber;

       Scanner scn= new Scanner (System.in);
        System.out.println("enter first Number");
        firstNumber=scn.nextInt();
        System.out.println("enter second number");
        secondNumber=scn.nextInt();

        if(firstNumber>=secondNumber){
            System.out.println(firstNumber +"is positive number");
        }


        else if(secondNumber>=firstNumber){
            System.out.println(secondNumber +"is the larger number");

        }
        else   {
        System.out.println("number is neitber large or smaller ");
        }
    }
}
