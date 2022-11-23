package oopslab4;

import java.util.Scanner;
public class Combinations {
    public static void main(String[] args){
        System.out.println("THE DIGITS MUST LIE FROM 0-9");  
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST DIGIT- ");  
        int x= sc.nextInt(); 
        System.out.println("ENTER SECOND DIGIT- ");  
        int y= sc.nextInt(); 
        System.out.println("ENTER THIRD DIGIT- ");  
        int z= sc.nextInt(); 
        int lst[]={x,y,z};
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if(i!=j&j!=k&k!=i)
                        System.out.println("POSSIBLE COMBINATION: "+lst[i]+lst[j]+lst[k]);
                }
            }
        }
    }
}
