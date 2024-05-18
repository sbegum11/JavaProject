package accesDemo.noAccessPractice;

public class Am1 {

    public int hour= 3;
   private int minute= 18;
   protected String day= "Saturday";

public void printhour(){
    System.out.println(hour);

}

private void printminute(){
    System.out.println(minute);
}

protected void printday(){
    System.out.println(day);
}

    public static void main(String[] args) {
    Am1  obj= new Am1 ()  ;
        System.out.println(obj.minute);
        System.out.println(obj.day);
        System.out.println(obj.hour);
        obj.printday();
        obj.printhour();
        obj.printminute();

    }



}
