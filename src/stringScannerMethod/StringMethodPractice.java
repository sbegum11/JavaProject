package stringScannerMethod;

public class StringMethodPractice {
    //String holds group of characters
    //Each String holds an index value
    public void stringMethodDemo() {
        String Upright1 = "Subarna";
        String Upright2 = "Is learning Java Selenium";

        System.out.println(Upright1.toUpperCase());
        System.out.println(Upright2.toLowerCase());

        System.out.println("Length is " + Upright1.length());
        System.out.println(Upright2.length());
        System.out.println("I am learning " + Upright2.substring(12));
        System.out.println("the progreamming language I am learning " + Upright2.substring(12, 16));
        System.out.println(Upright1.charAt(0));
        if (Upright2.contains("selenium")) {
            System.out.println("the word selenium is there");
        } else {
            if (Upright2.startsWith("is")) {
                System.out.println("the sentance stared with is");
            } else if (Upright2.endsWith("Selenium")) {
                System.out.println("the sentance ends with Selenium");
            } else {
                System.out.println("nothing matched");
            }

        }

        if (Upright2.contains("Selenium")) {
            System.out.println("Upright1");
        }
        String s1 = "Subarna";
        String s2 = "Mahdiya";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("matched");
        } else {
            System.out.println("did not match");
        }
    }
            public static void main (String[]args){
            StringMethodPractice obj = new StringMethodPractice();
            obj.stringMethodDemo();
        }
        }














