package application;

import pojo.Ball;
import pojo.Game;
import pojo.Ground;
import pojo.Player;
import pojo.Referee;
import pojo.Score;
import pojo.Team;


public class MainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ball Ball = new Ball();
		Game Game = new Game(3, "10/07/19", "5pm", 8);
		Ground Ground = new Ground();
		Player Captain = new Player();
		Referee Referee = new Referee();
		Score Score = new Score();
		Team Team = new Team();
			
		Ball.setbPressure(4);	
		if(Ball.getbPressure() >= 0) {
			System.out.println("Please keep enough pressure in the ball.....");
		}else {
			System.out.println("Greate");
		}
		
		
		System.out.println("The game is on "+Game.getGaDate());
		
		
		Captain.setAge(20);
		System.out.println("Captains Age is "+ Captain.getAge());
		
	}

}
