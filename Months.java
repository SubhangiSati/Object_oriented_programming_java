package oopslab4;
import java.util.Scanner;
public class Months {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT MONTH FOR- ");  
        int x= sc.nextInt();  
        if(x==1)
            System.out.println("JANUARY");
        else if(x==2)
            System.out.println("FEBRUARY");
        else if(x==3)
            System.out.println("MARCH");
        else if(x==4)
            System.out.println("APRIL");
        else if(x==5)
            System.out.println("MAY");
        else if(x==6)
            System.out.println("JUNE");
        else if(x==7)
            System.out.println("JULY");
        else if(x==8)
            System.out.println("AUGUST");
        else if(x==9)
            System.out.println("SEPTEMBER");
        else if(x==10)
            System.out.println("OCTOBER");
        else if(x==11)
            System.out.println("NOVEMBER");
        else if(x==12)
            System.out.println("DECEMBER");
        else 
            System.out.println("INVALID INPUT");
    }
    
}
