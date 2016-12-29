package AccessModifierPackage1;

import AccessModifierPackage2.DifferentPackage;

public class OtherPkgSubclass extends DifferentPackage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OtherPkgSubclass obj = new OtherPkgSubclass();
		obj.a = 100;
		obj.b = 200;
		obj.method1();
		obj.method2();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
