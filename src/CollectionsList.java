import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionsList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		List obj = new ArrayList();
		@SuppressWarnings("rawtypes")
		List obj1 = new LinkedList();
		@SuppressWarnings("rawtypes")
		List obj2 = new Stack();
		@SuppressWarnings("rawtypes")
		List obj3 = new Vector();
		
		//Adding to the List Object
		obj.add(100);
		obj.add("Suresh");
		obj.add(2, 400);
		obj.add(3, "Payala");
		obj.add(200.30);
		
		//Display all together
		System.out.println(obj);
		
		//Retrieve size
		obj.size();
		
		//Retrieve values
		for (int i=0;i<obj.size();i++){
			System.out.println(obj.get(i));
		}
		//Contains
		if(obj.contains("Suresh"))
			System.out.println("Suresh Present");
		else
			System.out.println("Suresh doesnot present");
		
		//is Empty
		System.out.println(obj.isEmpty());
		
		//Remove by index and then print
		obj.remove(2);
		for (int i=0;i<obj.size();i++){
			System.out.println(obj.get(i));
		}
		
		//Remove by value and then print
		obj.remove(200.30);
		for (int i=0;i<obj.size();i++){
			System.out.println(obj.get(i));
		}
		
		//Clear all and then print
		obj.clear();
		System.out.println(obj);
	
		//Linked List
		//Adding to the List Object
		obj1.add(100);
		obj1.add("Suresh");
		obj1.add(2, 400);
		obj1.add(3, "Payala");
		obj1.add(200.30);
		
		//Display all together
		System.out.println(obj1);
		
		//Retrieve size
		obj1.size();
		
		//Retrieve values
		for (int i=0;i<obj1.size();i++){
			System.out.println(obj1.get(i));
		}
		//Contains
		if(obj1.contains("Suresh"))
			System.out.println("Suresh Present");
		else
			System.out.println("Suresh doesnot present");
		
		//is Empty
		System.out.println(obj1.isEmpty());
		
		//Remove by index and then print
		obj1.remove(2);
		for (int i=0;i<obj1.size();i++){
			System.out.println(obj1.get(i));
		}
		
		//Remove by value and then print
		obj1.remove(200.30);
		for (int i=0;i<obj1.size();i++){
			System.out.println(obj1.get(i));
		}
		
		//Clear all and then print
		obj1.clear();
		System.out.println(obj1);
	
		//Stack
		//Adding to the Stack Object
		obj2.add(100);
		obj2.add("Suresh");
		obj2.add(2, 400);
		obj2.add(3, "Payala");
		obj2.add(200.30);
		
		//Display all together
		System.out.println(obj2);
		
		//Retrieve size
		obj2.size();
		
		//Retrieve values
		for (int i=0;i<obj2.size();i++){
			System.out.println(obj2.get(i));
		}
		//Contains
		if(obj2.contains("Suresh"))
			System.out.println("Suresh Present");
		else
			System.out.println("Suresh doesnot present");
		
		//is Empty
		System.out.println(obj2.isEmpty());
		
		//Remove by index and then print
		obj2.remove(2);
		for (int i=0;i<obj2.size();i++){
			System.out.println(obj2.get(i));
		}
		
		//Remove by value and then print
		obj2.remove(200.30);
		for (int i=0;i<obj2.size();i++){
			System.out.println(obj2.get(i));
		}
		
		//Clear all and then print
		obj2.clear();
		System.out.println(obj2);
	
		//Vector
		//Adding to the Vector Object
		obj3.add(100);
		obj3.add("Suresh");
		obj3.add(2, 400);
		obj3.add(3, "Payala");
		obj3.add(200.30);
		
		//Display all together
		System.out.println(obj3);
		
		//Retrieve size
		obj3.size();
		
		//Retrieve values
		for (int i=0;i<obj3.size();i++){
			System.out.println(obj3.get(i));
		}
		//Contains
		if(obj3.contains("Suresh"))
			System.out.println("Suresh Present");
		else
			System.out.println("Suresh doesnot present");
		
		//is Empty
		System.out.println(obj3.isEmpty());
		
		//Remove by index and then print
		obj3.remove(2);
		for (int i=0;i<obj3.size();i++){
			System.out.println(obj3.get(i));
		}
		
		//Remove by value and then print
		obj3.remove(200.30);
		for (int i=0;i<obj3.size();i++){
			System.out.println(obj3.get(i));
		}
		
		//Clear all and then print
		obj3.clear();
		System.out.println(obj3);	
	}
}
