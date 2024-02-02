package dcn_lab1;  
import java.util.*;  
public class HammingCode {  
 public static void main(String args[])   
 {    
     int size, hammingCodeSize, errorPosition,arr[],hammingCode[];       
     Scanner sc = new Scanner(System.in);  
     System.out.println("enter data size (in bits)=");  
     size = sc.nextInt();    
     arr = new int[size]; 
     for(int j = 0 ; j < size ; j++) {  // INPUT DATA 
         System.out.println("Enter " + (size - j) + "-bit of the data="); 
         arr[size - j - 1] = sc.nextInt();  
     }   
     hammingCode = getHammingCode(arr);  // store return value to the hammingCode array  
     hammingCodeSize = hammingCode.length; 
     System.out.println("the entered data is=");  
     for(int i = 0 ; i < hammingCodeSize; i++) {  
         System.out.print(hammingCode[(hammingCodeSize - i - 1)]);  
     } 
     System.out.println("enter the position you want to generate error in(if not 0)= ");  
     errorPosition = sc.nextInt();  
     sc.close();     
     if(errorPosition != 0) { 
         // alter bit of the user entered position  
         hammingCode[errorPosition - 1] = (hammingCode[errorPosition - 1] + 1) % 2;  
     }  
     System.out.println("the sender data= ");  
     for(int k = 0; k < hammingCodeSize; k++) {  
         System.out.print(hammingCode[hammingCodeSize - k - 1]);  
     }  
     System.out.println();   // for next line  
     receiveData(hammingCode, hammingCodeSize - arr.length);  
 }   
 static int[] getHammingCode(int data[]) {   
     int returnData[],size,i = 0, parityBits = 0 ,j = 0, k = 0;  
     size = data.length;  
     while(i < size) {  
         // 2 power of parity bits = current position(number of bits traversed + number of parity bits + 1).  
         if(Math.pow(2, parityBits) == (i + parityBits + 1)) {  
             parityBits++;  
         }  
         else {  
             i++;  
         }  
     }    
     returnData = new int[size + parityBits];    
     // initialize returnData array with '2'    
     for(i = 1; i <= returnData.length; i++) {  // condition to find parity bit location  
         if(Math.pow(2, j) == i) {  
           
             returnData[(i - 1)] = 2;  
             j++;  
         }  
         else {  
             returnData[(k + j)] = data[k++];  //for odd position
         }  
     }    
     for(i = 0; i < parityBits; i++) {// use for loop to set even parity bits at parity bit locations
       
         returnData[((int) Math.pow(2, i)) - 1] = getParityBit(returnData, i);  
     }  
       
     return returnData;  
 }  
 static int getParityBit(int returnData[], int pow) { //return parity bit based on the power  
     int parityBit = 0;  
     int size = returnData.length;    
     for(int i = 0; i < size; i++) {              
         if(returnData[i] != 2) {            
        	 int k = (i + 1); 
             String str = Integer.toBinaryString(k);             
             //Now bit at the 2^(power) location of the binary value of index is 1,   
             // we check the value stored at that location. If the value is 1 or 0,   
             // we will calculate the parity value.  
             int temp = ((Integer.parseInt(str)) / ((int) Math.pow(10, pow))) % 10;  
             if(temp == 1) {  
                 if(returnData[i] == 1) {  
                     parityBit = (parityBit + 1) % 2;  
                 }  
             }  
         }  
     }  
     return parityBit;  
 }  
 static void receiveData(int data[], int parityBits) { //Detect error
     int pow;  
     int size = data.length;       
     int parityArray[] = new int[parityBits];  
     String errorLoc = new String(); // for storing the integer value of the error location 
     for(pow = 0; pow < parityBits; pow++) {  
         for(int i = 0; i < size; i++) {  //used for 2^power position
             int j = i + 1;  
             String str = Integer.toBinaryString(j);  
             int bit = ((Integer.parseInt(str)) / ((int) Math.pow(10, pow))) % 10; //find bit  
             if(bit == 1) {  
                 if(data[i] == 1) {  
                     parityArray[pow] = (parityArray[pow] + 1) % 2;  
                 }  
             }  
         }  
         errorLoc = parityArray[pow] + errorLoc;  
     }  
     int finalLoc = Integer.parseInt(errorLoc, 2);  
     // check whether the finalLoc value is 0 or not  
     if(finalLoc != 0) {  
         System.out.println("error at location= " + finalLoc);  
         data[finalLoc - 1] = (data[finalLoc - 1] + 1) % 2;  
         System.out.println("After correcting the error, the code is:");  
         for(int i = 0; i < size; i++) {  
             System.out.print(data[size - i - 1]);  
         } 
     }  
     else {  
         System.out.println("no error!!");  
     }   
 }  
}