package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class SkinCare extends PersonalCare{
	ArrayList sce = new ArrayList();

	SkinCare(){}
	
	SkinCare(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void sc() {
		
		sce.add("1.Cetaphil Moisturising Lotion 500 ML  ₹:- 1279.80");
		sce.add("2.Tetmosol Soap 100 GM  ₹:-76.00");
		sce.add("3.Tedibar Soap 75 GM  ₹:-179.10");
		sce.add("4.Cetaphil Moist Lotion 100 ML ₹:-494.10");
		sce.add("5.Acnestar Face Wash 50 GM ₹:-120.00");
		sce.add("6.Ahaglow Acne Control Moisturizing Gel 50 GM ₹:-517.50");
		sce.add("7.Moiz Xl Cream 500 GM ₹:-740.70");
		
		
		SkinCare mma1= new SkinCare(1,"Cetaphil Moisturising Lotion 500 ML","Galderma India Pvt. Ltd",500 ,1279.80 );
		SkinCare mma2= new SkinCare(2,"Tetmosol Soap 100 GM","Piramal Healthcare Limited",100,76.00);
		SkinCare mma3= new SkinCare(3,"Tedibar Soap 75 GM","Curatio Health Care Pvt Ltd.",75 ,179.10);
		SkinCare mma4= new SkinCare(4,"Cetaphil Moist Lotion 100 ML","Galderma India Pvt. Ltd",100,494.10);
		SkinCare mma5= new SkinCare(5,"Acnestar Face Wash 50 GM","Mankind Pharmaceuticals Ltd.",50,120.00);
		SkinCare mma6= new SkinCare(6,"Ahaglow Acne Control Moisturizing Gel 50 GM","Torrent Pharmaceuticals Ltd.", 50,517.50);
		SkinCare mma7= new SkinCare(7,"Moiz Xl Cream 500 GM","Glowderma", 500 ,740.70);
		
		
		System.out.println("*******************************************************");
		System.out.println("               Skin Care ");
		System.out.println("*******************************************************");
		System.out.println(sce.get(0));
		System.out.println(sce.get(1));
		System.out.println(sce.get(2));
		System.out.println(sce.get(3));
		System.out.println(sce.get(4));
		System.out.println(sce.get(5));
		System.out.println(sce.get(6));
		
		
		System.out.println(" 👆 Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(mma1);
			or1(1279.80,0);
			break;
		}
		case 2: {
			System.out.println(mma2);or1(76.00,1);
			break;
		}
		case 3: {
			System.out.println(mma3);or1(179.10,2);
			
			break;
		}
		case 4: {
			System.out.println(mma4);or1(494.10,3);
			break;
		}
		case 5: {
			System.out.println(mma5);or1(120.00,4);
			
			break;
		}
		case 6: {
			System.out.println(mma6);or1(517.50,5);
			break;
		}
		case 7: {
			System.out.println(mma7);or1(740.70,6);
			
			break;
		}
		
		case 11: {
			PersonalCare v = new PersonalCare();
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
			list.add(sce.get(n));
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
