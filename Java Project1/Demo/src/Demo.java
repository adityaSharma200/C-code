import java.util.Scanner;

class Demo extends Exception
{
	
	public static void div()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = s.nextInt();
		System.out.println("Enter number 2");
		int b = s.nextInt();
		int c = a/b ;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		
		try {
	     div();
		}
		catch(ArithmeticException e)
		{
			System.out.println("zero can not divide number . please put valid number ");
			div();
		}
	}
	}
