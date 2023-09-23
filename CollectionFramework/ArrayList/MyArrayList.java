package com.jsp.CollectionFramework;

public class MyArrayList {
	private int data[];
	private int nextElement;
	//constructor
	
	public MyArrayList() {
		data=new int[10];
		nextElement=0;
	}
	
	
	
	public MyArrayList(int size) {
		data=new int[size];
		nextElement=0;
	}
	
	
	public MyArrayList(int newData[]) {
		data=new int[newData.length];
		for(int i=0;i<newData.length;i++) {
			data[i]=newData[i];
			nextElement++;
		}
	}
	
	
	//override toString()
	@Override
	public String toString() {
		System.out.print("[ ");
		for(int i=0;i<data.length;i++)
		{
			if(i<=data.length-2)
			{
				System.out.print(data[i]+",");
			}
			else
				System.out.print(data[i]);
			
		}
		return "]";
	}
	public boolean isEmpty() {
		return nextElement==0;
	}
	public int size() {
		return nextElement;
	}
	//to add element in ArrayList
	
	public void add(int element) {
		if(nextElement==data.length) {
			incrementCapacity();
		}
		data[nextElement]=element;
		nextElement++;
	}
	private void incrementCapacity() {
		// TODO Auto-generated method stub
		int temp[]=data;
		data=new int[temp.length*(3/2)+1];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	public int removeLast() {
		int temp=data[nextElement-1];
		data[nextElement-1]=0;
		nextElement--;
		return temp;
	}
}
