package AccessModifierPackage1;

public class SamePackage {
	//Access modifier instance variables
		public int a;
		protected int b;
		int c;
		@SuppressWarnings("unused")
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
		@SuppressWarnings("unused")
		private void method4(){
			System.out.println("Private Method");
		}
}
