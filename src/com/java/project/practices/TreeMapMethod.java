package com.java.project.practices;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethod {

	public static void main(String[] args) {
		TreeMap<Character, String> map = new TreeMap<>();
		map.put('d',"amravti");
		map.put('a',"nagpur");
		map.put('C',"PUNE");
		map.put('f',"wardha");
		map.put('e',"amravti");
		//map.put(null,"amravti");null pointer exception will come as it not store null key
		map.put('g',null);
	Set<Character>	h =map.keySet();
	for(Character j :h) {
		System.out.println(j);
	}
		
		Set<Entry<Character, String>> set= map.entrySet();
		for(Entry<Character, String>  e :set) {
			System.out.println(e.getKey()+" = "+e.getValue());
			
			
		}
	}

}
