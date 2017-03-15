
public class Quadrangle {
	
	private double a, b, c, d;
	
	
	private Point p1 , p2 , p3, p4;
	
	private void Check()
	{
		if((this.p1.getX() == this.p2.getX() && this.p1.getX() == this.p3.getX() ) || 
			(this.p1.getX() == this.p3.getX() && this.p1.getX() == this.p4.getX() ) ||
			(this.p2.getX() == this.p3.getX() && this.p2.getX() == this.p4.getX() ) )
			throw new IllegalArgumentException("Nie mozna utworzyc czworokata z 3 punktow X w tej samej lini");
		
		if((this.p1.getY() == this.p2.getY() && this.p1.getY() == this.p3.getY() ) || 
				(this.p1.getY() == this.p3.getY() && this.p1.getY() == this.p4.getY() ) ||
				(this.p2.getY() == this.p3.getY() && this.p2.getY() == this.p4.getY() ) )
			throw new IllegalArgumentException("Nie mozna utworzyc czworokata z 3 punktow Y w tej samej lini");
	}
	private void Set()
	{
		Check();
		this.a = p1.distance(p2);
		this.b = p2.distance(p3);
		this.c = p3.distance(p4);
		this.d = p4.distance(p1);
	}
	
	public void setP1(double x, double y)
	{
		p1.setX(x);
		p1.setY(y);
		Set();
	}
	public void setP1(Point p)
	{
		p1.setX(p.getX());
		p1.setY(p.getY());
		Set();
	}
	
	public void setP2(double x, double y)
	{
		p2.setX(x);
		p2.setY(y);
		Set();
		
	}
	public void setP2(Point p)
	{
		p1.setX(p.getX());
		p1.setY(p.getY());
		Set();
	}
	
	public void setP3(double x, double y)
	{
		p3.setX(x);
		p3.setY(y);
		Set();
	}
	public void setP3(Point p)
	{
		p1.setX(p.getX());
		p1.setY(p.getY());
		Set();
	}
	
	public void setP4(double x, double y)
	{
		p4.setX(x);
		p4.setY(y);
		Set();
	}
	public void setP4(Point p)
	{
		p1.setX(p.getX());
		p1.setY(p.getY());
		Set();
	}
	
	public Quadrangle(Point p1, Point p2, Point p3, Point p4)
	{

		this.p1 = new Point(p1);
		this.p2 = new Point(p2);
		this.p3 = new Point(p3);
		this.p4 = new Point(p4);
		Set();
		Figures.quadrangles.add(this);
		
	}
	
	public double Perimeter()
	{
		final double perimeter;
		perimeter = a + b + c + d;
		return perimeter;
	}
	
	public double Diagonal(Point p)
	{
		final double diagonal;
		if( (p1.getX() == p.getX() && p1.getY() == p.getY() ) || (p3.getX() == p.getX() && p3.getY() == p.getY() ))
			diagonal = p1.distance(p3);
		else if( (p2.getX() == p.getX() && p2.getY() == p.getY() ) || (p4.getX() == p.getX() && p4.getY() == p.getY() ))
			diagonal = p2.distance(p4);
		else
			throw new IllegalArgumentException("Nie istnieje taki punkt");
		
		return diagonal;
		
	}
	public Double Area()
	{
		final Double area;
		double h1 = (a+b+this.Diagonal(p1))/2;
		double h2 = (c+d+this.Diagonal(p1))/2;
		area = Math.sqrt(h1 * (h1 - a) * (h1 - b) * (h1-this.Diagonal(p1))) + Math.sqrt(h2 * (h2 - c) * (h2 - d) * (h2-this.Diagonal(p1)));
		return area;
		
	}
	
	@Override
	public String toString() {
		return "Quadrangle [p1=" + p1.getX() + " " + p1.getY() + ", p2=" + p2.getX() + " " + p2.getY() + ", p3=" + p3.getX() + " " + p3.getY()  + ", p4=" + p4.getX() + " " + p4.getY() + "]";
	}
	

}
