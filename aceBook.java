package facebook;
package com.jdbc.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class aceBook {
	
		 public static  void createAccount() 
		    {
			 try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Insert value user");
				    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Diksha@123");
				    PreparedStatement p3=c.prepareStatement("insert into FACEBOOK.facebook(id ,name,email,password,gender,status)values(?,?,?,?,?,?)");
				    Scanner sc=new Scanner(System.in);
				    System.out.println("Enter id");
				    int id=sc.nextInt();
				    System.out.println("Enter name");
				    String name=sc.next();
				    System.out.println("Enter email");
				    String email=sc.next();
				    System.out.println("enter password");
				    int password=sc.nextInt();
				    System.out.println("enter Gender");
				    String gender=sc.next();
				    System.out.println("Enter relationship status");
				    String status=sc.next();
				    p3.setInt(1, id);
				    p3.setString(2, name);
				    p3.setString(3, email);
				    p3.setInt(4,password);
				    p3.setString(5, gender);
				    p3.setString(6, status);
					p3.executeUpdate();
					System.out.println("Account Created");
			 }
			}
		 
		 public static void login() throws ClassNotFoundException, SQLException {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Diksha@123");
			    PreparedStatement p4=c.prepareStatement("select * from FACEBOOK.facebooK where email=?&pasword=? ");
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter email which want to fetch");
	      String email=sc.next();
	      System.out.println("Enter password which want to fetch");
		    int password=sc.nextInt();
		    p4.setString(1, email);
		    p4.setInt(2, password);
		  	
			  ResultSet rs=p4.executeQuery();
			  rs.next();
			  System.out.println(rs.getInt(1));
			  System.out.println(rs.getString(2));
			  System.out.println(rs.getString(3));
			  System.out.println(rs.getInt(4));
			  System.out.println(rs.getString(5));
			  System.out.println(rs.getString(6));
			  
			  System.out.println("Invalid Email and password");
			   
		 }
		    	
		    
		   
		
		
		
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Diksha@123");
	   // PreparedStatement p1=c.prepareStatement("create database FACEBOOK");
	    //p1.execute();
	   // System.out.println("databae created");
	    PreparedStatement p2=c.prepareStatement("create table FACEBOOK.facebook(id int,name varchar(9),email varchar(13), password int, gender varchar(6),status varchar(8)");
	    p2.execute();
	    System.out.println("Table created");
	    
	    Scanner sc=new Scanner(System.in);
		for(;;)
		{
		System.out.println("1.create Account 2.Login");
		switch(sc.nextInt())
		{
		case 1:
		{
			aceBook.createAccount();
			break;
			
		}
		case 2:
		{
			aceBook.login();
			break;
		}
		case 3:
		{
			System.exit(0);
			
		}
		}
		}
	    

			
		}

	}


