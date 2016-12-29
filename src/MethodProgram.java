//Instance Variable
//Method definition
//Method overloading
//Static Method
//Static variable
//method with return type
public class MethodProgram {
	//Instance Variable
	public int abc;
	//Static Variable
	public static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodProgram obj = new MethodProgram();
		//Instance variable declaration
		obj.abc = 2000;
		System.out.println("Instance Variable is: "+obj.abc);
		
		//Method overloading
		obj.add(100, 200);
		obj.add(100,  200, 300);
		obj.add("Suresh", "Payala");
		obj.add(100,  200.30);
		obj.add(300.40,  400);
		
		//Static variable instance
		MethodProgram.name = "Static Suresh";
		System.out.println("Static Instance Variable is: "+MethodProgram.name);
		
		//Static Method
		MethodProgram.staticMethod();
		
		//Method with return type
		int c = obj.addReturn(101, 201);
		System.out.println("Value returned from method is: "+c);
	}
	public void add(int a, int b){
		System.out.println("Sum of two is: "+ (a+b));
	}
	public void add(int a, int b, int c){
		System.out.println("Sum of three is: "+(a+b+c));
	}
	public void add(String s1, String s2){
		System.out.println("String Concatenation is: "+(s1+s2));
	}
	public void add(int a, double b){
		System.out.println("Sum of int and float is: "+(a+b));
	}
	public void add(double a, int b){
		System.out.println("Sum of float and int is: "+(a+b));
	}
	public static void staticMethod(){
		System.out.println("This is Static Method ");
	}
	public int addReturn(int a, int b){
		return (a+b);
	}
}
