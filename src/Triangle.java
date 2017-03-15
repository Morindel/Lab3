
public class Triangle {

	private Point p1 , p2 ,p3 ;
	private double a, b, c;
	
	private void Set()
	{
		Check();
		a = p1.distance(p2);
		b = p1.distance(p3);
		c = p2.distance(p3);
		if (a+b <= c || a + c <= b || b + c <= a)
			throw new IllegalArgumentException("Punkty nie spelniaja warunku trojkata");
	}
	private void Check()
	{
		if ( p1.getX() == p2.getX() && p2.getX() == p3.getX() )
			throw new IllegalArgumentException("Nie mozna utworzyc trojkata z 3 punktow w tej samej lini X");
		if ( p1.getY() == p2.getY() && p2.getY() == p3.getY()  )
				throw new IllegalArgumentException("Nie mozna utworzyc trojkata z 3 punktow w tej samej lini Y");
	
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
	
	public Triangle(Point p1, Point p2, Point p3)
	{
		this.p1 = new Point(p1);
		this.p2 = new Point(p2);
		this.p3 = new Point(p3);
		Set();
		Figures.triangles.add(this);
		
	}
	public double Perimeter(){
		final double perimeter;
		perimeter = a + b +c ;
		return perimeter;
	}
	
	public Double Heron(){
		final Double area;
		area = (Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4);
		return area;
	}
	public double Height(Point p){
		final double height;
		
		
		if(p1.getX() == p.getX() && p1.getY() == p.getY())
			height =  ((2*this.Heron())/b);
		else if(p2.getX() == p.getX() && p2.getY() == p.getY())
			height =  ((2*this.Heron())/c);
		else if(p3.getX() == p.getX() && p3.getY() == p.getY())
			height =  ((2*this.Heron())/a);
		else 
			throw new IllegalArgumentException("Nie istnieje taki punkt w trojkacie");
		
		return height;	
	}
	@Override
	public String toString() {
		return "Triangle [p1=" + p1.getX() + " " + p1.getY() + ", p2=" + p2.getX() + " " +p2.getY()  + ", p3=" + p3.getX() + " " +p3.getY() + "]";
	}
	
}
