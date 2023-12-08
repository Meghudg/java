package com.stringbufferex;

public class StringBufferdelete {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("The class of java programming");
		//delete(start index,end index)//
		s.delete(0,3);
		System.out.println(s);
		//deletecharAt()
		s.deleteCharAt(3);
		System.out.println(s);
		

	}

}
