
public class InterfaceImplementation implements InterfaceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementation obj = new InterfaceImplementation();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.locMethod();
		obj.methodOverride();
		
		InterfaceTwo obj2 = new InterfaceImplementation();
		obj2.method1();
		obj2.method2();
		obj2.method3();
		obj2.method4();
		obj2.methodOverride();
		//Cannot access the implementation class local method 
		//obj2.locMethod();
		
		InterfaceOne obj3 = new InterfaceImplementation();
		obj3.method1();
		obj3.method2();
		obj3.methodOverride();
		
		//the following methods are not accessible as they are of InterfaceTwo
		//obj3.method3();
		//obj3.method4();
		//Cannot access the implementation class local method 
		//obj3.locMethod();
	}
	public void method1(){
		System.out.println("This is method 1 in implementation class");
	}
	public void method2(){
		System.out.println("This is method 2 in implementation class");
	}
	public void method3(){
		System.out.println("This is method 3 in implementation class");
	}
	public void method4(){
		System.out.println("This is method 4 in implementation class");
	}
	//Local method to the class
	public void locMethod(){
		System.out.println("This is local method to the class");
	}
	public void methodOverride(){
		System.out.println("This is method overriding defined in both interfaces");
	}
}
