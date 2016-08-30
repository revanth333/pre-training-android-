import java.lang.Math;
class Circle extends Shape{
private static double radius;
private final double pI = 3.142;
public  void setColors()
{
System.out.println("Color of circle is:"+ Circle.getColor());
}
public  void setRadius()
{
	radius = y.nextDouble();
}
private static double getRadius(){
	return radius;
} 
public void getArea()
{
	System.out.println("Area of circle " + (pI)*Math.pow(Circle.getRadius(),2));
}
public void getPerimeter()
{
	System.out.println("Perimeter of circle "+ (pI)*2*(Circle.getRadius()));
}
public static void main(String[] args)
{
Circle c = new Circle();
c.setColor();
c.setColors();
c.setRadius();
c.getArea();
c.getPerimeter();
}
}
