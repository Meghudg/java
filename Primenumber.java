package project1;

public class Primenumber {

	public static void main(String[] args) {
		int a=7;
		checkPrime (a);
		
	}
	private static void checkPrime(int a)
	{
		 int count=0;
		 if(a<2)
		 {
			 System.out.println("the given number" +a+"is not prime");
		 }
		 for(int i=1;i<=a;i++)
		 {
			 if(a%i==0)
				 count+=1;
		 }
		 if(count>2)
			 System.out.println("the given number"+a+"is not prime");
		 else
			 System.out.println("the given number"+a+"is prime");
	}
}	
	
		

	


