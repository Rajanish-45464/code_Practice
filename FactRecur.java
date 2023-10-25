package RecursionPackage;

public class FactRecur {
	public static void main(String[] args) {
		FactRecur f=new FactRecur();
		int fact=4;
		//int a=f.Factorial(fact);
		System.out.println("Factorial is : "+f.Factorial(fact));		
	}
	int Factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*Factorial(n-1));
		}		
	}
}
