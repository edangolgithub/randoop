public class Vector {

	//origin of the vector
	public Point origin;
	//degree measurement for the vector, referenced from the x-axis (0 degrees).
	public int degrees;

	public Point getOrigin() {
		return origin;
	}


	public void setOrigin(Point origin) {
		if(origin==null)
		{
			origin=new Point(0, 0);
		}
		this.origin = origin;
	}


	public int getDegrees() {
		return degrees;
	}


	public void setDegrees(int degrees) {
		this.degrees = degrees;
	}


	/**
	 * Constructor for the Vector
	 * @param origin origin of vector
	 * @param degrees degree measurement; will be converted to be between 0 & 360
	 */
	public Vector(Point origin, Integer degrees) 
	{
		if (origin != null)
		{
			origin = new Point(origin.x,origin.y);
		}
		else
		{
			origin= new Point(0,0);
		}
		if (degrees < 0)
		{
			while(degrees < 0)
			{
				degrees = degrees + 360;
			}
		}
		else if (degrees >= 360)
		{
			while(degrees >= 360)
			{	
				degrees = degrees - 360;
			}
		}
		this.degrees = degrees;	
		this.origin=origin;
	}


	@Override
	/**
	 * Checks if two Vectors are equal - origins and degrees are the same
	 * @return true if everything is equivalent; a null origin is considered equivalent to another null   
	 */

	public boolean equals(Object o) {
		if (o == null) return false;
		if (! (o instanceof Vector) ) return false;
		Vector that = (Vector) o;

		if(this.origin == null || that.origin == null) 
			return this.origin == null && that.origin == null && this.degrees == that.degrees;
		else
			return this.origin.equals(that.origin) && this.degrees == that.degrees;
	}



	@Override
	/**
	 * Creates a unique hashcode for the Vector object - identical Vector should have the same hashcode
	 * @return int hashcode 
	 */
	public int hashCode() {
		final int prime = 7;
		int result = 1;
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + degrees;
		return result;	
	}
}
