import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer, Integer> obj = new HashMap<Integer, Integer>();
		obj.put(1, 100);
		obj.put(2, 200);
		obj.put(3, 300);
		obj.put(4, 400);
		
		System.out.println(obj.size());
		
		for (int i=1;i<=obj.size();i++){
			System.out.println(obj.get(i));
		}
		
		if(obj.containsKey(5))
			System.out.println("Key contains");
		else
			System.out.println("Key doesnot contains");
		
		if(obj.containsValue(300))
			System.out.println("Value contains");
		else
			System.out.println("Value doesnot contains");
		
		System.out.println(obj.isEmpty());
		
		obj.remove(3);
		System.out.println(obj.size());
		for (int i=1;i<=obj.size()+1;i++){
			System.out.println(obj.get(i));
		}
	}

}
