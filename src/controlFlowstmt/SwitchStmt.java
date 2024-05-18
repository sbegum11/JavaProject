package controlFlowstmt;

public class SwitchStmt {
   public void switchCase(){
      int a=5;
      //int b= 8;
      switch (a){

     // break means to stop execute the code after reach the right stmt.
          case 1: // 1 is case value not case number
              System.out.println("I am in case 1");
              break;
          case 2: // 2 is case value not case number
              System.out.println("I am in case 2");
              break;
          case 3: // 3 is case value not case number
              System.out.println("I am in case 3");
              break;
          case 4: // 4 is case value not case number
              System.out.println("I am in case 4");
              break;
          case 5: // 5 is case value not case number
              System.out.println("I am in case 5");
              break;
          case 6: // 6 is case value not case number
              System.out.println("I am in case 6");
      }
         String name= "Subarna";
        switch ("Subarna"){
            case "Rejaur":
                System.out.println("print case Rejaur");
               break;
            case ("Bashir")  :
                System.out.println("print case Bashir");
                break;
            case ("Emo") :
                System.out.println("print case Emo");
                break;
            case ("Subarna") :
                System.out.println("print case Subarna");
                break;
            case("Arafat") :
                System.out.println("print case Arafat");






        }

   }

    public static void main(String[] args) {
        SwitchStmt obj= new SwitchStmt();
        obj.switchCase();


    }


}
