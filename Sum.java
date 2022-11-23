package oopslab4; 
public class Sum {
	public static void main(String args[]) {
		int sum=0;
		for(int i=40;i<=250;i++) {
			if(i%5==0) 
				sum=sum+i;	
		}
		System.out.println("THE SUM OF NUMBERS FROM 40 TO 250 SIVISUBLE BY 5 IS= "+sum);
		}
}
