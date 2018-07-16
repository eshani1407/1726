import java.util.Scanner;

public class factRecorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer n, mul;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer:");
	        n = s.nextInt();
	        
	        factRecorv obj = new factRecorv();
	        mul = obj.fact(n);
	        System.out.println("Factorial of "+n+" :"+mul);
	    }
	
		Integer fact(Integer x)
	    {
	        if(x > 1)
	        {
	            return(x * fact(x - 1));
	        }
	        return 1;
	}

}
