package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {

		Map<Integer,String> m=new HashMap<Integer, String>();
		//put
		m.put(1,"Java");
		m.put(2,"C++");
		m.put(null,null);
		m.put(4,"Python");
		m.put(5,null);
		m.put(1,"JavaScript");
		System.out.println(m);

		//(set) so it return. It does not allow Duplicate value

		Set<Integer> keyset=m.keySet();
		System.out.println(keyset);

		//it supports Dissimilar data  type.
		//string its supports dissimilar data type
		Collection<String> values = m.values();
		System.out.println(values);

		//Entry set
		Set<Entry<Integer,String>>  entryset=m.entrySet();
		System.out.println(entryset);

		//Size

		int i	 =m.size();
		System.out.println(i);
		
		//get
		
		String g=m.get(4);
		System.out.println(g);
		
		//containkey
		
		Boolean s=m.containsKey(4);
        System.out.println(s);
        
        //contain value
        
       Boolean n=m.containsValue(null);
       System.out.println(n);







	}


}
