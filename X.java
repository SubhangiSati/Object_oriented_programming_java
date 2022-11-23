package lab7;
class MyClass implements A{
	int x=10,y=20;
	public void meth1() {
		int p=x+y;
		System.out.println("THE SUM IS "+p);	
	}
	public void meth2() {
		int z=x-y;
		System.out.println("THE VALUE AFTER SUB "+z);
	}
}
public class X {
	public static void main(String args[]) {
		MyClass obj= new MyClass();
		obj.meth1();
		obj.meth2();
	}

}

