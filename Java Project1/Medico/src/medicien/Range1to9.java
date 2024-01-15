package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class Range1to9 extends Home{
	int nu;
	String Companyname;
	String Brandname;
	int pack;
	double price;
   Home h = new Home();
   
     ArrayList a = new ArrayList();
	
	Scanner s = new Scanner(System.in);
   
	Range1to9(){}
   
	Range1to9(int nu,String Brandname,String Companyname,int pack,double price){
		this.nu =nu;
		this.Brandname = Brandname;
		this.Companyname =Companyname;
		this.pack = pack;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		
		  System.out.println("_____________________________");
		  System.out.println("                             ");
		  System.out.println(nu +".    "+Brandname+"   ");
		  System.out.println("_____________________________");
		  System.out.println("----------------------------");
		  System.out.println(" "+Companyname);
		  System.out.println(" Pack of  "+pack+" units");
		  System.out.println("₹ "+price);
		  System.out.println("----------------------------");

		return "";
	}
	
	public void rangea1to9()
	{   
		    Range1to9  _1_1 =  new Range1to9(1,"1 2 3 25 MG Tablet 5","Aglowmed Pharmaceuticals Ltd.",5,33.60);
			Range1to9  _1_2 =  new Range1to9(2,"1 2 3 50 MG Tablet 4","Aglowmed Pharmaceuticals Ltd.",4 ,55.00);
			Range1to9  _1_3 =  new Range1to9(3,"1 Al 10 MG Tablet 10","Fdc Ltd.",10 ,67.20);
			Range1to9  _1_4 =  new Range1to9(4,"1 Al 10 MG Tablet 15","Fdc Ltd.",15 ,73.92);
			Range1to9  _1_5 =  new Range1to9(5,"1 Al 2.5 MG Syrup 30 ML","Fdc Ltd.",30,33.60);
			
			a.add("1.1  1 2 3 25 MG Tablet 5     ₹:- 33.60");
			a.add("1.2  1 2 3 50 MG Tablet 4     ₹:- 55.00");
			a.add("1.3  1 Al 10 MG Tablet 10     ₹:- 67.20");
			a.add("1.4  1 Al 10 MG Tablet 15     ₹:- 73.92");
			a.add("1.5  1 Al 2.5 MG Syrup 30 ML  ₹:- 33.60");
		
//================================================================================================================================		
			
			 	Range1to9  _2_1 =  new Range1to9(1,"2 Baconil Tts 20 14 MG Patch 7","Rusan Healthcare Pvt. Ltd",7,640.64);
				Range1to9  _2_2 =  new Range1to9(2,"2 Baconil Tts 30 21 MG Patch 7","Rusan Healthcare Pvt. Ltd",7 ,733.60);
				Range1to9  _2_3 =  new Range1to9(3,"2 Can 150 MG Tablet 1","Captab Biotech",1,9.70);
				Range1to9  _2_4 =  new Range1to9(4,"2 Dep 20 MG Tablet 10","Orchid Chemicals & Pharmaceuticals Ltd",10,39.94);
				Range1to9  _2_5 =  new Range1to9(5,"2 Dep 20 MG Tablet 12","Orchid Chemicals & Pharmaceuticals Ltd",12,39.94);
				
				a.add("2.1   2 Baconil Tts 20 14 MG Patch 7  ₹:- 640.64");
				a.add("2.2   2 Baconil Tts 30 21 MG Patch 7  ₹:- 733.60");
				a.add("2.3   2 Can 150 MG Tablet 1           ₹:- 9.70");
				a.add("2.4   2 Dep 20 MG Tablet 10           ₹:- 39.94");
				a.add("2.5   2 Dep 20 MG Tablet 12           ₹:- 39.94");
			
//================================================================================================================================		
				
			 	Range1to9  _3_1 =  new Range1to9(1,"3a 250 MG Tablet Dt 3","Reliance Formulation Pvt Ltd",3 ,13.89);
				Range1to9  _3_2 =  new Range1to9(2,"3a 500 MG Tablet 3","Reliance Formulation Pvt Ltd",3,55.29);
				Range1to9  _3_3 =  new Range1to9(3,"3a 500 Tablet 5","Reliance Formulation Pvt Ltd",5,105.55);
				Range1to9  _3_4 =  new Range1to9(4,"3a Xim 200 MG Tablet 10","3a Pharmaceuticals",10,180.00);
				Range1to9  _3_5 =  new Range1to9(5,"3d Flam Inj 3ml","Intas Pharmaceuticals Ltd",3 ,3.66);
				
				a.add("3.1   3a 250 MG Tablet Dt 3  ₹:-  13.89");
				a.add("3.2   3a 500 MG Tablet 3 ₹:-  55.29");
				a.add("3.3   3a 500 Tablet 5 ₹:-  105.55");
				a.add("3.4   3a Xim 200 MG Tablet 10 ₹:-  180.00");
				a.add("3.5   3d Flam Inj 3ml ₹:-  3.66");
					
//================================================================================================================================		
						
					 	Range1to9  _4_1 =  new Range1to9(1,"4 Blud Syrup 200 ML","Apex Laboratories Ltd.",200,136.00);
						Range1to9  _4_2 =  new Range1to9(2,"4 Blud Tablet 30","Apex Laboratories Ltd.",30,104.00);
						Range1to9  _4_3 =  new Range1to9(2,"4 Bones Tablet 15","Sanofi India Ltd.",15,68.32);
						Range1to9  _4_4 =  new Range1to9(2,"4 Com 1/0.05/0.75/2 % Cream 15 GM","Signova Pharma (p) Ltd", 15,46.42);
						Range1to9  _4_5 =  new Range1to9(2,"4 Dapa 10 MG Tablet 10","4 Care Lifescience Pvt Ltd",10,95.20);
						
						a.add("4.1   4 Blud Syrup 200 ML  ₹:-  136.00");
						a.add("4.2   4 Blud Tablet 30  ₹:-   104.00");
						a.add("4.3   4 Bones Tablet 15  ₹:-  68.32");
						a.add("4.4   4 Com 1/0.05/0.75/2 % Cream 15 GM  ₹:-  46.42");
						a.add("4.5   4 Dapa 10 MG Tablet 10  ₹:-95.20");
										
//================================================================================================================================		
							
					 	Range1to9  _5_1 =  new Range1to9(1,"5 Alpha R D 0.5 MG Capsule 10","Tas Med India Pvt Ltd",10,79.20);
						Range1to9  _5_2 =  new Range1to9(2,"5 Alpha R Tablet 15","Tas Med (india) Private Ltd.",15,216.00);
						Range1to9  _5_3 =  new Range1to9(3,"5 Alpha Rf 1 MG Tablet 10","Tas Med India Pvt Ltd",10,48.00);
						Range1to9  _5_4 =  new Range1to9(4,"5 D Cream 15 GM","Leo Life Science Pvt Ltd",7,79.20);
						Range1to9  _5_5 =  new Range1to9(5,"5 D Infusion 1000 ML","Claris Lifesciences Limited",8,33.00);
								
						a.add("5.1   5 Alpha R D 0.5 MG Capsule 10   ₹:-  79.20");
						a.add("5.2   5 Alpha R Tablet 15  ₹:-  216.00");
						a.add("5.3   5 Alpha Rf 1 MG Tablet 10  ₹:-  48.00");
						a.add("5.4   5 D Cream 15 GM  ₹:-  79.20");
						a.add("5.5   5 D Infusion 1000 ML  ₹:-  33.00");
//================================================================================================================================		
						
					 	Range1to9  _6_1 =  new Range1to9(2,"6 Mp 50 MG Tablet 10","Zydus Cadila",10,54.30);
						Range1to9  _6_2 =  new Range1to9(2,"6f1c 50 MG Tablet 15","Sinsan Pharmaceuticals",15,168.00);
						
								
						a.add("6.1   6 Mp 50 MG Tablet 10  ₹:-  54.30");
						a.add("6.2   6f1c 50 MG Tablet 15  ₹:-  168.00");
						
			
//================================================================================================================================		
						
					 	Range1to9  _7_1 =  new Range1to9(2,"7 Klac Dt Tablet 10","Ss Lifevision Private Limited",10,47.20);
						Range1to9  _7_2 =  new Range1to9(2,"7 La 10/250/250/50 MG Suspension 200 ML","Fdc Ltd.",200,104.80);
						Range1to9  _7_3 =  new Range1to9(2,"7 La 10/250/250/50 MG Suspension 250 ML","Fdc Ltd.",250,104.80);
						Range1to9  _7_4 =  new Range1to9(2,"7days Lubricant Cum Stimulating Gel 100 ML","Shri Ram Services",100 ,538.98);
						Range1to9  _7_5 =  new Range1to9(2,"7dzocef O 200/200 MG Tablet 10","Adzo Lifesciences Pvt Ltd",10,180.00);
								
						a.add("7.1   7 Klac Dt Tablet 10  ₹:-  47.20");
						a.add("7.2   7 La 10/250/250/50 MG Suspension 200 ML  ₹:-  104.80");
						a.add("7.3   7 La 10/250/250/50 MG Suspension 250 ML  ₹:-  104.80");
						a.add("7.4   7days Lubricant Cum Stimulating Gel 100 ML  ₹:-  538.98");
						a.add("7.5   7dzocef O 200/200 MG Tablet 10  ₹:-  180.00");	
//================================================================================================================================		
						
					 	Range1to9  _8_1 =  new Range1to9(2,"80 Protein Powder 200 GM","Astrum Healthcare Pvt. Ltd.",200,391.50);
						Range1to9  _8_2 =  new Range1to9(2,"8x 1% Cream 30 GM","Cipla Ltd.",30,178.64);
						Range1to9  _8_3 =  new Range1to9(2,"8x Kt 2/1 % Shampoo 60 ML","Cipla Ltd.",60,220.00);
						Range1to9  _8_4 =  new Range1to9(2,"8x Shampoo 120 ML","Cipla Ltd.",120,356.74);
						Range1to9  _8_5 =  new Range1to9(2,"8x With Zpto 1/1 % Shampoo 100 ML","Cipla Ltd.",100,297.29);
								
						a.add("8.1   80 Protein Powder 200 GM  ₹:-  391.50");
						a.add("8.2   8x 1% Cream 30 GM   ₹:-  178.64");
						a.add("8.3   8x Kt 2/1 % Shampoo 60 ML  ₹:-  220.00");
						a.add("8.4   8x Shampoo 120 ML  ₹:-  356.74");
						a.add("8.5   8x With Zpto 1/1 % Shampoo 100 ML  ₹:-  297.29");
			
//================================================================================================================================		
						
					 	Range1to9  _9_1 =  new Range1to9(1,"9 M Fol Softgel Capsule 10","Decisive Pharma",10,96.00);
						Range1to9  _9_2 =  new Range1to9(2,"9 Pm 50 MCG Eye Drops 2.5 ML","Cipla Ltd.",3,503.46);
						Range1to9  _9_3 =  new Range1to9(3,"90e 50 MG Tablet 4","Khandelwal Laboratories Ltd",4,162.30);
						Range1to9  _9_4 =  new Range1to9(4,"98 Control Fc Tablet 10","Omega Remedies Pvt Ltd",10,28.00);
						Range1to9  _9_5 =  new Range1to9(5,"99f 650 MG Tablet 15","Fdc Ltd.",15,24.04);
								
						a.add("9.1  9 M Fol Softgel Capsule 10   ₹:-  96.00");
						a.add("9.2  9 Pm 50 MCG Eye Drops 2.5 ML ₹:-  503.46");
						a.add("9.3  90e 50 MG Tablet 4 ₹:-  162.30");
						a.add("9.4   98 Control Fc Tablet 10  ₹:-  28.00");
						a.add("9.5   99f 650 MG Tablet 15  ₹:-  24.04");		
			
						
						
						
						System.out.println("*******************************************************");
						System.out.println(" Select Your medicine as You want. ");
						System.out.println(" Enter only number which is Display. ");
						System.out.println("*******************************************************");
						System.out.println("===============Range 1 Medicine=======================");
						System.out.println(a.get(0));
						System.out.println(a.get(1));
						System.out.println(a.get(2));
						System.out.println(a.get(3));
						System.out.println(a.get(4));
						System.out.println();
						System.out.println("===============Range 2 Medicine=======================");
						System.out.println(a.get(5));
						System.out.println(a.get(6));
						System.out.println(a.get(7));
						System.out.println(a.get(8));
						System.out.println(a.get(9));
						System.out.println();
						System.out.println("===============Range 3 Medicine=======================");
						System.out.println(a.get(10));
						System.out.println(a.get(11));
						System.out.println(a.get(12));
						System.out.println(a.get(13));
						System.out.println(a.get(14));
						System.out.println();
						System.out.println("===============Range 4 Medicine=======================");
						System.out.println(a.get(15));
						System.out.println(a.get(16));
						System.out.println(a.get(17));
						System.out.println(a.get(18));
						System.out.println(a.get(19));
						System.out.println();
						System.out.println("===============Range 5 Medicine=======================");
						System.out.println(a.get(20));
						System.out.println(a.get(21));
						System.out.println(a.get(22));
						System.out.println(a.get(23));
						System.out.println(a.get(24));
						System.out.println();
						System.out.println("===============Range 6 Medicine=======================");
						System.out.println(a.get(25));
						System.out.println(a.get(26));
						System.out.println();
						System.out.println("===============Range 7 Medicine=======================");
						System.out.println(a.get(27));
						System.out.println(a.get(28));
						System.out.println(a.get(29));
						System.out.println(a.get(30));
						System.out.println(a.get(31));
						System.out.println();
						System.out.println("===============Range 8 Medicine=======================");
						System.out.println(a.get(32));
						System.out.println(a.get(33));
						System.out.println(a.get(34));
						System.out.println(a.get(35));
						System.out.println(a.get(36));
						System.out.println();
						System.out.println("===============Range 9 Medicine=======================");
						System.out.println(a.get(37));
						System.out.println(a.get(38));
						System.out.println(a.get(39));
						System.out.println(a.get(40));
						System.out.println(a.get(41));
						System.out.println();
						System.out.println("-------------------------");
						System.out.println("Press 5 to Go Back");
						System.out.println("-------------------------");
						
						
						String opt = s.next();
						try {
							
						switch (opt) {
						case "1.1": {
							System.out.println(_1_1);
							or1(33.60,0);
							break;
						}
						case "1.2": {
							System.out.println(_1_2);
							or1(55.00,1);
							break;
						}
						case "1.3": {
							System.out.println(_1_3);
							or1(67.20,2);
							break;
						}
						case "1.4": {
							System.out.println(_1_4);
							or1( 73.92,3);
							break;
						}
						case "1.5": {
							System.out.println(_1_5);
							or1( 33.60,4);
							break;
						}
						case "2.1": {
							System.out.println(_2_1);
							or1( 640.64,5);
							break;
						}

						case "2.2": {
							System.out.println(_2_2);
							or1( 733.60,6);
							break;
						}
						case "2.3": {
							System.out.println(_2_3);
							or1(9.70,7);
							break;
						}

						case "2.4" : {
							System.out.println(_2_4);
							or1(39.94,8);
							break;
						}
						case "2.5": {
							System.out.println(_2_5);
							or1(39.94,9);
							break;
						}
						case "3.1": {
							System.out.println(_3_1);
							or1(13.89,10);
							break;
						}
						case "3.2": {
							System.out.println(_3_2);or1(55.29,11);
							break;
						}
						case "3.3": {
							System.out.println(_3_3);or1(105.55,12);
							break;
						}
						case "3.4": {
							System.out.println(_3_4);or1(180.00,13);
							break;
						}
						case "3.5": {
							System.out.println(_3_5);or1(3.66,14);
							break;
						}
						case "4.1" : {
							System.out.println(_4_1);or1(136.00,15);
							break;
						}

						case "4.2": {
							System.out.println(_4_2);or1(104.00,16);
							break;
						}
						case "4.3": {
							System.out.println(_4_3);or1(68.32,17);
							break;
						}
						case "4.4": {
							System.out.println(_4_4);or1(46.42,18);
							break;
						}case "4.5": {
							System.out.println(_4_5);or1(95.20,19);
							break;
						}
						case "5.1": {
							System.out.println(_5_1);
							or1(79.20,20);
							break;
						}
						case "5.2": {
							System.out.println(_5_2);
							or1(216.00,21);
							break;
						}
						case "5.3": {
							System.out.println(_5_3);
							or1(48.00,22);
							break;
						}
						case "5.4": {
							System.out.println(_5_4);
							or1(79.20 ,23);
							break;
						}
						case "5.5": {
							System.out.println(_5_5);
							or1( 33.00,24);
							break;
						}
						case "6.1": {
							System.out.println(_6_1);
							or1(54.30 ,25);
							break;
						}

						case "6.2": {
							System.out.println(_6_2);
							or1(168.00 ,26);
							break;
						}
						case "7.1": {
							System.out.println(_7_1);
							or1(47.20,27);
							break;
						}

						case "7.2" : {
							System.out.println(_7_2);
							or1(104.80,28);
							break;
						}
						case "7.3": {
							System.out.println(_7_3);
							or1(104.80,29);
							break;
						}
						case "7.4": {
							System.out.println(_7_4);
							or1(538.98,30);
							break;
						}
						case "7.5": {
							System.out.println(_7_5);
							or1(180.00,31);
							break;
						}
						case "8.1": {
							System.out.println(_8_1);
							or1(391.50,32);
							break;
						}
						case "8.2": {
							System.out.println(_8_2);
							or1( 178.64,33);
							break;
						}
						case "8.3": {
							System.out.println(_8_3);
							or1( 220.00,34);
							break;
						}
						case "8.4": {
							System.out.println(_8_4);
							or1( 356.74,35);
							break;
						}

						case "8.5": {
							System.out.println(_8_5);
							or1( 297.29,36);
							break;
						}
						case "9.1": {
							System.out.println(_9_1);
							or1(96.00,37);
							break;
						}

						case "9.2" : {
							System.out.println(_9_2);
							or1(503.46,38);
							break;
						}
						case "9.3": {
							System.out.println(_9_3);
							or1(162.30,39);
							break;
						}case "9.4" : {
							System.out.println(_9_4);
							or1(28.00,38);
							break;
						}
						case "9.5": {
							System.out.println(_9_5);
							or1(24.04,39);
							break;
						}
						case "5": {
							Medicines m = new Medicines();
							m.display();
							break;
							}
						default:
						{
							System.err.println("Please Enter valid Input.");
							rangea1to9();
						}
							
						}
						
						
					}
					catch(Exception e)
					{
						e.printStackTrace();
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
        	 rangea1to9();
         }
         else if(a == 2)
         {
        	 Medicines m = new Medicines();
        	 m.display();
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
	
	public void or1(double p,int n)
	{
		System.out.println("Do You Want Order ");
		System.out.println("Press Y for Yes .");
		System.out.println("Press N for No .");
		
		Scanner sc = new Scanner(System.in);
		char opt1 = sc.next().charAt(0);
		
		if(opt1 == 'Y' || opt1 == 'y')
		{   
			list.add(a.get(n));
			payment(p);
			
		}
		else if(opt1 == 'N' || opt1 == 'n')
		{
			rangea1to9();
		}
	}
	
	
   
}
