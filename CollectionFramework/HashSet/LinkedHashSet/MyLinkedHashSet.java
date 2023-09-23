package com.jsp.CollectionFramework;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
	
	//	Insertion order is maintained
	//	Duplicates are not allowed
		
		ls.add("Virat");
		ls.add("Virat");
		ls.add("Dhoni");
		ls.add("Rohit");
		ls.add("Dhawan");
		ls.add("Rohit");
		
		System.out.println(ls);

	}

}