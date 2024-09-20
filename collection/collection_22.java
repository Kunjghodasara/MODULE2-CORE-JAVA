package com.assignment.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class collection_22 {
		
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(156);
		hs.add(54);
		hs.add(235);
		hs.add(123);
		hs.add(102);
		hs.add(79);
		hs.add(99);
		
		System.out.println("Set : " + hs);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			list.add(itr.next());
		}
		System.out.println("list : " + list);

	}
}
