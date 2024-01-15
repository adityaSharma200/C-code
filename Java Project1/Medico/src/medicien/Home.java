package medicien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//here we can implements Payments interface  
public class Home implements Payment{
	
	
	//here we declare static variable which is use to store total transaction perform in whole program
    static double Price;
	static List list = new ArrayList();
	static int n;
	
	
	//this method is Override from Payment interface
	@Override
	 public void printde(String name,String company,int unit,double price)
	{
		  System.out.println("_____________________________");
		  System.out.println("                             ");
		  System.out.println("    "+name+"   ");
		  System.out.println("_____________________________");
		  System.out.println("----------------------------");
		  System.out.println(" "+company);
		  System.out.println(" Pack of  "+unit+" units");
		  System.out.println("₹ "+price);
		  System.out.println("----------------------------");
		  
	}
	
	//this method is Override from Payment interface
	//this method is used to remove those which product don't want.
	@Override
	public void remove(int n)
	{
		list.remove(n-1);
		System.out.println("Remove Successful.");
	}
	
			
			public void home()
			{
				try {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("================================");
				System.out.println("        Select Categories        ");
				System.out.println("================================");
				System.out.println("1.Medicines.");
				System.out.println("2.Personal Care.");
				System.out.println("3.Health Conditions.");
				System.out.println("4.Vitamins & Supplements .");
				System.out.println("5.Diabetes Care.");
				System.out.println("6.Healthcare Devices.");
				System.out.println("7.For exit.");
				System.out.println("================================");
				int option = sc.nextInt();
				
				switch(option)
				{
				
				case 1:
				{
					Medicines m1 = new Medicines();
					m1.display();
					
					break;
				}
				
				case 2:
				{
					PersonalCare pc = new PersonalCare();
					pc.display();
					break;
				}
				
				case 3:
				{
					HealthConditions hc = new HealthConditions() ;
					hc.display();
					break;
				}
				
				case 4:
				{
					VitaminsSupplements v = new VitaminsSupplements();
					v.display();
					break;
				}
				
				case 5:
				{
					DiabetesCare d = new DiabetesCare();
					d.display();
					
					break;
				}
				
				case 6:
				{
					HealthcareDevices hd = new HealthcareDevices();
					hd.display();
					break;
				}
				
			
				case 7 :
				{
					System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
					System.out.println("------❤️❤️ Thank You 💖💖--------");
					System.out.println("(●'◡'●)   Vist Again.    (●'◡'●) ");
					System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
					System.exit(0);
				}
				
				default : 
				{
					System.err.println("Enter valid Input .");
					home();
				}
				
				sc.close();
				
				}
				}catch(Exception e)
				{
					System.err.println("Enter only single digit Number for Input.");
					home();
				}
				
	
          }

			

			
			
	
}
