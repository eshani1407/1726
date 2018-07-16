import java.util.Scanner;
		
public class factno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Integer number, c, fact = 1;
		 
		System.out.println("Enter an integer of which factorial is to be calculated : ");
		Scanner in = new Scanner(System.in);
		 
		number = in.nextInt();
		 
		if (number < 0)
		{
			System.out.println("Number should be non-negative.");
		}
		else
		{
			for (c = 1; c <= number; c++)
			{
				fact = fact*c;
			}
		    System.out.println("Factorial of "+number+" is = "+fact);
		}
	}
}