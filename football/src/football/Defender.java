package football;

public class Defender extends Player implements Salary {
	
	public Defender() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playerinfo() {
		// TODO Auto-generated method stub
		 System.out.println("\n\nPlayer id : "+getPlayerId()+ "\n Player name: "+getFname()+" " +getLname());
		 System.out.print(" position : Defender");	
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println(" Salary for defender of team "+getTeamId()+" gets 5000/-");
	} 
	
	
	
}
