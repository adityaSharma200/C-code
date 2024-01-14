package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class VitaminsSupplements extends Home{
	int nu;
	String Companyname;
	String Brandname;
	int pack;
	double price;
	Home h = new Home();
	
	Scanner s = new Scanner(System.in);
	
	VitaminsSupplements()
	{
		
	}
	VitaminsSupplements(int nu,String Brandname,String Companyname,int pack,double price)
	{
		this.nu =nu;
		this.Brandname = Brandname;
		this.Companyname =Companyname;
		this.pack = pack;
		this.price = price;
	}
	
	
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
		System.out.println("  ❤ Vitamins & Supplements ❤  ");
		System.out.println("<--------------------------->");
	}
	
	
	
	public void display()
	{
		System.out.println("_____________________________");
		System.out.println("Chosse any One Option .");
		System.out.println("_____________________________");
		System.out.println("1. Multivitamins, Multiminerals and Antioxidants");
		System.out.println("2. Calcium & Minerals");
		System.out.println("3. Vitamin A to Z");
		System.out.println("4. Protein Supplements");
		System.out.println("5. Go Back To Home Page");
		System.out.println("<--------------------------->");
	

		int n = s.nextInt();

		switch (n) {
		case 1: {
			MMA	m = new MMA();
			m.mma();
			break;
		}
		case 2: {
			CalciumMin c= new CalciumMin();
			c.cal();
			break;
		}
		case 3: {
			VitaminAtoZ v= new VitaminAtoZ();
			v.vita();
			break;
		}
		case 4 :
		{    ProteinSup p = new ProteinSup();
			p.pS();
			break;
		}
		case 5: {
			
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
