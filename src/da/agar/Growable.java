package da.agar;

public interface Growable {
	
	/**
	 * Display the current size of the object.  It is unclear what is meant by "size", so it is possible that 
	 * getSize() may return something other than an int
	 * @return The size of the object
	 */
	public int getSize();
	
	/**
	 * Set the size of the object.  It is unclear what is meant by "size", so it is possible that
	 * setSize() may take some object other than int as its parameter.
	 * @param size
	 */
	public void setSize( int size );

}
