package com.pack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Menu 

{
	static int sum=0;
	public void store()
	{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	     
	     Connection connection;
			
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root","root");
				
				Statement statement=connection.createStatement();
		System.out.println("welcome to store available items are:");
		ResultSet rs=statement.executeQuery("SELECT * FROM db.grocery");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"."+rs.getString(2));
			
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter required item");
		int i=sc.nextInt();
		{
		if(i==1)
		{
			System.out.println("the available items in electronics section:");
		ResultSet	rs1=statement.executeQuery("select * from db.electronics");
		
		while(rs1.next()
				) 
		{
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4));
			
		}
		
		System.out.println("enter your choice");
		int c=sc.nextInt();
		if(c==101)
		{
			ResultSet rs11=statement.executeQuery("select * from db.electronics where id='"+c+"'");
			Statement stmt=connection.createStatement();
			while(rs11.next()
					) 
			{
				System.out.println(rs11.getInt(1)+" "+rs11.getString(2)+" "+rs11.getInt(3)+" "+rs11.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs11.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//stmt.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
		}
		}
		if(c==102)
		{
			ResultSet rs12=statement.executeQuery("select * from db.electronics where id='"+c+"'");
			
			while(rs12.next()
					) 
			{
				System.out.println(rs12.getInt(1)+" "+rs12.getString(2)+" "+rs12.getInt(3)+" "+rs12.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs12.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
	//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
		}
		}
		if(c==103)
		{
			ResultSet rs13=statement.executeQuery("select * from db.electronics where id='"+c+"'");
			
			while(rs13.next()
					) 
			{
				System.out.println(rs13.getInt(1)+" "+rs13.getString(2)+" "+rs13.getInt(3)+" "+rs13.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs13.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`sum`) values('"+sum+"')");
			
		}
		}if(c==104)
		{
			ResultSet rs14=statement.executeQuery("select * from db.electronics where id='"+c+"'");
			
			while(rs14.next()
					) 
			{
				System.out.println(rs14.getInt(1)+" "+rs14.getString(2)+" "+rs14.getInt(3)+" "+rs14.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs14.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}
		}
		else if(i==2)
		{
			System.out.println("the available items in clothes section:");
		ResultSet	rs2=statement.executeQuery("select * from db.clothes");
		Statement stmt=connection.createStatement();
		while(rs2.next()
				) 
		{
			System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getInt(3)+" "+rs2.getInt(4));
		}
		
		System.out.println("enter your choice");
		int c=sc.nextInt();
		if(c==11)
		{
			ResultSet rs11=statement.executeQuery("select * from db.clothes where id='"+c+"'");
			
			while(rs11.next()
					) 
			{
				System.out.println(rs11.getInt(1)+" "+rs11.getString(2)+" "+rs11.getInt(3)+" "+rs11.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs11.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
		//	statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			}
		}
		if(c==12)
		{
			ResultSet rs12=statement.executeQuery("select * from db.clothes where id='"+c+"'");
			
			while(rs12.next()
					) 
			{
				System.out.println(rs12.getInt(1)+" "+rs12.getString(2)+" "+rs12.getInt(3)+" "+rs12.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs12.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`itemid`,`itemname`,`purchasedquantity`,`cost`) values('"+c+"','"+rs12.getString(2)+"','"+r+"','"+cost+"')");
			
		}
		}if(c==13)
		{
			ResultSet rs13=statement.executeQuery("select * from db.clothes where id='"+c+"'");
			
			while(rs13.next()
					) 
			{
				System.out.println(rs13.getInt(1)+" "+rs13.getString(2)+" "+rs13.getInt(3)+" "+rs13.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs13.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}if(c==14)
		{
			ResultSet rs14=statement.executeQuery("select * from db.clothes where id='"+c+"'");
			
			while(rs14.next()
					) 
			{
				System.out.println(rs14.getInt(1)+" "+rs14.getString(2)+" "+rs14.getInt(3)+" "+rs14.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs14.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}
		}
		
		else if(i==3)
		{
			System.out.println("the available items in bath section :");
		ResultSet	rs3=statement.executeQuery("select * from db.Bath");
		
		while(rs3.next()
				) 
		{
			System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getInt(3)+" "+rs3.getInt(4));
			
		}		System.out.println("enter your choice");
		int c=sc.nextInt();
		if(c==1)
		{
			ResultSet rs11=statement.executeQuery("select * from db.bath where id='"+c+"'");
			
			while(rs11.next()
					) 
			{
				System.out.println(rs11.getInt(1)+" "+rs11.getString(2)+" "+rs11.getInt(3)+" "+rs11.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs11.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
		//	statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}if(c==2)
		{
			ResultSet rs12=statement.executeQuery("select * from db.bath where id='"+c+"'");
			
			while(rs12.next()
					) 
			{
				System.out.println(rs12.getInt(1)+" "+rs12.getString(2)+" "+rs12.getInt(3)+" "+rs12.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs12.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}if(c==3)
		{
			ResultSet rs13=statement.executeQuery("select * from db.bath where id='"+c+"'");
			
			while(rs13.next()
					) 
			{
				System.out.println(rs13.getInt(1)+" "+rs13.getString(2)+" "+rs13.getInt(3)+" "+rs13.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs13.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}
			else if(c==4)
		{
			ResultSet rs14=statement.executeQuery("select * from db.bath where id='"+c+"'");
			
			while(rs14.next()
					) 
			{
				System.out.println(rs14.getInt(1)+" "+rs14.getString(2)+" "+rs14.getInt(3)+" "+rs14.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs14.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}

		}
		else if(i==4)
		{
			System.out.println("the available  items in kitchen section: ");
		ResultSet	rs4=statement.executeQuery("select * from db.kitchen");
		
		while(rs4.next()
				) 
		{
			System.out.println(rs4.getInt(1)+" "+rs4.getString(2)+" "+rs4.getInt(3)+" "+rs4.getInt(4));
		}
				System.out.println("enter your choice");
		int c=sc.nextInt();
		if(c==10)
		{
			ResultSet rs101=statement.executeQuery("select * from db.kitchen  where id='"+c+"'");
			
			while(rs101.next()
					) 
			{
				System.out.println(rs101.getInt(1)+" "+rs101.getString(2)+" "+rs101.getInt(3)+" "+rs101.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs101.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			}
		}
		 if(c==20)
		{
			ResultSet rs102=statement.executeQuery("select * from db.kitchen where id='"+c+"'");
			
			while(rs102.next()
					) 
			{
				System.out.println(rs102.getInt(1)+" "+rs102.getString(2)+" "+rs102.getInt(3)+" "+rs102.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs102.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}if(c==30)
		{
			ResultSet rs13=statement.executeQuery("select * from db.kitchen where id='"+c+"'");
			
			while(rs13.next()
					) 
			{
				System.out.println(rs13.getInt(1)+" "+rs13.getString(2)+" "+rs13.getInt(3)+" "+rs13.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs13.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
		}
		}if(c==40)
		{
			ResultSet rs14=statement.executeQuery("select * from db.kitchen where id='"+c+"'");
			
			while(rs14.next()
					) 
			{
				System.out.println(rs14.getInt(1)+" "+rs14.getString(2)+" "+rs14.getInt(3)+" "+rs14.getInt(4));
				
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs14.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			//statement.executeUpdate("insert into db.cart(`totalbill`) values('"+sum+"')");
			
			}
		}
		}
		}
		System.out.println("total bill is:"+sum);
			
	/*		if(sum>50000)
			{
			System.out.println("start again");
			System.out.println("it is more than your budget");
			store();
			
		}
			else
			{
				System.out.println("tatal bill is:"+sum);
			}
			
		
		*/
		
		System.out.println("would like to purchase more items:yes/no");
		String r="yes";
		String y=sc.next();
		if(y.equals(r))
		{
			store();
		}
		else {
			System.out.println("happy shopping");
		}
		

		
		
	
		
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		Menu m=new Menu();
		m.store();
		
	}
}
