package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class BoneandJoint extends HealthConditions{
	ArrayList bj = new ArrayList();

	BoneandJoint(){}
	
	BoneandJoint(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	public void bj() {
		
		bj.add("1. Ucmove Capsule 10       ₹:- 627.42");
		bj.add("2. Akbanem 300/500 MG Tablet 10       ₹:- 680.40");
		bj.add("3. Ezorb Fem Tablet 15     ₹:- 374.31");
		bj.add("4. Rejulox C Capsule 10       ₹:- 285.44");
		bj.add("5. Macvestin Total Sachet 10 GM       ₹:- 135.52");
		bj.add("6. Zedfit Powder 150 GM     ₹:- 663.20");
		bj.add("7. Tenata 35/200/40/30 MG Tablet 15       ₹:- 222.00");
		bj.add("8. Celol Xt Plus Tablet 10        ₹:- 208.00");
		bj.add("9. Collashot 10 GM Solution 25 ML         ₹:- 68.80");
		bj.add("10.Kolabos Xt Tablet 10   ₹:- 423.20");
		
		BoneandJoint bj1= new BoneandJoint(1,"Ucmove Capsule 10","Aksigen Hospital Care",10,627.42 );
		BoneandJoint bj2= new BoneandJoint(2,"Akbanem 300/500 MG Tablet 10","Vasu Organics Pvt.ltd",10,680.40);
		BoneandJoint bj3= new BoneandJoint(3,"Ezorb Fem Tablet 15","Overseas Healthcare Pvt Ltd.", 15,374.31);
		BoneandJoint bj4= new BoneandJoint(4,"Rejulox C Capsule 10","Msn Laboratories Ltd",10,285.44);
		BoneandJoint bj5= new BoneandJoint(5,"Macvestin Total Sachet 10 GM","Macleods Pharmaceuticals Pvt.ltd",10,135.52);
		BoneandJoint bj6= new BoneandJoint(6,"Zedfit Powder 150 GM","Tablets India Ltd",150,663.20);
		BoneandJoint bj7= new BoneandJoint(7,"Tenata 35/200/40/30 MG Tablet 15","Cadila Pharmaceuticals Ltd",15,222.00);
		BoneandJoint bj8= new BoneandJoint(8,"Celol Xt Plus Tablet 10","Emcure Pharmaceuticals Ltd",10 ,208.00);
		BoneandJoint bj9= new BoneandJoint(9,"Collashot 10 GM Solution 25 ML","Innovcare Life Sciences Pvt.ltd", 25,68.80);
		BoneandJoint bj10= new BoneandJoint(10,"Kolabos Xt Tablet 10","Jupitor Biolabs",10 ,423.20);
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		
		System.out.println(bj.get(0));
		System.out.println(bj.get(1));
		System.out.println(bj.get(2));
		System.out.println(bj.get(3));
		System.out.println(bj.get(4));
		System.out.println(bj.get(5));
		System.out.println(bj.get(6));
		System.out.println(bj.get(7));
		System.out.println(bj.get(8));
		System.out.println(bj.get(9));
		
		System.out.println("Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println();
			or1(627.42,0);
			break;
		}
		case 2: {
			System.out.println();or1(680.40,1);
			break;
		}
		case 3: {
			System.out.println();or1(374.31,2);
			
			break;
		}
		case 4: {
			System.out.println();or1(285.44,3);
			break;
		}
		case 5: {
			System.out.println();or1(135.52,4);
			
			break;
		}
		case 6: {
			System.out.println();or1(663.20,5);
			break;
		}
		case 7: {
			System.out.println();or1( 222.00,6);
			
			break;
		}
		case 8: {
			System.out.println();or1(208.00,7);
			break;
		}
		case 9: {
			System.out.println();or1(68.80,8);
			
			break;
		}
		case 10: {
			System.out.println();or1(423.20,9);
			break;
		}
		case 11: {
			HealthConditions v = new HealthConditions();
			v.display();
			break;
		}
		default:
		{
			bj();
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
			list.add(bj.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			bj();
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
        	 bj();
         }
         else if(a == 2)
         {
        	 HealthConditions v = new HealthConditions();
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
        		 int n = 1;
          		  for(Object obj : list)
          		  {
          			  System.out.println(n+". "+obj);
          			  n++;
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
