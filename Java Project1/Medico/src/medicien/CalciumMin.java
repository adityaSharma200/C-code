package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class CalciumMin extends VitaminsSupplements{
	ArrayList cal = new ArrayList();

	CalciumMin(){}
	
	CalciumMin(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void cal() {
		
		cal.add("1. Cipcal 500 MG Tablet 15       ₹:-47.55 ");
		cal.add("2. Ostoshine Tablet 10       ₹:- 600.00");
		cal.add("3. Supracal 2000 Tablet 15     ₹:- 267.20");
		cal.add("4. Calgel K2 7 Capsule 15       ₹:-175.20 ");
		cal.add("5. Bio D3 Plus 200 Mg/0.25mcg Capsule 15     ₹:- 240.80");
		cal.add("6. Shelcal 500 Mg/250iu Tablet 15    ₹:- 105.04");
		cal.add("7. Shelcal Xt Tablet 15       ₹:- 331.64");
		cal.add("8. Gemcal Capsule 15        ₹:- 276.80");
		cal.add("9. Bio D3 Max Capsule 15         ₹:- 343.20");
		cal.add("10. Cartigen Forte Plus Tablet 10  ₹:- 327.20");
		
		
		
		CalciumMin cal1= new CalciumMin(1,"Cipcal 500 MG Tablet 15","Cipla Ltd.",15,47.55 );
		CalciumMin cal2= new CalciumMin(2,"Ostoshine Tablet 10","Ranbaxy Laboratories Ltd",10,600.00 );
		CalciumMin cal3= new CalciumMin(3,"Supracal 2000 Tablet 15","Pharmed Ltd",15,267.20 );
		CalciumMin cal4= new CalciumMin(4,"Calgel K2 7 Capsule 15","Intas Pharmaceuticals Ltd",15,175.20 );
		CalciumMin cal5= new CalciumMin(5,"Bio D3 Plus 200 Mg/0.25mcg Capsule 15","Macleods Pharmaceuticals Pvt.ltd",15, 240.80);
		CalciumMin cal6= new CalciumMin(6,"Shelcal 500 Mg/250iu Tablet 15","Torrent Pharmaceuticals Ltd.",15, 105.04);
		CalciumMin cal7= new CalciumMin(7,"Shelcal Xt Tablet 15","Torrent Pharmaceuticals Ltd.",15, 331.64);
		CalciumMin cal8= new CalciumMin(8,"Gemcal Capsule 15","Alkem Laboratories Ltd.",15,276.80 );
		CalciumMin cal9= new CalciumMin(9,"Bio D3 Max Capsule 15","Macleods Pharmaceuticals Pvt.ltd",15, 343.20);
		CalciumMin cal10= new CalciumMin(10,"Cartigen Forte Plus Tablet 10","Pharmed Ltd",10,327.20 );
		
		
		
		System.out.println("*******************************************************");
		System.out.println("                Calcium & Minerals ");
		System.out.println("*******************************************************");
		
		System.out.println(cal.get(0));
		System.out.println(cal.get(1));
		System.out.println(cal.get(2));
		System.out.println(cal.get(3));
		System.out.println(cal.get(4));
		System.out.println(cal.get(5));
		System.out.println(cal.get(6));
		System.out.println(cal.get(7));
		System.out.println(cal.get(8));
		System.out.println(cal.get(9));
		
		System.out.println("Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(cal1);
			or1(47.55 ,0);
			break;
		}
		case 2: {
			System.out.println(cal2);or1(600.00,1);
			break;
		}
		case 3: {
			System.out.println(cal3);or1(267.20,2);
			
			break;
		}
		case 4: {
			System.out.println(cal4);or1(175.20 ,3);
			break;
		}
		case 5: {
			System.out.println(cal5);or1(240.80,4);
			
			break;
		}
		case 6: {
			System.out.println(cal6);or1(105.04,5);
			break;
		}
		case 7: {
			System.out.println(cal7);or1(331.64,6);
			
			break;
		}
		case 8: {
			System.out.println(cal8);or1(276.80,7);
			break;
		}
		case 9: {
			System.out.println(cal9);or1(343.20,8);
			
			break;
		}
		case 10: {
			System.out.println(cal10);or1(327.20,9);
			break;
		}
		case 11: {
			VitaminsSupplements v = new VitaminsSupplements();
			v.display();
			break;
		}
		default:
		{
			cal();
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
			list.add(cal.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			cal();
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
        	 cal();
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
