package lab7;
interface Test{
	public final static int x=10;
	default void square(){
	}
}
class Arithmetic implements Test{
	public void square() {
		int x=10;
		x=x*x;
		System.out.println("The sq is:"+x);
	}
}
public class ToTestInt {
	public static void main(String args[]) {
		Arithmetic a= new Arithmetic();
		a.square();
	}

}
