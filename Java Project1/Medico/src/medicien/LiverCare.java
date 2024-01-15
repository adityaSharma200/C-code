package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class LiverCare extends HealthConditions{
	ArrayList lvc = new ArrayList();

	LiverCare(){}
	
	LiverCare(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void lv() {
		
		lvc.add("1. Antoxipan Ds Sachet 6 GM       ₹:- 34.00");
		lvc.add("2. Himalaya Abana Tablet 60       ₹:- 161.50");
		lvc.add("3. Lamino Hepa Sachet 7*30 GM     ₹:- 319.20");
		lvc.add("4. Himalaya Liv 52 Syrup 100 ML       ₹:- 88.00");
		lvc.add("5. Adliv Forte Capsule 10       ₹:- 56.14");
		lvc.add("6. Adliv Syrup 200 ML     ₹:- 113.18");
		lvc.add("7. Livosin Syrup 200 ML       ₹:- 135.00");
		
		
		LiverCare bj1= new LiverCare(1,"Antoxipan Ds Sachet 6 GM","Abbott Healthcare Pvt. Ltd",6,34.00 );
		LiverCare bj2= new LiverCare(2,"Himalaya Abana Tablet 60","Himalaya Drug Company",60,161.50);
		LiverCare bj3= new LiverCare(3,"Lamino Hepa Sachet 7*30 GM","La Renon",7 ,319.20);
		LiverCare bj4= new LiverCare(4,"Himalaya Liv 52 Syrup 100 ML","Himalaya Drug Company",100,88.00);
		LiverCare bj5= new LiverCare(5,"Adliv Forte Capsule 10","Albert David",10,56.14);
		LiverCare bj6= new LiverCare(6,"Adliv Syrup 200 ML","Albert David",200,113.18);
		LiverCare bj7= new LiverCare(7,"Livosin Syrup 200 ML","Jupiter Pharmaceuticals",200,135.00);
		
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		
		System.out.println(lvc.get(0));
		System.out.println(lvc.get(1));
		System.out.println(lvc.get(2));
		System.out.println(lvc.get(3));
		System.out.println(lvc.get(4));
		System.out.println(lvc.get(5));
		System.out.println(lvc.get(6));
		
		System.out.println("Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println();
			or1(34.00,0);
			break;
		}
		case 2: {
			System.out.println();or1(161.50,1);
			break;
		}
		case 3: {
			System.out.println();or1(319.20,2);
			
			break;
		}
		case 4: {
			System.out.println();or1(88.00,3);
			break;
		}
		case 5: {
			System.out.println();or1(56.14,4);
			
			break;
		}
		case 6: {
			System.out.println();or1(113.18,5);
			break;
		}
		case 7: {
			System.out.println();or1(135.00,6);
			
			break;
		}
		
		case 11: {
			VitaminsSupplements v = new VitaminsSupplements();
			v.display();
			break;
		}
		default:
		{
			lv();
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
			list.add(lvc.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			lv();
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
        	 lv();
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
