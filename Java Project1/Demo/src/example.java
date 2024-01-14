import java.util.ArrayList;
import java.util.Scanner;

public class example {
	static Scanner sc = new Scanner(System.in);
	public static void add()
	{
		
		System.out.println("1");
		System.out.println("Go back");
		int opt = sc.nextInt(); 
		switch (opt) {
		case 1: {
			add();
			break;
		}
		default:
			
		}
		
		
	}
	
	public static void add1()
	{
		System.out.println("2");
		System.out.println("Go back");
	int opt = sc.nextInt(); 
	switch (opt) {
	case 1: {
		add1();
		break;
	}
	default:
		
	}}
	public void add2()
	{}
	public void add3()
	{}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		int opt = sc.nextInt(); 
		
		
		
		switch (opt) {
		case 1 : {
			
			add();
			break;
		}
		case 2 : {
			
			add1();
			break;
		}
		default:
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
