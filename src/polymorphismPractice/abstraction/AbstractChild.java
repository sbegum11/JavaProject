package polymorphismPractice.abstraction;

public class AbstractChild extends AbstractParent{

    @Override
    public void carddetails(){

        String crdholdername = "arafat";
        int cardnumber= 1234567;
        String address= "new york";
        int zipcode = 11355;
        int cvv= 123;

        System.out.println(crdholdername);
        System.out.println(cardnumber);


    }
    @Override
    public void cardpayment(){
        System.out.println("card payment complete");

    }

    public  void reduceamount(){
        System.out.println("reducing amount was successful");

    }

    public static void main(String[] args) {
        AbstractChild obj = new AbstractChild();
        obj.carddetails();
        obj.cardpayment();
        obj.reduceamount();
    }
}
