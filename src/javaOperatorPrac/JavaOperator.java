package javaOperatorPrac;

public class JavaOperator {

	public static void main(String[] args) {
		//Arithmatic Operator
		int a= 20;
		int b=9;
		//int result=0;// this is a rule that any int variable's default value is 0.
		int result=a+b;//Addition
		System.out.println(result);
		
		result=a-b;// substraction
		System.out.println(result);
		
		result=a*b;//multiply
		System.out.println(result);
		
		//float f= 3.222f;
		//double d = 3.4564;
		
		float r=(float)a/b;// devide
		double dl=(double) a/b;
		System.out.println(dl);
		System.out.println(r);
		//when the result comes with decimal , than it become float.
		
		//Relational operators- not usually return a value, kind of return a boolean
		boolean br=false;// default value of boolean is false
		br=a>b;
		System.out.println("a>b="+br);
		
		br=a<b;
		System.out.println("a<b="+br);
		
		br=a>=b;
		System.out.println("a>=b="+br);
		
		br=a<=b;
		System.out.println("a<=b="+br);
		
		br=a==b;//equal
		System.out.println("a==b="+br);
		
		br=a!=b;// not equal
		System.out.println("a!=b="+br);
		
		//Logical Operator---and (&&) or (||)
		br=(a>b)&& (a==b);
		System.out.println("(a>b)&&(a==b)"+br);
		br=(a>b)|| (a==b);
		System.out.println("(a>b)||(a==b)"+br);
		br= (a<b)&& (a==b);
		System.out.println("(a<b)&&(a==b)"+br);
		br= (a<b)|| (b<a);
		System.out.println("(a<b)||(b<a)"+br);
		br= (a<b)|| (b<a) &&(a==b);
		System.out.println("(a<b)||(b<a)&&(a==b)"+br);
		
		//Assignment Operators
		a+=b;//a=a+b
		System.out.println(a);
		
		a-=b;//a=a-b
		System.out.println(a);
		
		a*=b;
		System.out.println(a);
		
		//precedence of Operator
	     int e= 5;
	     int g= 9;
	     int f= 8;
	     
	     int d=(e+g*5)*((f+5)+4);//50*17
	     System.out.println(d);
	
		//binary
		int h=1;
		int k=h++;
		System.out.println(k);
		
		
		

	}

}
