package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class Set_Tree {
public static void main(String[] args) {
		
		Set<Integer> r=new TreeSet<Integer>();		
		r.add(13);
		r.add(14);
		r.add(13);
		r.add(66);
		r.add(99);
		r.add(35);
	    r.add(null);
	    
	    System.out.println(r);
	
}
}