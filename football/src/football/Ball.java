package football;

public class Ball extends Game{
		//declaration of the variables
			private Integer bSize;
			private Integer bPressure;
			private String bColor;
			
			
			//default constructor
			public Ball() {
				bSize = 0;
				bPressure = 0;
				bColor = "";
			}
			
			//constructor with parameters
			public Ball(Integer bSize, Integer bPressure, String bColor) {
				this.bSize = bSize;
				this.bPressure = bPressure;
				this.bColor = bColor;
			}
						
			//getter and setter for ballSize
			public Integer getbSize() {
				return bSize;
			}
			public void setbSize(Integer bSize) {
				this.bSize = bSize;
			}
			
			//getter and setter for ballPressure
			public Integer getbPressure() {
				return bPressure;
			}
			public void setbPressure(Integer bPressure) {
				this.bPressure = bPressure;
			}
			
			//getter and setter for ballColor
			public String getbColor() {
				return bColor;
			}
			public void setbColor(String c) {
				this.bColor = c;
			}

			@Override
			public void calculateballpresure() {
				// TODO Auto-generated method stub
				System.out.println(" Presure of the ball is "+getbPressure());
			}

			@Override
			public void getGameDetails() {
				// TODO Auto-generated method stub
				System.out.println("Game id: "+ getGameId()+"\n ground id: "+getGroundId());
			}
			
			
	}
