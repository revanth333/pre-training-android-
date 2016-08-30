class Rectangle extends Shape{
public static double Width;
private static double Length;
public  void setColors()
{
System.out.println("Color of Rectangle is:"+ Circle.getColor());
}
public  void setWidth()
{
Width = y.nextDouble();
}
public static double getWidth()
{
return Width;
}
public void setLength()
{
Length = y.nextDouble();
}
public static double getLength()
{
return Length;
}
public void getArea()
{
System.out.println("Area of rectangle :" + (Rectangle.getWidth())*(Rectangle.getLength()));
}
public void getPerimeter()
{
	System.out.println("Perimeter of rectangle:"+ (2*((Rectangle.getWidth())+(Rectangle.getLength()))));
}
public static void main(String[] args)
{
	Rectangle r = new Rectangle();
r.setColor();
r.setColors();
r.setWidth();
r.setLength();
r.getArea();
r.getPerimeter();
}
}
