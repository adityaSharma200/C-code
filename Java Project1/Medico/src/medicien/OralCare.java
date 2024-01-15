package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class OralCare extends PersonalCare{
	ArrayList oc = new ArrayList();

	OralCare(){}
	
	OralCare(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void oce() {
		
		oc.add("1.Vantej Toothpaste 50 GM  ₹:- 175.50");
		oc.add("2.Himalaya Hiora K Toothpaste 100 GM  ₹:-117.00");
		oc.add("3.Clohex 0.2 % Mouth Wash 150 ML  ₹:-130.80");
		oc.add("4.Listerine Coolmint Mouth Wash 500 ML ₹:-301.50");
		oc.add("5.Wokadine Gargle 2 % 100 ML ₹:-159.60");
		oc.add("6.Listerine Coolmint Mouth Wash 250 ML ₹:-157.50");
		oc.add("7.Senquel 5 % Paste 100 GM ₹:-124.80");
		
		
		OralCare mma1= new OralCare(1,"Vantej Toothpaste 50 GM","Dr. Reddys Laboratories Ltd",50 ,175.50 );
		OralCare mma2= new OralCare(2,"Himalaya Hiora K Toothpaste 100 GM","Himalaya Drug Company",100,117.00);
		OralCare mma3= new OralCare(3,"Clohex 0.2 % Mouth Wash 150 ML","Dr. Reddys Laboratories Ltd",150 ,130.80);
		OralCare mma4= new OralCare(4,"Listerine Coolmint Mouth Wash 500 ML","Johnson & Johnson",500,301.50);
		OralCare mma5= new OralCare(5,"Wokadine Gargle 2 % 100 ML","Dr. Reddys Laboratories Ltd",100,159.60);
		OralCare mma6= new OralCare(6,"Listerine Coolmint Mouth Wash 250 ML","Johnson & Johnson",250,157.50);
		OralCare mma7= new OralCare(7,"Senquel 5 % Paste 100 GM","Dr. Reddys Laboratories Ltd",100,124.80);
		
		
		System.out.println("*******************************************************");
		System.out.println("               Oral Care ");
		System.out.println("*******************************************************");
		System.out.println(oc.get(0));
		System.out.println(oc.get(1));
		System.out.println(oc.get(2));
		System.out.println(oc.get(3));
		System.out.println(oc.get(4));
		System.out.println(oc.get(5));
		System.out.println(oc.get(6));
		
		
		System.out.println(" 👆 Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(mma1);
			or1(175.50,0);
			break;
		}
		case 2: {
			System.out.println(mma2);or1(117.00,1);
			break;
		}
		case 3: {
			System.out.println(mma3);or1(130.80,2);
			
			break;
		}
		case 4: {
			System.out.println(mma4);or1(301.50,3);
			break;
		}
		case 5: {
			System.out.println(mma5);or1(159.60,4);
			
			break;
		}
		case 6: {
			System.out.println(mma6);or1(157.50,5);
			break;
		}
		case 7: {
			System.out.println(mma7);or1(124.80,6);
			
			break;
		}
		
		case 11: {
			PersonalCare v = new PersonalCare();
			v.display();
			break;
		}
		default:
		{
			oce();
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
			list.add(oc.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			oce();
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
        	 oce();
         }
         else if(a == 2)
         {
        	 PersonalCare v = new PersonalCare();
 			v.display();
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
