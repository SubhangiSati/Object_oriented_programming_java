package dcn_lab1;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.*;
import java.util.*;
public class Bit_stuffing {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("YOUR FILE NAME~ File.txt ");

        //File Creation

        System.out.println("ENTER NAME OF YOUR FILE~ ");
        String filename=sc.nextLine();
        File name = new File(filename);
        boolean value = name.createNewFile();
        if(value) {
            System.out.println("FILE SUCCESSFULLY CREATED!");
        }
        else {
            System.out.println("FILE ALREADY EXIST!!");
        }

        //entering some data

        System.out.println("ENTER DATA IN FILE~ ");
        String obj=sc.nextLine();

        Scanner sc1 = new Scanner(obj);
        while (sc1.hasNextLine()) {
            String sc2 = sc1.nextLine();
            StringBuilder str = new StringBuilder();
            for (char ch:sc2.toCharArray()) {
                int temp=ch;
                str.append(Integer.toBinaryString(temp));

            }
            System.out.println("YOUR DATA IN BITS LOOKS LIKE~  ");
            System.out.println(str);

            //BIT STUFFING

            int count =0;

            StringBuilder str1 = new StringBuilder();
            for (int i=0;i< str.length();i++)
            {

                if (str.charAt(i)=='1')
                {
                    count++;
                    str1.append(str.charAt(i));
                    if (count == 5)
                    {
                        str1.append("0");
                        count  =0;
                    }
                }
                else
                {
                    str1.append(str.charAt(i));
                    count =0;
                }
            }
            System.out.println("AFTER BITSTUFFING~ ");
            System.out.println(str1);

            //DE-STUFFING
            StringBuilder d = new StringBuilder();
            for (int i=0;i< str1.length();i++)
            {

                if (str1.charAt(i)=='1')
                {
                    count++;
                    d.append(str1.charAt(i));
                    if (count == 5)
                    {
                        count  =0;
                        i++;
                        continue;
                    }
                }
                else
                {
                    d.append(str1.charAt(i));
                    count =0;
                }

            }
            System.out.println("DESTUFFING COMPLETED");
            System.out.println(d);
// comparison
            if((d.toString().equals(str.toString())))
            {
                System.out.println("THE DATA SEND WAS CORRECT!!");
            }
            else {
                System.out.println("SOMETHING WENT WRONG TRY AGAIN!!");
            }
        }
        sc1.close();


    }
}



