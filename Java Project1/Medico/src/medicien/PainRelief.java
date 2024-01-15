package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class PainRelief extends HealthConditions{
	ArrayList pf = new ArrayList();
	
    Home h = new Home();
	PainRelief(){}
	
	PainRelief(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	public  void pf(){
		
		pf.add("1. Volini Spray 100 GM       ₹:- 272.00");
		pf.add("2. Dolo 650 MG Tablet 15       ₹:- 26.88");
		pf.add("3. Macgesia Oil 50 ML     ₹:- 172.35");
		pf.add("4. Volini Spray 40 GM       ₹:- 130.40");
		pf.add("5. Amrutanjan Faster Relaxation Headache Roll On 10 ML       ₹:- 61.75");
		
		BoneandJoint bj1= new BoneandJoint(1,"Volini Spray 100 GM","Sun Pharmaceutical Industries Ltd",100,272.00 );
		BoneandJoint bj2= new BoneandJoint(2,"Dolo 650 MG Tablet 15","Micro Labs Ltd",15,26.88);
		BoneandJoint bj3= new BoneandJoint(3,"Macgesia Oil 50 ML","Macleods Pharmaceuticals Pvt.ltd", 50,172.35);
		BoneandJoint bj4= new BoneandJoint(4,"Volini Spray 40 GM","Sun Pharmaceutical Industries Ltd",40,130.40);
		BoneandJoint bj5= new BoneandJoint(5,"Amrutanjan Faster Relaxation Headache Roll On 10 ML","Amrutanjan Ltd",10,61.75);
		
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		
		System.out.println(pf.get(0));
		System.out.println(pf.get(1));
		System.out.println(pf.get(2));
		System.out.println(pf.get(3));
		System.out.println(pf.get(4));
		
		
		System.out.println("Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println();
			or1(272.00,0);
			break;
		}
		case 2: {
			System.out.println();or1(26.88,1);
			break;
		}
		case 3: {
			System.out.println();or1(172.35,2);
			
			break;
		}
		case 4: {
			System.out.println();or1(130.40,3);
			break;
		}
		case 5: {
			System.out.println();or1(61.75,4);
			
			break;
		}
		
		case 11: {
			VitaminsSupplements v = new VitaminsSupplements();
			v.display();
			break;
		}
		default:
		{
			pf();
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
			list.add(pf.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			pf();
		}
	}
	
	public void payment(double price)
	{
		
		Home.Price = Home.Price + price ;
		 System.out.println("Do you want order more");
         System.out.println("1.order from same menu");
         System.out.println("2.go back");
         System.out.println("3.Go back to Home " );
			/* System.out.println("4.Do you want remove any product."); */
         System.out.println("4.procees bill");
         
         int a = s.nextInt();
         if(a == 1)
         {
        	 pf();
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
			/*
			 * else if(a == 4) {
			 * System.out.println("Enter a number which product do u want remove."); int nu
			 * = s.nextInt(); remove(nu); }
			 */
         else if(a == 4)
         {
        	 
        	 if(h.Price != 0.0)
          	  {
        		
          		  for(Object obj : list)
          		  {
          			System.out.println(h.n+". "+obj);
          			h.n++;
          			
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
