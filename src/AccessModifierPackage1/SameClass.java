package AccessModifierPackage1;

public class SameClass {
	//Access modifier instance variables
	public int a;
	protected int b;
	int c;
	private int d;

	//Access modifier methods
	public void method1(){
		System.out.println("Public Method");
	}
	protected void method2(){
		System.out.println("Protected Method");
	}
	void method3(){
		System.out.println("Default Method");
	}
	private void method4(){
		System.out.println("Private Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameClass obj = new SameClass();
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		obj.d = 400;
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		
		//Object on class which is on same package
		SamePackage obj1 = new SamePackage();
		obj1.a = 100;
		obj1.b = 200;
		obj1.c = 300;
		//cannot access d as its private
		//obj1.d
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		//System.out.println(obj.d);
		obj1.method1();
		obj1.method2();
		obj1.method3();
		//cannot access method4 as its private
		//obj1.method4();
		
		
	}

}
