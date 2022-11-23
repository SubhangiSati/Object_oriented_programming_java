package lab8;
import java.util.Scanner;
public class Q4_main {
		static String x;
		static String y;
		static void comp(String x, String y) throws Exception 
		{
			int a = Integer.parseInt(x);
			int b = Integer.parseInt(y);
			System.out.println("Addition is: " + (a + b));
			System.out.println("Subtration is " + (a - b));
		}
		public static void main(String[] args) 
		{
			Scanner ts = new Scanner(System.in);
			System.out.println("First Character:");
			x = ts.nextLine();
			System.out.println("Second Character:");
			y = ts.nextLine();
			ts.close();
			try {
				comp(x, y);
			}
			catch (Exception e) {
				System.out.println("Alphanumeric values are not allowed.");
				
			}
	}
}