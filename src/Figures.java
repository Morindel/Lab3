import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Figures {
	public static List <Triangle> triangles = new ArrayList<>();
	public static List <Quadrangle> quadrangles = new ArrayList<>();
	public static void main(String [] args)
	{
		Point p1 = new Point(0.0,  0.0);
		Point p2 = new Point(4.0,  0.0);
		Point p3 = new Point(4.0,  3.0);
		Point p4 = new Point(0.0, 5.0);
		Point p5 = new Point(10.0,20.0);
		
		Triangle t1 = new Triangle(p1, p2, p3);
		Triangle t2 = new Triangle(p2, p3, p4);
		Triangle t3 = new Triangle(p3, p4, p5);
		Triangle t4 = new Triangle(p1, p3, p5);
		
		
	
		Quadrangle q1 = new Quadrangle(p1, p2, p3, p4);
		Quadrangle q3 = new Quadrangle(p3, p4, p5, p1);
		Quadrangle q2 = new Quadrangle(p2, p3, p4, p5);
		
		
		Collections.sort(triangles ,(tr1,tr2) -> tr1.Heron().compareTo(tr2.Heron()));
		Collections.sort(quadrangles ,(qr1,qr2) -> qr1.Area().compareTo(qr2.Area()));
		
		
		triangles.forEach(triangle -> System.out.println(triangle.getClass().getName() + " pole : " +triangle.Heron()));
		System.out.println();
		quadrangles.forEach(quadrangle -> System.out.println(quadrangle.getClass().getName()+ " pole : " + quadrangle.Area()));
		
		System.out.println("Pole trojkata : " + t1.Heron());
		System.out.println("Obwod trojkata : " + t1.Perimeter());
		 	
		System.out.println("Pole czworokata : " + q1.Area());
		System.out.println("Obwod czworokata : " + q1.Perimeter());
		System.out.println("Przekatna czworokatna : " + q1.Diagonal(p1));
		System.out.println("Wysokosc z wierzcholka a : " + t1.Height(p1));
				
	}

}
