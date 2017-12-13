
/**
 * Write a description of class ScoreKeeper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScoreKeeper {

	private int gametotal; // only this class can access this information as it is private 
	private int roundtotal;
	
	public ScoreKeeper() {
		gametotal = roundtotal = 0; // default 
	}
	
	public void addToGameTotal() {
		gametotal += roundtotal; // adds the game total to the total to the round 
		resetRoundTotal();
	}
	
	public void addToRoundTotal(int value) {
		roundtotal += value; // ads the round total and valye 
	}

	public void resetGameTotal() {
		gametotal = 0; // sets the game total to 0 when the game restarts 
		resetRoundTotal();
	}

	public void resetRoundTotal() {
		roundtotal = 0; // default constructor of the reseted round total
	}

	public int getRoundTotal() {
		return roundtotal; // returns the round total 
	}

	public int getGameTotal() {
		return gametotal; // returns the game total 
	}
	
}