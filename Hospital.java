package com.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Hospital {
	Scanner sc=new Scanner(System.in);
	List l=new ArrayList();
	Doctor d=new Doctor();
	public void addToken()
	{
		int tokenno=l.size()+1;
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter cno");
		long cno=sc.nextLong();
		System.out.println("etner address");
		String address=sc.next();
		Patient p=new Patient(tokenno,name,cno,address);
		if(l.add(p))
		{
			System.out.println("pateint is added");
		}
		else
		{
			System.out.println("pateint is  not added");
		}
	}
	public void removeToken()
	{
		System.out.println("enter token no");
		int token=sc.nextInt();//1
		int index=0;//
		for(int i=0;i<l.size();i++)
		{
	    	Patient p=	(Patient)l.get(i);
		  if(p.token==token)
		  {
			  l.remove(p);
			  index=i;//0
			  System.out.println("pateint token cancelled");
			  dec(index);
			  return;
		  }
		
		}
		System.out.println("token number is not existing");
		removeToken();
	}
	public void listOfPatient()
	{
		System.out.println("enter username");
		String name=sc.next();
		System.out.println("enter pswd");
		int pswd=sc.nextInt();
		if(name.equals(d.name))
		{
			if(pswd==d.pswd)
			{
				for(int i=0;i<l.size();i++)
				{
					Patient p=(Patient)l.get(i);
					System.out.println("enter amount how mcch they have pay");
					p.money=sc.nextDouble();
					System.out.println("visit again ");
				}
			}
			else {
				System.out.println("inccorect pass");
			}
				
		}
		else
		{
			System.out.println("user name wrong wrong");
		}
		
	}
	public void bill()
	{
		System.out.println("enter token no");
		int tokenno=sc.nextInt();
		System.out.println("enter patient name");
		String name=sc.next();
		for(int i=0;i<l.size();i++)
		{
			Patient p=(Patient)l.get(i);
			if(tokenno==p.token&&name.equalsIgnoreCase(p.name))
			{
				System.out.println("bill="+p.money);
				double bal=sc.nextDouble();
				if(bal>=p.money)
				{
					System.out.println("please collect bal"+(bal-p.money));
					System.out.println("thank you come again");
					p.money=0;
					return;
					
				}
				else
				{
					System.out.println("you have to pay "+p.money);
					System.out.println("1.pay now    2.pay later");
					int choice=sc.nextInt();
					if(choice==1)
					{
						bill();
						
					}
					else
					{
						return;
					}
					
				}
			}
		}
		System.out.println("token is existing");
		
	}
	public void dec(int index)
	{
		for(int i=index;i<l.size();i++)
		{
			Patient p=	(Patient)l.get(i);
			p.token--;
		}
		
	}

}
