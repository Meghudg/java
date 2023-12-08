package project1;
public class Palindrome{
	public static void main(String[] args)
	{
		int num = 2332,rev = 0,rem,anum = num;
		while(num!=0) {
			rem = num % 10 ;
			rev = rev * 10 + rem;
			num/=10;
		}
		if(anum == rev) {
			System.out.println(anum + "Number is palindrome");
		}
		else {
			   System.out.println(anum +"Number is not palindrome");
		}
	}
}



	
		

	


