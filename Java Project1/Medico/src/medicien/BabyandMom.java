package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class BabyandMom extends PersonalCare{
	ArrayList bab = new ArrayList();

	BabyandMom(){}
	
	BabyandMom(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void bm() {
		
		bab.add("1. Argipreg Sugar Free Sachet 6.5 GM ₹:- 43.66");
		bab.add("2. Lactonic Granules 200 GM ₹:-294.40");
		bab.add("3. Prega News Pregnancy Kit 1 ₹:-54.00");
		bab.add("4. Tedibar Soap 75 GM₹:-179.10");
		bab.add("5. Dermadew Baby Soap 75 GM₹:-158.40");
		bab.add("6. Woodward Gripe Water Liquid 200 ML₹:-72.00");
		bab.add("7. Galact Granules 200 GM₹:-357.85");
		
		
		BabyandMom bbm1= new BabyandMom(1,"Argipreg Sugar Free Sachet 6.5 GM","Mankind Pharmaceuticals Ltd.", 6,43.66 );
		BabyandMom bbm2= new BabyandMom(2,"Lactonic Granules 200 GM","Alembic Ltd",200 ,294.40);
		BabyandMom bbm3= new BabyandMom(3,"Prega News Pregnancy Kit 1","Mankind Pharmaceuticals Ltd.",1  ,54.00);
		BabyandMom bbm4= new BabyandMom(4,"Tedibar Soap 75 GM","Curatio Health Care Pvt Ltd.",75,179.10);
		BabyandMom bbm5= new BabyandMom(5,"Dermadew Baby Soap 75 GM","Hegde & Hegde",75,158.40);
		BabyandMom bbm6= new BabyandMom(6,"Woodward Gripe Water Liquid 200 ML","Ttk Healthcare Ltd",200,72.00);
		BabyandMom bbm7= new BabyandMom(7,"Galact Granules 200 GM","Emcure Pharmaceuticals Ltd",200,357.85);
		
		
		System.out.println("*******************************************************");
		System.out.println("              Baby and Mom Care ");
		System.out.println("*******************************************************");
		System.out.println(bab.get(0));
		System.out.println(bab.get(1));
		System.out.println(bab.get(2));
		System.out.println(bab.get(3));
		System.out.println(bab.get(4));
		System.out.println(bab.get(5));
		System.out.println(bab.get(6));
		
		
		System.out.println(" 👆 Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(bbm1);
			or1(43.66,0);
			break;
		}
		case 2: {
			System.out.println(bbm2);or1(294.40,1);
			break;
		}
		case 3: {
			System.out.println(bbm3);or1(54.00,2);
			
			break;
		}
		case 4: {
			System.out.println(bbm4);or1(179.10,3);
			break;
		}
		case 5: {
			System.out.println(bbm5);or1(158.40,4);
			
			break;
		}
		case 6: {
			System.out.println(bbm6);or1(72.00,5);
			break;
		}
		case 7: {
			System.out.println(bbm7);or1(357.85,6);
			
			break;
		}
		
		case 11: {
			PersonalCare v = new PersonalCare();
			v.display();
			break;
		}
		default:
		{
			bm();
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
			list.add(bab.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			bm();
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
        	 bm();
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
