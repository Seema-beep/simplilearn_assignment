package maps;
import java.util.*;

public class mapDemo {

	public static void main(String[] args) {
		
		//Hashmap
		HashMap<Integer, String>hm=new HashMap<Integer,String>();
		hm.put(1, "Jim");
		hm.put(2, "Mary");
		hm.put(3, "Catic");
		System.out.println("\n The elements of the HashMap are");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//HashTable
		Hashtable<Integer, String>ht=new Hashtable<Integer,String>();
		ht.put(4, "Ales");
		ht.put(5, "Rosy");
		ht.put(6,"Jack");
		ht.put(7, "John");
		
		//TreeMap
		TreeMap<Integer, String>map=new TreeMap<Integer,String>();
		map.put(8, "Annie");
		map.put(9, "Carlotte");
		map.put(10, "Catie");
		System.out.println("\n The elements of TreeMap");
		for(Map.Entry I:map.entrySet()) {
			System.out.println(I.getKey()+" "+I.getValue());
		}
		

	}

}
