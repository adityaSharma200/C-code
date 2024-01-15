package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class VitaminAtoZ extends VitaminsSupplements {
	ArrayList vit = new ArrayList();

	VitaminAtoZ(){}
	
	VitaminAtoZ(int nu,String Brandname,String Companyname,int pack,double price)
	{
		super(nu,Brandname,Companyname,pack,price);
	}
	
	
	void vita() {
		
		vit.add("1. Calciquick D3 60000 IU Capsule 4       ₹:-68.80 ");
		vit.add("2. Calcigen D3 60000 IU Capsule 4       ₹:-68.80 ");
		vit.add("3. Limcee Chew Orange 500 MG Tablet 15     ₹:-19.89 ");
		vit.add("4. Dv 60 K 60000 IU Capsule 8       ₹:- 234.34");
		vit.add("5. Rocaltrol 0.25 MCG Capsule 10     ₹:- 249.94");
		vit.add("6. Lupiheme Tablet 10    ₹:- 215.20");
		vit.add("7. Arachitol Nano 60000 IU Sugar Free Syrup 5 ML       ₹:- 76.26");
		vit.add("8. Tocofil Capsule 15        ₹:- 370.40");
		vit.add("9. Depura D3 60000 IU Oral Solution Sf 5 ML         ₹:- 87.77");
		vit.add("10.Folvite 5 MG Tablet 45   ₹:- 64.68");
		
		
		
		VitaminAtoZ vita1= new VitaminAtoZ(1,"Calciquick D3 60000 IU Capsule 4","Morepen Laboratories Limited",4,68.80 );
		VitaminAtoZ vita2= new VitaminAtoZ(1,"Calcigen D3 60000 IU Capsule 4","Cadila Pharmaceuticals Ltd", 4, 68.80);
		VitaminAtoZ vita3= new VitaminAtoZ(1,"Limcee Chew Orange 500 MG Tablet 15","Abbott Healthcare Pvt. Ltd",15 ,19.89 );
		VitaminAtoZ vita4= new VitaminAtoZ(1,"Dv 60 K 60000 IU Capsule 8","Indchemie Health Specialities Pvt. Ltd",8, 234.34);
		VitaminAtoZ vita5= new VitaminAtoZ(1,"Rocaltrol 0.25 MCG Capsule 10","Abbott Healthcare Pvt. Ltd",10 ,249.94 );
		VitaminAtoZ vita6= new VitaminAtoZ(1,"Lupiheme Tablet 10","Lupin Ltd",10,215.20 );
		VitaminAtoZ vita7= new VitaminAtoZ(1,"Arachitol Nano 60000 IU Sugar Free Syrup 5 ML","Abbott India Ltd.",5 , 76.26);
		VitaminAtoZ vita8= new VitaminAtoZ(1,"Tocofil Capsule 15","Fourrts India Laboratories Pvt. Ltd",15, 370.40);
		VitaminAtoZ vita9= new VitaminAtoZ(1,"Depura D3 60000 IU Oral Solution Sf 5 ML","Sanofi India Ltd.",5 , 87.77);
		VitaminAtoZ vita10= new VitaminAtoZ(1,"Folvite 5 MG Tablet 45","Pfizer Ltd", 45 , 64.68);
		
		
		
		System.out.println("*******************************************************");
		System.out.println("                Vitamin A to Z ");
		System.out.println("*******************************************************");
		
		System.out.println(vit.get(0));
		System.out.println(vit.get(1));
		System.out.println(vit.get(2));
		System.out.println(vit.get(3));
		System.out.println(vit.get(4));
		System.out.println(vit.get(5));
		System.out.println(vit.get(6));
		System.out.println(vit.get(7));
		System.out.println(vit.get(8));
		System.out.println(vit.get(9));
		
		System.out.println("Press 11 to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(vita1);
			or1(68.80 ,0);
			break;
		}
		case 2: {
			System.out.println(vita2);or1(68.80 ,1);
			break;
		}
		case 3: {
			System.out.println(vita3);or1(19.89 ,2);
			
			break;
		}
		case 4: {
			System.out.println(vita4);or1(234.34,3);
			break;
		}
		case 5: {
			System.out.println(vita5);or1(249.94,4);
			
			break;
		}
		case 6: {
			System.out.println(vita6);or1(215.20,5);
			break;
		}
		case 7: {
			System.out.println(vita7);or1(76.26,6);
			
			break;
		}
		case 8: {
			System.out.println(vita8);or1(370.40,7);
			break;
		}
		case 9: {
			System.out.println(vita9);or1(87.77,8);
			
			break;
		}
		case 10: {
			System.out.println(vita10);or1(64.68,9);
			break;
		}
		case 11: {
			VitaminsSupplements v = new VitaminsSupplements();
			v.display();
			break;
		}
		default:
		{
			vita();
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
			list.add(vit.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			vita();
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
        	 vita();
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
