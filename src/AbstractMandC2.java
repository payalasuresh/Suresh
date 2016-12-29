
public class AbstractMandC2 extends AbstractMandC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMandC2 obj = new AbstractMandC2();
		obj.absMethod();
		obj.concMethod();
		obj.localMethod();
		
		//Creating object on Abstract class indirectly
		AbstractMandC1 obj2 = new AbstractMandC2();
		obj2.absMethod();
		obj2.concMethod();
		// Cannot access below local method
		//obj2.localMethod();

	}
	public void absMethod(){
		System.out.println("Abstract Method defined in Child class");
	}
	public void localMethod(){
		System.out.println("This is local child class method");
	}

}
