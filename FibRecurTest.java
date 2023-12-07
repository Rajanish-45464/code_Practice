package Fib_pack1;

public class FibRecurTest {

	static int a=0,b=1;
	public static void main(String[] args) {
		System.out.print("The Fibonacci Series is : ");
		System.out.print(a+" "+b+" ");
		FibRecurTest f=new FibRecurTest();
		f.fib(10);
		
	}
	public void fib(int n)
	{
		if (n >= 1) {
            int z=a+b;
            a=b;
            b=z;
            System.out.print(z+" ");
            fib(n-1);
        }
	}

}
