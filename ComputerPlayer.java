
/**
 * Write a description of class ComputerPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ComputerPlayer extends Player 
{

	public ComputerPlayer(String name, PairOfDice pod) {
		super(name, pod); // super class that the connects the information from the player to the computer player class 
		// also it is the computer player 
	}
	@Override
	public boolean rollAgain() { // if the computer get more than 20 for the round total then the computer folds its turn
		if(sk.getRoundTotal() < 20) {
			return true;
		}
		return false;
	}

}
