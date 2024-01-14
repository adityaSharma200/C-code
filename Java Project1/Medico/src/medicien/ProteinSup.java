package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class ProteinSup extends VitaminsSupplements{
	ArrayList mma = new ArrayList();

	ProteinSup(){}
	
	ProteinSup(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void pS() {
		
		mma.add("1. Prohance Hp Vanilla Powder 400 GM ");
		mma.add("2. Ensure Vanilla Flavour Refill Powder 1 Kg ");
		mma.add("3. Threptin Biscuit 275 GM ");
		mma.add("4. Pentasure 2.0 Vanilla High Protein Powder 1000 GM");
		mma.add("5. Medislim Vanilla Flavour Powder 500 GM");
		mma.add("6. Fresubin Hp Vanilla Powder 400 GM");
		mma.add("7. Lamino Gi Plus Vanilla Flavour Powder 200 GM");
		mma.add("8. D Protin Chocolate Powder 500 GM ");
		mma.add("9. B Protin Chocolate Powder 500 GM");
		mma.add("10.Prohance Mom Chocolate Powder 400 GM ");
		
		VitaminsSupplements mma1= new VitaminsSupplements(1,"Prohance Hp Vanilla Powder 400 GM","Sun Pharma Laboratories Ltd.",400 , 875.60);
		VitaminsSupplements mma2= new VitaminsSupplements(2,"Ensure Vanilla Flavour Refill Powder 1 Kg","Abbott India Ltd",1,1550.20);
		VitaminsSupplements mma3= new VitaminsSupplements(3,"Threptin Biscuit 275 GM","Raptakos Brett & Co. Ltd.", 275,436.50);
		VitaminsSupplements mma4= new VitaminsSupplements(4,"Pentasure 2.0 Vanilla High Protein Powder 1000 GM","Hexagon Nutrition Pvt. Ltd",1000,3157.19);
		VitaminsSupplements mma5= new VitaminsSupplements(5,"Medislim Vanilla Flavour Powder 500 GM","British Biological",500,553.50);
		VitaminsSupplements mma6= new VitaminsSupplements(6,"Fresubin Hp Vanilla Powder 400 GM","Fresenius Kabi India Pvt Ltd",400,820.00);
		VitaminsSupplements mma7= new VitaminsSupplements(7,"Lamino Gi Plus Vanilla Flavour Powder 200 GM","La Renon",200,712.00);
		VitaminsSupplements mma8= new VitaminsSupplements(8,"D Protin Chocolate Powder 500 GM","British Biological",500,535.50);
		VitaminsSupplements mma9= new VitaminsSupplements(9,"B Protin Chocolate Powder 500 GM","British Biological",500,517.50);
		VitaminsSupplements mma10= new VitaminsSupplements(10,"Prohance Mom Chocolate Powder 400 GM","Sun Pharma Laboratories Ltd.",400,549.00);
		
		System.out.println("*******************************************************");
		System.out.println("               Protein Supplements ");
		System.out.println("*******************************************************");
		System.out.println(mma.get(0));
		System.out.println(mma.get(1));
		System.out.println(mma.get(2));
		System.out.println(mma.get(3));
		System.out.println(mma.get(4));
		System.out.println(mma.get(5));
		System.out.println(mma.get(6));
		System.out.println(mma.get(7));
		System.out.println(mma.get(8));
		System.out.println(mma.get(9));
		
		System.out.println(" 👆 Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(mma1);
			or1(875.60,0);
			break;
		}
		case 2: {
			System.out.println(mma2);or1(1550.20,1);
			break;
		}
		case 3: {
			System.out.println(mma3);or1(436.50,2);
			
			break;
		}
		case 4: {
			System.out.println(mma4);or1(3157.19,3);
			break;
		}
		case 5: {
			System.out.println(mma5);or1(553.50,4);
			
			break;
		}
		case 6: {
			System.out.println(mma6);or1(820.00,5);
			break;
		}
		case 7: {
			System.out.println(mma7);or1(712.00,6);
			
			break;
		}
		case 8: {
			System.out.println(mma8);or1(535.50,7);
			break;
		}
		case 9: {
			System.out.println(mma9);or1(517.50,8);
			
			break;
		}
		case 10: {
			System.out.println(mma10);or1(549.00,9);
			break;
		}
		case 11: {
			VitaminsSupplements v = new VitaminsSupplements();
			v.display();
			break;
		}
		default:
		{
			pS();
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
			list.add(mma.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			pS();
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
        	 pS();
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
