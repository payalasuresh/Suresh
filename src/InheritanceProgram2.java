
public class InheritanceProgram2 extends InheritanceProgram1{
	public int var3;
	public int var4;
	
	public void method3(){
		System.out.println("This is method 3 ");
	}
	
	public void method4(){
		System.out.println("This is method 4 ");
	}
	//Method overriding
	public void methodOverride(){
		System.out.println("This is method from child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceProgram2 obj = new InheritanceProgram2();
		obj.var1 = 100;
		obj.var2 = 200;
		obj.var3 = 300;
		obj.var4 = 400;
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.methodOverride();
		System.out.println("Variable 1 value: "+obj.var1);
		System.out.println("Variable 2 value: "+obj.var2);
		System.out.println("Variable 3 value: "+obj.var3);
		System.out.println("Variable 4 value: "+obj.var4);
	}
}
