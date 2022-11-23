package lab8;
import java.util.*;
class Q3_main
{
	public static void main(String args[])
	{
		int i,j;
		float add,sub,mul,div;
		System.out.println("CALCULATOR:");
		System.out.println("Enter two Operands:");
		Scanner in=new Scanner(System.in);
		try
		{
			i=in.nextInt();
			j=in.nextInt();
			add=i+j;
			sub=i-j;
			mul=i*j;
			div=i/j;
			System.out.println("Addition ="+add);
			System.out.println("Subtraction ="+sub);
			System.out.println("Multiplication ="+mul);
			System.out.println("Division ="+div);
		}

		catch(InputMismatchException e)
		{
			System.out.println("Program Is Terminated Exception Caught");
		}

	}
}
