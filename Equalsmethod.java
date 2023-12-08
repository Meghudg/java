package com.stringexample;
//original content

public class Equalsmethod {
	//public boolean equals(object another)
	//public boolean equalsIgnoreCase(string another)
	public static void main(String[] args) {
		//string literal
		String s1="Dhoni";
		String s2="DHONI";
	
		String s3=new String("Dhoni");
		 String s4="sachin";
		 System.out.println(s1.equals(s2));//true
		 System.out.println(s1.equals(s3));
		 
	}

}
