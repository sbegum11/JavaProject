package polymorphismPractice.abstraction;
// Abstraction is a process where we hide the implementation part and showing only functionality.
//An abstract class cannot be instantiated(cannot create an object)
// In abstract class may have abstract method and non-abstract method (0 to 100% abstraction)
// if there is no abstract method in an abstract class -is called 0% abstraction
// if there is one abstract method and one non-abstract method = this is called 50% abstraction
// If there is no non-abstract method  and only have abstract method - this s called 100% abstraction
public abstract class AbstractSubParent {
    public void cardinfo() {
        String cardholdername = "Subarna";
        int cardnumber = 12345678;
        int zipcode = 11433;
        int cvv = 123;
    }
    public abstract void makepayment() ;

    public abstract void reducedamount();

    }












