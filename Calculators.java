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
