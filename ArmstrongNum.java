package project1;

public class ArmstrongNum {

	public static void main(String[] args) {
		int n =370,anum,rem, rev = 0;
		anum = n;
		while(anum!=0)
		{
			rem = anum % 10;
			rev += Math.pow(rem,3);
			anum /= 10;
		}
		if(rev == n)
			System.out.println(n+ " is Armstrong number");
		else
			System.out.println(n+ "is not Armstrong number");
	}
}	
		
			
			
		

	

