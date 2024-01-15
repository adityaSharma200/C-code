package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class MMA extends VitaminsSupplements{

	ArrayList mma1 = new ArrayList();

	MMA(){}
	
	MMA(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void mma() {
		
		mma1.add("1. Fertisure M Tablet 10       ₹:- 258.40");
		mma1.add("2. Fertisure F Tablet 10       ₹:- 212.00");
		mma1.add("3. Threptin Biscuit 275 GM     ₹:- 435.60");
		mma1.add("4. Rejunex Cd3 Tablet 10       ₹:- 193.60");
		mma1.add("5. A To Z Gold Capsule 15      ₹:- 180.00");
		mma1.add("6. A To Z Ns Plus Tablet 15    ₹:- 124.00");
		mma1.add("7. Nurokind Lc Tablet 15       ₹:- 191.88");
		mma1.add("8. Fibronorm Capsule 10        ₹:- 439.20");
		mma1.add("9. Antoxipan Tablet 15         ₹:- 372.80");
		mma1.add("10. Revital H Woman Tablet 30  ₹:- 360.00");
		
		MMA ma1= new MMA(1,"Fertisure M Tablet 10","Sun Pharma Laboratories Ltd.",10, 258.40);
		MMA ma2= new MMA(2,"Fertisure F Tablet 10","Sun Pharma Laboratories Ltd.",10,212.00);
		MMA ma3= new MMA(3,"Viadek Tablet 30","Abbott Healthcare Pvt. Ltd", 30,436.50);
		MMA ma4= new MMA(4,"Rejunex Cd3 Tablet 10","Intas Pharmaceuticals Ltd",10,193.60);
		MMA ma5= new MMA(5,"A To Z Gold Capsule 15","Alkem Laboratories Ltd.",15,180.00);
		MMA ma6= new MMA(6,"A To Z Ns Plus Tablet 15","Alkem Laboratories Ltd.",15,124.00);
		MMA ma7= new MMA(7,"Nurokind Lc Tablet 15","Mankind Pharmaceuticals Ltd.",15,191.88);
		MMA ma8= new MMA(8,"Fibronorm Capsule 10","Akumentis Healthcare Ltd",10,439.20);
		MMA ma9= new MMA(9,"Antoxipan Tablet 15","Abbott India Ltd.",15,372.80);
		MMA ma10= new MMA(10,"Revital H Woman Tablet 30","Sun Pharmaceutical Industries Ltd",30 ,360.00);
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		
		System.out.println(mma1.get(0));
		System.out.println(mma1.get(1));
		System.out.println(mma1.get(2));
		System.out.println(mma1.get(3));
		System.out.println(mma1.get(4));
		System.out.println(mma1.get(5));
		System.out.println(mma1.get(6));
		System.out.println(mma1.get(7));
		System.out.println(mma1.get(8));
		System.out.println(mma1.get(9));
		
		System.out.println("Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(ma1);
			or1(258.40,0);
			break;
		}
		case 2: {
			System.out.println(ma2);or1(212.00,1);
			break;
		}
		case 3: {
			System.out.println(ma3);or1(435.60,2);
			
			break;
		}
		case 4: {
			System.out.println(ma4);or1(193.60,3);
			break;
		}
		case 5: {
			System.out.println(ma5);or1(180.00,4);
			
			break;
		}
		case 6: {
			System.out.println(ma6);or1(124.00,5);
			break;
		}
		case 7: {
			System.out.println(ma7);or1(191.88,6);
			
			break;
		}
		case 8: {
			System.out.println(ma8);or1(439.20,7);
			break;
		}
		case 9: {
			System.out.println(ma9);or1(372.80,8);
			
			break;
		}
		case 10: {
			System.out.println(ma10);or1(360.00,9);
			break;
		}
		case 11: {
			VitaminsSupplements v = new VitaminsSupplements();
			v.display();
			break;
		}
		default:
		{
			mma();
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
			list.add(mma1.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			mma();
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
        	 mma();
         }
         else if(a == 2)
         {
        	 VitaminsSupplements v = new VitaminsSupplements();
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
