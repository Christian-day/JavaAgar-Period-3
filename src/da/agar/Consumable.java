package da.agar;

public interface Consumable {
	/**
	 * 
	 * @return the number of points this Consumable is worth.  Does NOT consume the object
	 */
	public int getPoints();
	
	/**
	 * consume the object.  When a food object is consumed it should no longer display on the Game Board.  The number
	 * of points is awarded to the object that ate the food.
	 * @return the number of points the consumed object is worth
	 */
	public int Consume();
	
}
