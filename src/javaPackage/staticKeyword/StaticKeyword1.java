package javaPackage.staticKeyword;

public class StaticKeyword1 {
	//static method and variable is belongs to class not to object.
	
	public String name="Subarna";   //instance variable or global variable that needs an object to use in the main method
	
	public static String section ="A"; // This variable belongs to class not any object so this is called class variable. To use this 
	// variable into main method we don't need to create object. only golbal/instance variable and method belongs to object.

	
	public void Printname () {

		System.out.println(name);
	}
	
	
	public static void PrintAll() {
	//System.out.println(name);	//without object cannot use this variable
		System.out.println("Static method");
	}
	

	public static void main(String[] args) {
		
	StaticKeyword1 obj= new StaticKeyword1();
	System.out.println(obj.name);
	System.out.println(section); // not using obj because this was a static variable 
	
	StaticKeyword1 obj2= new StaticKeyword1 ();
	System.out.println(obj2.name);
	System.out.println(section); // not using obj because this was a static variable 
	obj.Printname();
	obj2.Printname();
		
		PrintAll();
		
		
		
		

	}

}
