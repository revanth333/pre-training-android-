import java.util.Scanner;
abstract class Shape{
public static String color;
public boolean filled;
Scanner y = new Scanner(System.in);
public abstract  void getArea();
public abstract void getPerimeter();
public  void setColor()
{
color =y.nextLine();
}
public static String getColor()
{
return color;
}
public boolean isFilled()
{
return filled;
}

public void setFilled(boolean filled)
{
filled = true;
}
}

