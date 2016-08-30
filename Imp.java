import java.util.Scanner;
class Person
{
String name;
String address;
Scanner s=new Scanner(System.in);
void hi()
{
System.out.println("enter name");
name=s.nextLine();
System.out.println("enter address");
address=s.nextLine();
}
void det()
{
System.out.println("========================");
System.out.println("name:"+name);
System.out.println("address:"+address);
}
}

class Student extends Person
{
String program;
int year;
double fee;
void student1()
{
System.out.println("enter program name");
program=s.nextLine();
System.out.println("enter present year");
year=s.nextInt();
System.out.println("enter fees");
fee=s.nextDouble();
}
void det1()
{
System.out.println("program:"+program);
System.out.println("present year:"+year);
System.out.println("fees for program:"+fee);
System.out.println("========================");
}
}

class Staff extends Person
{
String school;
double pay;
void staff1()
{
System.out.println("enter school name");
school=s.nextLine();
System.out.println("enter how much money have to pay");
pay=s.nextDouble();
}
void det2()
{
System.out.println(" school name:"+school);
System.out.println("money have to pay:"+pay);
System.out.println("==========================");
}
}
class Imp
{
public static void main(String []args)
{
Student s1=new Student();
s1.hi();
s1.student1();
s1.det();
s1.det1();
Staff ss=new Staff();
ss.hi();
ss.staff1();
ss.det();
ss.det2();
}
}
