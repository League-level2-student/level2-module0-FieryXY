package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
		Robot[] robotArray = new Robot[5];
	//3. use a for loop to initialize the robots.
		int horizontalSpawnPos = 100;
		int horizontalIncrement = 100;
	for(int i = 0; i < robotArray.length; i++) {
		//4. make each robot start at the bottom of the screen, side by side, facing up
		robotArray[i] = new Robot();
		robotArray[i].setY(500);
		robotArray[i].setX(horizontalSpawnPos);
		robotArray[i].setSpeed(100000);
		robotArray[i].setWindowSize(10000, 10000);
		horizontalSpawnPos = horizontalSpawnPos + horizontalIncrement;
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean topReached = false;
	Robot winner = null;
	
	while(topReached == false) {
		Random random = new Random();
		for(int i = 0; i < robotArray.length; i++) {
			int randomDistance = random.nextInt(50);
			robotArray[i].move(randomDistance);
			robotArray[i].turn(10);
			if(robotArray[i].getY() <= 0) {
				winner = robotArray[i];
				topReached = true;
				break;
			}
		}
	}
	

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
		for(int i = 0; i <= 5; i++) {
			winner.turn(360);
		}
			
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track
		
	}
}
