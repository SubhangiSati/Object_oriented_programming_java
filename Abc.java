package lab;
class MyClass implements A{
    int a=100,b=300;
    public void meth1() {
        int c=a*b;
        System.out.println("The multiplication is "+c);    
    }
    public void meth2() {
        int d=a+b;
        System.out.println("The addition is "+d);
    }
}
public class Abc {
    public static void main(String args[]) {
        MyClass obj= new MyClass();
        obj.meth1();
        obj.meth2();
    }

}