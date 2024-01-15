package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class StomachCare extends HealthConditions{
	ArrayList sC = new ArrayList();

	StomachCare(){}
	
	StomachCare(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void sc() {
		
		sC.add("1.  Baidyanath Gokshuradi Guggulu Tablet 80      ₹:- 180.50");
		sC.add("2.  Abbott Gripe Water 150 ML      ₹:- 55.20");
		
		
		StomachCare bj1= new StomachCare(1,"Baidyanath Gokshuradi Guggulu Tablet 80","Baidyanath Ayurved Bhavan",80, 180.50);
		StomachCare bj2= new StomachCare(2,"Abbott Gripe Water 150 ML","Abbott Healthcare Pvt. Ltd",150,55.20);
		
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		
		System.out.println(sC.get(0));
		System.out.println(sC.get(1));
		
		
		System.out.println("Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println();
			or1(180.50,0);
			break;
		}
		case 2: {
			System.out.println();or1(55.20,1);
			break;
		}
		
		case 11: {
			VitaminsSupplements v = new VitaminsSupplements();
			v.display();
			break;
		}
		default:
		{
			sc();
		}
			
		}
		
	}
	
	public void or1(double p,int n)
	{
		System.out.println("Do You Want Order ");
		System.out.println("Press Y for Yes .");
		System.out.println("Press N for No .");
		
		Scanner sc = new Scanner(System.in);
		char opt1 = sc.next().charAt(0);
		
		if(opt1 == 'Y' || opt1 == 'y')
		{   
			list.add(sC.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			sc();
		}
	}
	
	public void payment(double price)
	{
		
		Home.Price = Home.Price + price ;
		 System.out.println("Do you want order more");
         System.out.println("1.order from same menu");
         System.out.println("2.go back");
         System.out.println("3.Go back to Home " );
         System.out.println("4.procees bill");
         
         int a = s.nextInt();
         if(a == 1)
         {
        	 sc();
         }
         else if(a == 2)
         {
        	 HealthConditions h = new HealthConditions();
         	h.display();
         }
         else if(a == 3)
         {
        	 Home h = new Home();
				h.home();
         }
         else if(a == 4)
         {
        	 
        	 if(h.Price != 0.0)
          	  {
        		 
          		  for(Object obj : list)
          		  {
          			  System.out.println(obj);
          		  }  
          	System.out.println("Your Order Price :"+h.Price);
          	System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			    System.out.println("------❤️❤️ Thank You 💖💖--------");
			    System.out.println("(●'◡'●)   Vist Again.    (●'◡'●) ");
			    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
          	System.exit(0);
          	  }
          	  else
          	  {
          		h.home();
          	  }
         
         
	}

	}
}
