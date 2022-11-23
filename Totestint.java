package lab;
class Arithematic implements Test{
    public void square (){
      int a=20;
      a=a*a;
      System.out.println("THE SQUARE IS :"+a);
    }
}
public class Totestint{
  public static void main (String args[]){
      Arithematic x=new Arithematic();
      x.square();
  }
}