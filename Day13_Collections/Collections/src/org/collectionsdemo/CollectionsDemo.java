package org.collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
		System.out.println(Math.pow(2,31));
		
		List li = new LinkedList();
		li.add(10);
		li.add("hello");
		li.add(3.1415);
		li.add(true);
		li.add(10);
		
		System.out.println(li);
		
		int lastIndexOf = li.lastIndexOf(10);
		
		List li2 = new ArrayList();
		
		li2.add(10);
		li2.add("hello");
		li2.add(3.1415);
		li2.add(true);
		
		
		int sz = li2.size();
		
		//Vector
		Vector v = new Vector();
		
		v.add('a');
		v.add(3);
		
		//Vector with generics
		
		Vector<Integer> v2 = new Vector<>();
		
		
		System.out.println(v);
		
		System.out.println(li2 + "\n" + sz);
		
		
		
		
		
		
	}

}
