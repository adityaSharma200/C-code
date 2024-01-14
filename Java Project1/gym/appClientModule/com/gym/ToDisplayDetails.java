package com.gym;

public class ToDisplayDetails {
static String Name;
int Age;
double Number;
String Address;
String Gender;
	
	
	
	
	
	public  void  Display(String name,int age,double number,String address,String gender)
	{
		this.Name=name;
		this.Age=age;
		this.Number=number;
		this.Address=address;
		this.Gender=gender;
		
		System.out.println("Name" +name +"Age" +age +"Number"+number + "Address"+address+ "Gender"+gender);
		
	}
	
	
	public static void main(String[] args) {
		ToDisplayDetails tdd = new ToDisplayDetails();
		tdd.Display("Aditya", 21, 961904409, "patri pool midc rosd ", "male");

	}

}
