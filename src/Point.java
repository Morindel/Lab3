
public class Point {
	private double x;
	private double y;
	public Point(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public Point(Point p)
	{
		this.x = p.getX();
		this.y = p.getY();
	}
	public void setX(double x) {
		
		this.x = x;
	}
	public void setY(double y) {
		
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double distance(Point p)
	{
		final double d;
		d = Math.sqrt((p.getX() - this.getX()) *(p.getX() - this.getX()) + (p.getY() - this.getY()) *(p.getY() - this.getY())  );
		return d;
	}
	
	

}
