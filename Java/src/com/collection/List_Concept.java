package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Concept {

	public static void main(String[] args) {

		List<Object> r1=new ArrayList<Object>();
		List<Integer> r=new ArrayList<Integer>();

		//Add()
		r.add(13);
		r.add(14);
		r.add(13);
		r.add(66);
		r.add(99);
		r.add(3);
		r.add(null);

		//Object It support Dissimilar Data types 
		r1.add(1.3);
		r1.add(14);
		r1.add("String");
		r1.add(99);
		r1.add(true);
		r1.add('A');

		System.out.println(r);
		System.out.println(r1);

		//size()
		int i =r1.size();
		System.out.println(i);

		//get

		Object j=r1.get(3);
		System.out.println(j);

		//set

		r1.set(2, "Madhan");
		System.out.println(r1);

		//remove

		r1.remove(2);
		System.out.println(r1);

		//index of

		int k=r1.indexOf(99);
		System.out.println(k);

		//clear

		// r1.clear();
		//  System.out.println(r1);

		//Addall

	//	r1.addAll(r);
	//	System.out.println(r1);

		//contain
//		boolean c=r1.contains(99);
//		System.out.println(c);

		//retain all

	//	r1.retainAll(r);
//		System.out.println(r1);

		//remove all

		r1.removeAll(r);
		System.out.println(r1);
		
	




	}
}
