package com.gym;

import java.util.Scanner;

public class Login {
private static String Username = "Aditya@2001";
private static String Password = "Adi@123";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the UserName");
		String username = sc.nextLine();
		
		System.out.println("Enter the Password");
		String password = sc.nextLine();
		
	
			
			if(Username.equals(username) && Password.equals(password))
			{
				System.out.println("Sucessful  Login ");
				
				
			}
			else
			{
				System.out.println("Invalid Username and Password !");
			}
			
		
		
		
		
	}

}
