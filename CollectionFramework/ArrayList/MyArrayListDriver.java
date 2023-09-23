package com.jsp.CollectionFramework;

public class MyArrayListDriver {
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		//System.out.println(myArrayList);
		System.out.println(myArrayList.isEmpty());
		System.out.println(myArrayList.size());
		System.out.println(myArrayList);
		myArrayList.add(10);
		myArrayList.add(12);
		myArrayList.add(12);
		myArrayList.add(13);
		myArrayList.add(14);
		myArrayList.add(15);
		myArrayList.add(16);
		myArrayList.add(17);
		myArrayList.add(18);
		myArrayList.add(19);
		myArrayList.add(20);
		myArrayList.add(21);
		System.out.println(myArrayList);
		System.out.println(myArrayList.size());
		System.out.println(myArrayList.removeLast());
		System.out.println(myArrayList.removeLast());
		myArrayList.add(22);
		System.out.println(myArrayList);
		System.out.println(myArrayList.size());
		
	}
}
