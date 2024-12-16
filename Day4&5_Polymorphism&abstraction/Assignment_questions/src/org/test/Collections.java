package org.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Collections {
	
	public static void main(String[] args) {
		
		List<Integer> L1 = new LinkedList<>();
		List<Integer> L2 = new LinkedList<>();
		//List<Integer> L2 = new ArrayList<>();
		//Vector<Integer> v1 = new Vector();
		L1.add(5);
		L1.add(12);
		L1.add(24);
		L1.add(32);
		L1.add(5);
		
		L2.add(24);
		L2.add(32);
		L2.add(5);
		
		System.out.println(L1.size());
		System.out.println(L1.indexOf(12));
		System.out.println(L1.get(2));
		System.out.println(L1.set(2,100));
		System.out.println(L1.get(2));
		System.out.println(L1.contains(100));
		System.out.println(L1.remove(0));
		System.out.println(L1.removeAll(L2));
		
		Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(5);
        set1.add(12);
        set1.add(24);
        set1.add(32);
        set1.add(5); // Duplicate

        set2.add(24);
        set2.add(32);
        set2.add(5);

        System.out.println(set1.size()); 
        System.out.println(set1.contains(12)); 
        System.out.println(set1.remove(12)); 
        System.out.println(set1.removeAll(set2)); 
        System.out.println(set1.retainAll(set2)); 
        set1.clear(); 
        System.out.println(set1.isEmpty()); 
        
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        System.out.println(map.size()); 
        System.out.println(map.get(2)); 
        System.out.println(map.containsKey(3)); 
        System.out.println(map.containsValue("Apple")); 
        System.out.println(map.remove(1)); 
        map.put(2, "Blueberry"); 
        System.out.println(map.get(2)); 
        map.clear(); 
        System.out.println(map.isEmpty()); 
		}
	
	
	
}
