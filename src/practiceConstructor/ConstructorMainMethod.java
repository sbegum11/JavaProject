package practiceConstructor;

public class ConstructorMainMethod {
	int modelyear;
	int speed;
	String modelname;
	
	
	
	public ConstructorMainMethod(int modelyear,int speed,String modelname) {
		this. modelyear  = modelyear;
		this.speed = speed;
		this.modelname = modelname;



	}

 //public ConstructorMainMethod(String buildname) {
	// modelname = buildname;
	 
	 
 //}
	
	
	public static void main(String[] args) {
		// Constructor Parameter
		
		ConstructorMainMethod obj1= new ConstructorMainMethod(2020,1000,"Nishan");
		//ConstructorMainMethod b= new ConstructorMainMethod("Nissan");
		//obj1.modelname = "Nishan";
		//obj1.modelyear = 2020;
		//obj1.speed = 1000;
		System.out.println(obj1.speed);
		System.out.println(obj1.modelyear);
		System.out.println(obj1.modelname);
		
		
		ConstructorMainMethod obj2= new ConstructorMainMethod(2021,4000,"Toyota");

		System.out.println(obj2.speed);
		System.out.println(obj2.modelyear);
		System.out.println(obj2.modelname);
		
		ConstructorMainMethod obj3= new ConstructorMainMethod(2020,6000,"Honda");

		System.out.println(obj3.speed);
		System.out.println(obj3.modelyear);
		System.out.println(obj3.modelname);

	}

}
