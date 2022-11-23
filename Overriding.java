package lab7;
class P implements Maths{
	float x=1000;
	float y=10;
	float z;
	float  a;
	public void division() {
		z=x/y;
	}
	public void modules() {
		a=x%y;
	}
}
class Q extends P{
	public void division() {
		System.out.println("THE DIVISION IS "+x/y);
	}
	public void modules() {
		System.out.println("THE MODULES IS "+x%y);
	}
	
}
public class Overriding {
	public static void main(String args[])
	{
		Q o=new Q();
		o.division();
		o.modules();
	}
}


