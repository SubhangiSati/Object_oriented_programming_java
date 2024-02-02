//LAB-4
//Q-2
import java.util.Scanner;
public class OOPLAB4 {
    public static void main(String[] args){
        int n=10, sum = 0;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        System.out.println("ENTER ALL ELEMENTS: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            a[i]=a[i]*a[i];
            sum = sum + a[i];
            System.out.println("SQUARE OF NUMBERS: "+a[i]);

        }
        System.out.println("SUM: "+sum);
    }
    
}
