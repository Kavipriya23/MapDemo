package ProjMap;

import java.util.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapLin {

	public static void main(String[] args) {
		//HashMap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"Priya");    
			      hm.put(2,"Govind");    
			      hm.put(3,"Shiv");   
			       
			      System.out.println("\nThe Elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
	   //HashTable
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"Kani");  
			      ht.put(5,"Mani");  
			      ht.put(6,"Meena");  
			      ht.put(7,"Kavi");  

			      System.out.println("\nThe Elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
	   //TreeMap
			      
			      TreeMap<Integer,String> ma=new TreeMap<Integer,String>();    
			      ma.put(8,"Nataraj");    
			      ma.put(9,"Mohan");    
			      ma.put(10,"Gopi");       
			      
			      System.out.println("\nThe Elements of TreeMap are ");  
			      for(Map.Entry l:ma.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    
			      
			   }  

}
