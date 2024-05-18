package interfacePractice;

public class InterfaceSubChild implements InterfaceSubParent{

    public void PIofvalue(){
        System.out.println(valueofPI);

    }
    @Override
    public void paycard(){

        System.out.println("make payment");
    }

    @Override
    public void amountreduced(){
        System.out.println("amount reduced");

    }

    public static void main(String[] args) {
        InterfaceSubChild obj= new InterfaceSubChild() ;
        obj.amountreduced();
        obj.paycard();
        obj.PIofvalue();
    }





}
