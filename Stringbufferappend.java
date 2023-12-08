package com.stringbufferex;

public class Stringbufferappend {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		//mutable
		//now original string is changed
		sb.append("World");
		System.out.println(sb);
	
	//insert method
		StringBuffer sb1=new StringBuffer("hi");
		sb1.insert(2,"welcome");
		System.out.println(sb1);
		
		//replace
		sb1.replace(1, 3, "java");
		System.out.println(sb1);
	}
}	
