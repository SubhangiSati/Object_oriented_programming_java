package dcn_lab1;
import java.util.*;
import java.io.*;
class dcn_lab2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x="";
		dcn_lab2 ob=new dcn_lab2();
		System.out.println("Enter binary sequence:");
		x=br.readLine();
		System.out.println(x);
		System.out.println("Choose a polynomial for divisor:");
		System.out.println("1.CRC-8\n2.CRC-10\n3.ITU-16\n4.ITU-32\n5.Custom polynomial\n");
int cp=Integer.parseInt(br.readLine());
		switch(cp)
		{
		case 1:ob.findCRC(x,"100000111",8);
		break;
		case 2:ob.findCRC(x,"11000110101",11);
		break;
		case 3:ob.findCRC(x,"10001000000100001",16);
		break;
		case 4:ob.findCRC(x,"10000011100110000010001110110110111",32);
		break;
		case 5:System.out.println("Enter the degree of polynomial:");
		int deg=Integer.parseInt(br.readLine());
		StringBuffer polydeg=new StringBuffer(deg+1);
		for(int i=0;i<=deg;i++)
			polydeg.append('0');
		polydeg.setCharAt(deg, '1');
		System.out.println("Enter -999 to terminate input of powers for x\nEnter the powers of x in the polynomial:");
		int pwrs=Integer.parseInt(br.readLine());
		while(pwrs!=-999)
		{
		    pwrs=Integer.parseInt(br.readLine());
		}
		polydeg.reverse();
		String divi=polydeg.toString();
		ob.findCRC(x,divi,deg);
		}
	}
	public void findCRC(String seq,String divi,int deg)
	{
		String crc=seq;
		for(int i=0;i<deg;i++)
			crc=crc+"0";
		int len=divi.length();
		String xfind=crc.substring(0,deg+1);
		String remain="";
		while(len<crc.length())
		{

			StringBuffer polydeg;
			int pwrs=0;
			polydeg.setCharAt(pwrs, '1');
			if(xfind.charAt(0)=='1')
			{
				remain=XOR(xfind,divi,deg+1);
				xfind=remain+crc.charAt(len);	
			}
			else
				xfind=xfind.substring(1)+crc.charAt(len);
			len++;
			
		}
		System.out.println("CRC:"+seq+xfind.substring(1));
		
	}
	public String XOR(String seq,String divi,int len)
	{
String remain="";
		for(int i=0;i<len;i++)
		{
			if(seq.charAt(i)==divi.charAt(i))
				remain=remain+"0";
			else 
				remain=remain+"1";
		}
		
		return remain.substring(1);
	}
}