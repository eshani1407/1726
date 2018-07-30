package football;

public class ApplicationMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ball o1 = new Ball();
		Defender o2 = new Defender();
		Referee o3 = new Referee(77, "Agnel", "Brane", "14/11/90", "3/5/11","Bped","64545415");
		
		o1.setbSize(22);
		o1.setbColor(null);
		o1.setbPressure(23);
		
		o1.setGameId(001);
		o1.setGroundId(2);
		
		
		o1.getGameDetails();
		o1.calculateballpresure();
		
		o2.setPlayerId(102);
		o2.setFname("Rahul");
		o2.setLname("SD");
				
		o2.playerinfo();
		o2.calculateSalary();
		
		o3.rafInfo();
		o3.calculateSalary();
		
		
	}

}
