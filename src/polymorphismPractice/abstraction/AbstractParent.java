package polymorphismPractice.abstraction;

public abstract class  AbstractParent {

    // Abstraction is a process where we hide the implementation part and showing only functionality.
    //An abstract class cannot be instantiated(cannot create an object)
    // In abstract class may have abstract method and non-abstract method (0 to 100% abstraction)
    // if there is no abstract method in an abstract class -is called 0% abstraction
    // if there is one abstract method and one non-abstract method = this is called 50% abstraction
    // If there is no non-abstract method  and only have abstract method - this s called 100% abstraction

    public void carddetails(){

        String crdholdername = "arafat";
        int cardnumber= 1234567;
        String address= "new york";
        int zipcode = 11355;
        int cvv= 123;

    }

    public abstract void cardpayment();


   // public abstract void reduceamount();


}
