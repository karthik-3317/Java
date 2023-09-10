package karthik;
import java.lang.Math;
public class Mytraingle 
{
public static int side1,side2,side3;

static void setSide1(int side) 
{
side1 = side;
}
static void setSide2(int side) 
{
side2 = side;
}
static void setSide3(int side) 
{
side3 = side;
}
static int getSide1() {
return side1;
}
static int getSide2() {
return side2;
}
static int getSide3() {
return side3;
}
public static boolean  isValid()
{
if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
{
return true;
}
return false;
}
public static double Area()
{
int s=(side1+side2+side3)/2;
return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}
public static void main(String[] args)
{
setSide1(50);
setSide2(40);
setSide3(20);
System.out.println(getSide1());
System.out.println(getSide2());
System.out.println(getSide3());
if(isValid())
{
System.out.println("input is valid \n"+ "area="+Area());
}
else
{
System.out.println("invalid");
}
}
}
