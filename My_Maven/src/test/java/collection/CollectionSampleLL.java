package collection;


import java.util.LinkedList;

public class CollectionSampleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj=new LinkedList();   //LinkedList; Non Generic LinkedList
		obj.add(1);   // to add an element into the LinkedList we use 'add' method
		obj.add("Array");
		obj.add('d');
		obj.add(2.3f);
		
		System.out.println(obj);
		
		LinkedList<String> obj1=new LinkedList(); //LinkedList; Generic LinkedList
		obj1.add("ab");
		obj1.add("ac");
		obj1.add("ad");
		System.out.println(obj1);
		
		obj1.remove(1);  // to remove element into the LinkedList we use 'remove' method
		System.out.println(obj1);  
		
		LinkedList<String> obj2=new LinkedList(); //LinkedList; Generic LinkedList
		obj2.add("Zb");
		obj2.add("Zc");
		obj2.addAll(obj1);     // to merge 2 LinkedList
		System.out.println(obj2);

		
		obj2.removeAll(obj2);     // to remove all elements from the LinkedList
		System.out.println(obj2);
		
		System.out.println(obj1.get(1));   // to view the values in the list
		
		System.out.println(obj.size());  // to know the size
		
		boolean a=obj.contains("Array"); // to check if it contains the word is present, if present True
		System.out.println(a);
		
		boolean c=obj.contains("array"); // to check if it contains the word is present, if present True
		System.out.println(c);
		
		boolean b=obj.contains("Hi"); // to check if it contains the word is present, if not present False
		System.out.println(b);
	}

}
