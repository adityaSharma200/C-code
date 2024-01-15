package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalCare extends Home{

	
	
	int nu;
	String Companyname;
	String Brandname;
	int pack;
	double price;
	Home h = new Home();
	
	Scanner s = new Scanner(System.in);
	
	PersonalCare()
	{
		
	}
	PersonalCare(int nu,String Brandname,String Companyname,int pack,double price)
	{
		this.nu =nu;
		this.Brandname = Brandname;
		this.Companyname =Companyname;
		this.pack = pack;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		
		  System.out.println("_____________________________");
		  System.out.println("                             ");
		  System.out.println(nu +".    "+Brandname+"   ");
		  System.out.println("_____________________________");
		  System.out.println("----------------------------");
		  System.out.println(" "+Companyname);
		  System.out.println(" Pack of  "+pack+" units");
		  System.out.println("₹ "+price);
		  System.out.println("----------------------------");

		return "";
	}
	
	static 
	{
		System.out.println("<--------------------------->");
		System.out.println("  ❤ Personal Care ❤  ");
		System.out.println("<--------------------------->");
	}

	public void display() {
		Scanner s = new Scanner(System.in);

		System.out.println("Chosse any One Option .");
		System.out.println("1. Skin Care");
		System.out.println("2. Hair Care");
		System.out.println("3. Baby and Mom Care");
		System.out.println("4. Oral Care");
		System.out.println("5. Go Back To Main Menu");
		

		int n = s.nextInt();

		switch (n) {
		case 1: {
			SkinCare sce= new SkinCare();
			sce.sc();
			break;
		}
		case 2: {
			HairCare h = new HairCare();
			h.hc();
			break;
		}
		case 3: {
			BabyandMom bm = new BabyandMom();
			bm.bm();
			break;
		}
		case 4: {
			OralCare oc = new OralCare();
			oc.oce();
			  break ;
		}
		
		case 5 :
		{
			Home h = new Home();
			h.home();
			break;
		}
		
		default: {
			System.err.println("Enter valid input .");
			display();
		}
		}
	}
	
	

}
