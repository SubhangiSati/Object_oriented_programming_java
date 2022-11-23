package lab8;
class Student  {
	public String Name;
	public int Roll_No;
	public Student(){ }
	public Student(String N, int R)
	{         Name = N;         
			  Roll_No = R;
			  System.out.println("Name : "+Name+"     "+"Roll_no : "+Roll_No);
			  }     
	public void print(String P, int K)     
	{         Name = P;
			  Roll_No = K;         
			  System.out.println("Name : "+Name+"     "+"Roll_no : "+Roll_No);
			  }
	}
public class Exeption
{     public static void main(String[] args)
	  {         Student[] Stu;
	  			Stu = new Student[10];
	  			Stu[0] = new Student("SHUBI DUBI",1);
	  			Stu[1] = new Student("PINKU MINKU",2);
	  			Stu[3] = new Student("PURU",3);
	  			Stu[4] = new Student("CHOTU POTU",4);
	  			Stu[5] = new Student("SHAKSHI",5);
	  			Stu[6] = new Student("RISHIT",6);
	  			Stu[7] = new Student("MANASVI",7);
	  			Stu[8] = new Student("ARCHI",8);
	  			Stu[9] = new Student("HARI",9);
	  			try  {
	  				Stu[10] = new Student();
	  				Stu[10].print("RIYANSHI", 10);
	  				}
	  			catch (ArrayIndexOutOfBoundsException e)
	  			{            
	  				System.out.println("you are crossing the size limit of array!!" + e);
	  			}     
	  		 
	  }
}