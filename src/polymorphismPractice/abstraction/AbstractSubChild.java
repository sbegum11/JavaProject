package polymorphismPractice.abstraction;

public class AbstractSubChild extends AbstractSubParent {

    @Override
    public void cardinfo() {
        String cardholdername= "Subarna";
        int cardnumber=12345678;
        String address= "New York";
        int cvv= 123;
        System.out.println(cardholdername);
        System.out.println(cardnumber);
    }
    @Override
    public void makepayment(){
        System.out.println("card payment complete");

    }
    @Override
    public void reducedamount(){
        System.out.println("reducing amount was successful");

    }

    public static void main(String[] args) {
        AbstractSubChild obj= new AbstractSubChild ();
        obj.cardinfo();
        obj.makepayment();
        obj.reducedamount();


    }









}
