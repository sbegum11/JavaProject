package polymorphismPractice;
//in overloading method name is same but parameter size and order will not be the same
//we use overloading to use multiple login functionality
//parameter is used in overloading
//parameter size and order shouldn't be the same for every login functionality.
public class SubOverLoading {
    public void signIn (String userId, int password) {
        System.out.println("amazon sign in- userId and password");
    }

    public void signIn(int password, String userId){
        System.out.println("eBay sign in - password and userId ");
    }

    public void signIn(String userId, int password, int pin){
        System.out.println("macys sign in- userId, password and pin");
    }

    public static void main(String[] args) {
        SubOverLoading obj= new SubOverLoading();
            obj.signIn("Subarna",123456);
            obj.signIn(123456,"Mahdiya");
            obj.signIn("MoyMon",123456,123);
        }
    }






