package lab8;
import java.io.*;
import java.util.*;
public class Q5_main
{
	public static void main(String args[])
	{
		String name;
		int age;
		System.out.println("-----ENTER EMPLOYEE DETAILS-----");
		System.out.println("ENTER NAME AND AGE :");
		Scanner in=new Scanner(System.in);

		try
		{
			if(!(in.nextLine().matches("[a-zA-Z]+")))
			{throw new IOException();}

			age=in.nextInt();
			if(age>50)
			{
				System.out.println("AGE GREATER THAN 50 EXCEPTION");
				throw new Exception();
			}

			Q5_main x=new Q5_main();
			System.out.println("-----OBJECT CREATED-----");
		}

		catch(Exception e)
		{
			System.out.println("EXCEPTION");
		}
	}
}