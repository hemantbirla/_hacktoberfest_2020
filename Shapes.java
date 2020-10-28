package assignment4;
import java.lang.Math;
abstract class Shape2d
{
    String type;	
	abstract double area();
	abstract double perimeter();
	
}
class Circle extends Shape2d
{ double carea,cperi,r;
   Circle(double c)
   {
	   r=c;
   }
	double area()
	{
		carea=3.14*r*r;
		return carea;
	}
	 double perimeter()
	{
		 cperi=2*3.14*r;
		return cperi;
	}
	void print()
	{
		System.out.println("area of "+type+" : "+carea);
		System.out.println("perimeter of "+type+" : "+cperi);
	}
	
}
class Triangle extends Shape2d
{double tarea,tperi,b,p,h;

Triangle(double d,double e)
{
	b=d;
	h=e;
}
	double  area()
	{
		tarea =(b*h)/2;
	  return tarea;
	}
	double perimeter()
	{
		p=Math.sqrt((b*b)+(h*h));
		tperi=b+h+p;
		return tperi;
	}
	void print()
	{
		System.out.println("area of "+type+":"+tarea);
		System.out.println("perimeter of "+type+" : "+tperi);
	}
	
}

public class Shapes {



	public static void main(String[] args) {
		
Circle s = new Circle(7.0);
Triangle t = new Triangle(12.0,5.0);
s.type = "circle";

s.area();
s.perimeter();
s.print();
t.type="triangle";
t.area();
t.perimeter();
t.print();
	}

}

