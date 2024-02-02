class Worker
{
	String name;
	double salaryrate;
	Worker(String name, double salaryrate)
	{
		this.name=name;
		this.salaryrate=salaryrate;
	}
}
class Salariedworker extends Worker
{
	int hours;
	Salariedworker(String name,double salaryrate, int hours)
	{
		super(name, salaryrate);
		this.hours=hours;
	}
	double ComPay()
	{
		double salary= 50*salaryrate;
		return salary;
	}
}
class Dailyworker extends Worker
{
	int days;
	Dailyworker(String name,double salaryrate, int days)
	{
		super(name, salaryrate);
		this.days=days;
	}
	double ComPay()
	{
		double salary= 50*salaryrate;
		return salary;
	}
}

class Newsalary
{
	public static void main(String args[])
	{
		Salariedworker sw= new Salariedworker("Shayam",20.0,40);
		Dailyworker dw= new Dailyworker("Ram",50.0,30);
		double sal= sw.ComPay();
		System.out.println("SALARY OF SALARIED WORKER IS:"+ sal);
		double saly= dw.ComPay();
		System.out.println("SALARY OF DAILY WORKER IS:"+ saly);
	}
}

