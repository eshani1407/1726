package factorial;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i,fact=1, number=5; //number to calculate factorial    
		
		for(i=1;i<=number;i++){    
			fact=fact*i;    
		}    
		
		System.out.println("Factorial of "+number+" is: "+fact);
	}  
		
}
