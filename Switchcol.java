package project1;
import java.util.Scanner;

public class Switchcol {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Enter a number (1-4):");
		int number = Scanner.nextInt();
		switch (number) {
		case 1:
			System.out.println("Red");
			break;
		case 2:
			 System.out.println("orange");
			 break;
		case 3:
			 System.out.println("Green");
			 break;
		case 4:
			 System.out.println("Yellow");
			 break;
		default:
			System.out.println("Unknown color");
		}
	}
}	
		

	


