package project1;

public class Election {

	public static void main(String[] args) {
		int age = 18;
		if(age>=16 && age<=18)
		{
			System.out.println("person is eligible for voting");
		}
		else if(age<=15)
		{
			System.out.println("person has no eligibility for voting");
		}
		else if(age>=18)
		{
			System.out.println("Not eligible for voting");
		}
	}		
}
