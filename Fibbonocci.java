package project1;
public class Fibbonocci {
	 public static void main(String[] args) {
		 int a = 10,num1 = 0,num2 = 1;
		 System.out.print(num1+ " "+num2);
		 for(int i = 2;i<=a;++i)
		 {
			 int num3 = num1+num2;
			 System.out.println(" " +num3);
			 num1 = num2;
			 num2 = num3;
		 }
	 }
}	 
		 
		 


		

	


