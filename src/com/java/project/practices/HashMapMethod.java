package com.java.project.practices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<>();
		//to add elements it has put method.
		hash.put(12345, "krithya");
		hash.put(12346, "amit");
		hash.put(12347, "neha");
		hash.put(12346, "shantnu");
		hash.put(12348, "shobha");
		//first method to iterate.
		
		 Set<Entry<Integer, String>> set= hash.entrySet(); 
		 for(Entry<Integer, String> n:set)
		 { System.out.println(n.getKey()+" ="+n.getValue());
		  
		
		 
		HashMap<Integer, String> hash1= new HashMap<>();
		 hash1.put(123, "asd");
		 hash1.put(1234, "c");
		 hash1.put(12, "neha");
		 hash1.put(1, "fgh");
		 hash1.put(348, "fggh");
		
		 hash.put(678, null);
		 hash.put(null, "pranju");
		 hash.put(567, null);
		 
		 hash.putAll(hash1);
		hash.remove(12345);
		//hash.clear();
		 Set<Integer> g  =hash.keySet();
		 for(  Integer j :g) {
			 System.out.println(j);
		 }
		
		System.out.println("########################################################");
		System.out.println(hash.containsKey(12345));
		System.out.println(hash.containsValue("shantnu"));
		System.out.println("size ="+hash.size());
		//second method to iterate
		Set<Entry<Integer, String>> b = hash.entrySet();
		Iterator<Entry<Integer, String>> m  = b.iterator();
		while(m.hasNext()) {
			Entry<Integer, String> it =m.next();
			System.out.println(it.getKey()+" "+it.getValue());
			
		}
	}

	}} 
