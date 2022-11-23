package lab8;

public class Zero
{
	public static void main(String ar[])
	{
		int n=0,m=10,r=0;
		try
		{
			r=m/n;
		}
		catch(ArithmeticException e)
		{
			System.out.println("DIVIDE BY ZERO ERROR ");
			System.out.println("VALUE OF ERROR HAS BEEN SET AS 1");
			r=1;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("RESULT :"+r);
	}
}