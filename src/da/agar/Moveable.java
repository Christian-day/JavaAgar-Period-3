package da.agar;
import java.awt.geom.Point2D;

public interface Moveable {
	
	/**
	 * Uses Point2D to determine the location of the object.
	 * @return an object indicating the location of this Moveable
	 */
	public Point2D getPoint();
	
	/**
	 * Sets the current location
	 * @param p
	 */
	public void setPoint( Point2D p );

	/**
	 * We probably need some other method here to force the object to move in its current direction.
	 */
}
