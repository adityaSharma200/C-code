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
				
				a.add("1.1   2 Baconil Tts 20 14 MG Patch 7  ₹:- 640.64");
				a.add("1.2   2 Baconil Tts 30 21 MG Patch 7  ₹:- 733.60");
				a.add("1.3   2 Can 150 MG Tablet 1           ₹:- 9.70");
				a.add("1.4   2 Dep 20 MG Tablet 10           ₹:- 39.94");
				a.add("1.5   2 Dep 20 MG Tablet 12           ₹:- 39.94");
			
//================================================================================================================================		
				
			 	Range1to9  _3_1 =  new Range1to9(1,"","",,);
				Range1to9  _3_2 =  new Range1to9(2,"","",,);
				Range1to9  _3_3 =  new Range1to9(3,"","",,);
				Range1to9  _3_4 =  new Range1to9(4,"","",,);
				Range1to9  _3_5 =  new Range1to9(5,"","",,);
				
				a.add("1.1   ₹:-");
				a.add("1.2   ₹:-");
				a.add("1.3   ₹:-");
				a.add("1.4   ₹:-");
				a.add("1.5   ₹:-");
					
//================================================================================================================================		
						
					 	Range1to9  _4_1 =  new Range1to9(1,"","",,);
						Range1to9  _4_2 =  new Range1to9(2,"","",,);
						Range1to9  _4_3 =  new Range1to9(2,"","",,);
						Range1to9  _4_4 =  new Range1to9(2,"","",,);
						Range1to9  _4_5 =  new Range1to9(2,"","",,);
						
						a.add("1.1   ₹:-");
						a.add("1.2   ₹:-");
						a.add("1.3   ₹:-");
						a.add("1.4   ₹:-");
						a.add("1.5   ₹:-");
										
//================================================================================================================================		
							
					 	Range1to9  _5_1 =  new Range1to9(2,"","",,);
						Range1to9  _5_2 =  new Range1to9(2,"","",,);
						Range1to9  _5_3 =  new Range1to9(2,"","",,);
						Range1to9  _5_4 =  new Range1to9(2,"","",,);
						Range1to9  _5_5 =  new Range1to9(2,"","",,);
								
						a.add("1.1   ₹:-");
						a.add("1.2   ₹:-");
						a.add("1.3   ₹:-");
						a.add("1.4   ₹:-");
						a.add("1.5   ₹:-");
//================================================================================================================================		
						
					 	Range1to9  _6_1 =  new Range1to9(2,"","",,);
						Range1to9  _6_2 =  new Range1to9(2,"","",,);
						Range1to9  _6_3 =  new Range1to9(2,"","",,);
						Range1to9  _6_4 =  new Range1to9(2,"","",,);
						Range1to9  _6_5 =  new Range1to9(2,"","",,);
								
						a.add("1.1   ₹:-");
						a.add("1.2   ₹:-");
						a.add("1.3   ₹:-");
						a.add("1.4   ₹:-");
						a.add("1.5   ₹:-");		
			
//================================================================================================================================		
						
					 	Range1to9  _7_1 =  new Range1to9(2,"","",,);
						Range1to9  _7_2 =  new Range1to9(2,"","",,);
						Range1to9  _7_3 =  new Range1to9(2,"","",,);
						Range1to9  _7_4 =  new Range1to9(2,"","",,);
						Range1to9  _7_5 =  new Range1to9(2,"","",,);
								
						a.add("1.1   ₹:-");
						a.add("1.2   ₹:-");
						a.add("1.3   ₹:-");
						a.add("1.4   ₹:-");
						a.add("1.5   ₹:-");	
//================================================================================================================================		
						
					 	Range1to9  _8_1 =  new Range1to9(2,"","",,);
						Range1to9  _8_2 =  new Range1to9(2,"","",,);
						Range1to9  _8_3 =  new Range1to9(2,"","",,);
						Range1to9  _8_4 =  new Range1to9(2,"","",,);
						Range1to9  _8_5 =  new Range1to9(2,"","",,);
								
						a.add("8.1   ₹:-");
						a.add("8.2   ₹:-");
						a.add("8.3   ₹:-");
						a.add("8.4   ₹:-");
						a.add("8.5   ₹:-");
			
//================================================================================================================================		
						
					 	Range1to9  _9_1 =  new Range1to9(1,"9 M Fol Softgel Capsule 10","Decisive Pharma",10,96.00);
						Range1to9  _9_2 =  new Range1to9(2,"9 Pm 50 MCG Eye Drops 2.5 ML","Cipla Ltd.",3,503.46);
						Range1to9  _9_3 =  new Range1to9(3,"90e 50 MG Tablet 4","Khandelwal Laboratories Ltd",4,162.30);
						Range1to9  _9_4 =  new Range1to9(4,"98 Control Fc Tablet 10","Omega Remedies Pvt Ltd",10,28.00);
						Range1to9  _9_5 =  new Range1to9(5,"99f 650 MG Tablet 15","Fdc Ltd.",15,24.04);
								
						a.add("9.1  9 M Fol Softgel Capsule 10 ₹:-96.00");
						a.add("9.2  9 Pm 50 MCG Eye Drops 2.5 ML ₹:-503.46");
						a.add("9.3  90e 50 MG Tablet 4 ₹:-162.30");
						a.add("9.4   98 Control Fc Tablet 10₹:-28.00");
						a.add("9.5   99f 650 MG Tablet 15₹:-24.04");		
			
			
	}
   
}
