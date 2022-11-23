package lab7;
class rectangle implements area
{
	public float calc(float x,float y)
	{
		return(x*y);
	}
}
class circle implements area
{
	public float calc(float x,float y)
	{
		return(float)(pi*x*x);
	}
}
public class Main
{
	public static void main(String args[])
	{
		rectangle rect=new rectangle();
		circle cr=new circle();
		area ar;
		ar=rect;
		System.out.println("Area of the rectangle= "+ar.calc(20,40));
		ar=cr;
		System.out.println("Area of the circle= "+ar.calc(20,10));
	}
}
