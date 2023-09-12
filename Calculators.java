import java.util.Scanner;
interface Calculators
{
int sum(int a, int b);
}
class SubClass implements Calculators 
{

	public int sum(int a, int b) 
    {
		return a + b;
	}
}
class RunCalculators
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of a");
int a=s.nextInt();
System.out.println("Enter the value of b");
int b=s.nextInt();
SubClass  sb=new SubClass();
int sum=sb.sum(a,b);
System.out.println(sum);
s.close();
}
}
