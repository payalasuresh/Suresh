import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> obj = new HashSet<Integer>();
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(100);
		
		System.out.println(obj);
		
		obj.remove(100);
		System.out.println(obj);
		
		if(obj.contains(200))
			System.out.println("it contains");
		else
			System.out.println("it doesnot contains");

		System.out.println(obj.size());
		
		System.out.println(obj.isEmpty());
		
		Iterator <Integer> itr = obj.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		obj.clear();
		System.out.println(obj);
	}

}
