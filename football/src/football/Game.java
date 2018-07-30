package football;

public abstract class Game {
	//declaration of the variables
			private Integer gameId;
			private String gaDate;
			private String gaTime;
			private Integer groundId;
			
			//default constructor
			public Game() {
				super();
				gameId = 0;
				gaDate = "";
				gaTime = "";
				groundId = 0;
			}
			
			//constructor with parameters
			public Game(Integer gameId, String gaDate, String gaTime, Integer groundId) {
				super();
				this.gameId = gameId;
				this.gaDate = gaDate;
				this.gaTime = gaTime;
				this.groundId = groundId;
			}
			
			public Integer getGameId() {
				return gameId;
			}
			public void setGameId(Integer gameId) {
				this.gameId = gameId;
			}
			public String getGaDate() {
				return gaDate;
			}
			public void setGaDate(String gaDate) {
				this.gaDate = gaDate;
			}
			public String getGaTime() {
				return gaTime;
			}
			public void setGaTime(String gaTime) {
				this.gaTime = gaTime;
			}
			public Integer getGroundId() {
				return groundId;
			}
			public void setGroundId(Integer groundId) {
				this.groundId = groundId;
			}
			
			
			
			public abstract void calculateballpresure();
			public abstract void getGameDetails();

}
