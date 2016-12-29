package AccessModifierPackage1;

public class SubClass extends SamePackage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj = new SubClass();
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		obj.method1();
		obj.method2();
		obj.method3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}
