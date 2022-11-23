package lab;
class rectangle implements Ab
{
	public float compute(float p,float q)
	{return(p*q);}
}
class circle implements Ab
{
	public float compute(float p,float q)
	{return(pi*p*p);}
}
class Main
{
	public static void main(String args[])
	{
		rectangle rect=new rectangle();
		circle cr=new circle();
		Ab ar;
		ar=rect;
		System.out.println("Area of the rectangle= "+ar.compute(100,20));
		ar=cr;
		System.out.println("Area of the circle= "+ar.compute(10,200));
	}
}