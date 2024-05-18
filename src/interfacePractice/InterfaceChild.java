package interfacePractice;

public class InterfaceChild implements InterfaceParent{

    public void PIVAL(){
        System.out.println(valueofPI);
    }

    @Override
    public void cardpayment(){
        System.out.println("payment is done");

    }
    @Override
    public void reduceamount(){
        System.out.println("amount was reduced");

    }

    public static void main(String[] args) {
        InterfaceChild obj = new InterfaceChild();
        obj.cardpayment();
        obj.reduceamount();
        obj.PIVAL();

    }

}
