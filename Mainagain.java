package lab;

class calc implements xyz
{
	String name;
	int div,mod;
	public void name(String string)
	{ 
		name=string; 
	}
	public void division(int a)
	{ 
		div=a; 
	}
	public void modules(int b)
	{ 
		mod=b; 
	}
	public void disp()
	{
		System.out.println("Name :"+name);
		System.out.println("Division :"+div);
		System.out.println("Modules :"+mod);
	}
}
public class Mainagain
{
	public static void main(String args[])
	{ 
		xyz m=new calc();
		m.name("Purvika");
		m.division(50);
		m.modules(15);
		m.disp();
	}
}