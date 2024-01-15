package medicien;

import java.util.Scanner;

public class HealthConditions extends Home{
	
	int nu;
	String Companyname;
	String Brandname;
	int pack;
	double price;
	Home h = new Home();
	
	Scanner s = new Scanner(System.in);
	
	HealthConditions()
	{
		
	}
	HealthConditions(int nu,String Brandname,String Companyname,int pack,double price)
	{
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
	static 
	{
		System.out.println("<--------------------------->");
		System.out.println("  ❤ Health Conditions ❤  ");
		System.out.println("<--------------------------->");
	}
	
	
	
	
	public void display()
	{
		
		

		System.out.println("Chosse any One Option .");
		System.out.println("1. Bone and Joint Care");
		System.out.println("2. Pain Relief");
		System.out.println("3. Liver Care");
		System.out.println("4. Stomach Care");
		System.out.println("5. Go Back To Home Page");
	

		int n = s.nextInt();

		switch (n) {
		case 1: {
			
			BoneandJoint bj = new BoneandJoint();
			bj.bj();
			break;
		}
		case 2: {
			
			PainRelief p =new PainRelief();
			p.pf();
			break;
		}
		case 3: {
			
			break;
		}
		case 4 :
		{
			StomachCare Sc=new StomachCare();
			Sc.sc();
			break;
		}
		case 5: {
			
			h.home();
			break;
		}
		
		default: {
			System.err.println("Enter valid input .");
			display();
		}
		}
		
		
}

	
}