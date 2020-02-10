import java.util.Scanner;
class Calc
{
	public static void main(String[] arg)
	{
		double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextDouble();
		System.out.println("enter second number");
		b=sc.nextDouble();
		sc.close();
		sum(a,b);
		dif(a,b);
		mul(a,b);
		div(a,b);
		
	}
	public static void sum(double m,double n)
	{
		double s=0;
		s=m+n;
		System.out.println("Sum of two numbers is"+s);
	}
	public static void dif(double m,double n)
	{
		double s=0;
		s=m-n;
		System.out.println("Difference of two numbers is"+s);
	}
	public static void mul(double m,double n)
	{
		double s=0;
		s=m*n;
		System.out.println("Multiplication of two numbers is"+s);
	}
	public static void div(double m,double n)
	{
		double s=0;
		if(n!=0)
		{
		s=m/n;
		System.out.println("division of two numbers is"+s);
		}
		else
		System.out.println("cannot divide with zero");
	}
	
}