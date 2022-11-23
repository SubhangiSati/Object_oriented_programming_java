package oopslab4;
//QUESTION 2
import java.util.Scanner;
public class Sqsum {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("ENTER ALL ELEMENT: ");
        for(int i = 0; i <10; i++)
        {
            a[i] = sc.nextInt();
            a[i]=a[i]*a[i];
            sum = sum + a[i];
            System.out.println("SQUARE OF NUMBERS: "+a[i]);

        }
        System.out.println("SUM: "+sum);
    }
    
}
