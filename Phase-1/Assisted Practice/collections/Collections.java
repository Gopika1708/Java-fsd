package collections;
import java.util.*;
public class Collections {
public static void main(String[] args) {
	
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Chennai");//
	      city.add("Mumbai");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(1); 
	      vec.addElement(3); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Prem");  
	      names.add("Anu");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(150);  
	       set.add(103);  
	       set.add(110);
	       set.add(111);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(20);  
	       set2.add(40);  
	       set2.add(35);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
	}





