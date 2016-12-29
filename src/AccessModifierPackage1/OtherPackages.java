package AccessModifierPackage1;

import AccessModifierPackage2.DifferentPackage;

public class OtherPackages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentPackage obj = new DifferentPackage();
		obj.a = 100;
		obj.method1();
		System.out.println(obj.a);
	}

}
