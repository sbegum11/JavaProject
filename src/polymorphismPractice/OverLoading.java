package polymorphismPractice;

public class OverLoading {
    //in overloading method name is same but parameter size and order will not be the same
    //we use overloading to use multiple login functionality
    //parameter is used in overloading
    //parameter size and order shouldn't be the same for every login functionality.

    public void login(String username,int password){
        System.out.println("macys login " + " "+ username +" "  +  password);
        System.out.println();
    }
    public void login (int password,String username) {
        System.out.println("walmart login " +  password+ " " +  username);

    }
    public void login (String username,int password,int pin){
        System.out.println("amazon login " +username+" "  +  password +" " + pin);
    }

    public static void main(String[] args) {
        OverLoading obj = new OverLoading();
        obj.login("suborna",1234);

        obj.login(1234,"suborna");

        System.out.println();

        obj.login("suborna",1234,123);

    }
}
