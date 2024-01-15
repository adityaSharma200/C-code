package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class HairCare extends PersonalCare{
	ArrayList hce = new ArrayList();

	HairCare(){}
	
	HairCare(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void hc() {
		
		hce.add("1.Hairbless Tablet 10  ₹:- 194.40");
		hce.add("2.Selsun 2.5 % Suspension 120 ML  ₹:-306.79");
		hce.add("3.Keraglo Eva Tablet 10  ₹:-200.00");
		hce.add("4.Noskurf Lotion 150 ML ₹:-391.50");
		hce.add("5.Xgain Shampoo 200 ML ₹:-572.00");
		hce.add("6.Sebamed Anti Dandruff Shampoo 200 ML ₹:-607.50");
		hce.add("7.Sebamed Anti Hairloss Shampoo 200 ML ₹:-607.50");
		
		HairCare mma1= new HairCare(1,"Hairbless Tablet 10","Mankind Pharmaceuticals Ltd.",10  , 194.40);
		HairCare mma2= new HairCare(2,"Selsun 2.5 % Suspension 120 ML","Abbott India Ltd.",120,306.79);
		HairCare mma3= new HairCare(3,"Keraglo Eva Tablet 10","Ipca Laboratories Pvt Ltd.",10 ,200.00);
		HairCare mma4= new HairCare(4,"Noskurf Lotion 150 ML","Curatio Health Care Pvt Ltd.",150,391.50);
		HairCare mma5= new HairCare(5,"Xgain Shampoo 200 ML","Cipla Ltd.",200,572.00);
		HairCare mma6= new HairCare(6,"Sebamed Anti Dandruff Shampoo 200 ML","Usv Pvt Ltd",200,607.50);
		HairCare mma7= new HairCare(7,"Sebamed Anti Hairloss Shampoo 200 ML","Usv Pvt Ltd",200,607.50);
		
		System.out.println("*******************************************************");
		System.out.println("               HairCare ");
		System.out.println("*******************************************************");
		System.out.println(hce.get(0));
		System.out.println(hce.get(1));
		System.out.println(hce.get(2));
		System.out.println(hce.get(3));
		System.out.println(hce.get(4));
		System.out.println(hce.get(5));
		System.out.println(hce.get(6));
		
		
		System.out.println(" 👆 Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(mma1);
			or1(194.40,0);
			break;
		}
		case 2: {
			System.out.println(mma2);or1(306.79,1);
			break;
		}
		case 3: {
			System.out.println(mma3);or1(200.00,2);
			
			break;
		}
		case 4: {
			System.out.println(mma4);or1(391.50,3);
			break;
		}
		case 5: {
			System.out.println(mma5);or1(572.00,4);
			
			break;
		}
		case 6: {
			System.out.println(mma6);or1(607.50,5);
			break;
		}
		case 7: {
			System.out.println(mma7);or1(607.50,6);
			
			break;
		}
		
		case 11: {
			PersonalCare v = new PersonalCare();
			v.display();
			break;
		}
		default:
		{
			hc();
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
			list.add(hce.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			hc();
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
        	 hc();
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
