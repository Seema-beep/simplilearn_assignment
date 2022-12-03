package collections;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionAssisted {

	public static void main(String[] args) {
		
		// creating arrayList
		System.out.println("ArrayList");
		ArrayList<String>city=new ArrayList<>();
		city.add("Bangalore");
		city.add("Delhi");
		System.out.println(city);//[Bangalore, Delhi]
		
		
		//creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vec=new Vector<>();
		vec.addElement(15);
		vec.addElement(30);
		System.out.println(vec);//[15, 30]
		
		//creating linklist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String>names=new LinkedList<String>();
		names.add("Alex");
		names.add("John");
		java.util.Iterator<String>itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
          //creating hashSet
			System.out.println("\n");
			System.out.println("HashSet");
			HashSet<Integer>set=new HashSet<Integer>();
			set.add(101);
			set.add(103);
			set.add(102);
			set.add(104);
			System.out.println(set);//[101, 102, 103, 104]
			
			
			//creating linkedhashSet
			
			System.out.println("\n");
			System.out.println("LinkedHashSet");
			LinkedHashSet<Integer>set2=new LinkedHashSet<Integer>();
			set2.add(11);
			set2.add(13);
			set2.add(12);
			set2.add(14);
			System.out.println(set2);//[11, 13, 12, 14]
			
			
			

			
		}
		
		

	}

}
