package da.agar;

public interface Consumable {
<<<<<<< HEAD
||||||| merged common ancestors
	public int getPoints();
=======
	/**
	 * 
	 * @return the number of points this Consumable is worth.  Does NOT consume the object
	 */
	public int getPoints();
>>>>>>> 582e13f249c0465465fb346f6545a0c73ae4ddac
	
<<<<<<< HEAD
	public int getPoints();
	public int eat();
||||||| merged common ancestors
	public int Consume();
=======
	/**
	 * consume the object.  When a food object is consumed it should no longer display on the Game Board.  The number
	 * of points is awarded to the object that ate the food.
	 * @return the number of points the consumed object is worth
	 */
	public int Consume();
>>>>>>> 582e13f249c0465465fb346f6545a0c73ae4ddac
	
|
}
