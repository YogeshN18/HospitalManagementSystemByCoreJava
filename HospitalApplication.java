package com.hospital;
import java.util.Scanner;

public class HospitalApplication {

	public static void main(String[] args) {
		Hospital h=new Hospital();
		for(;;)
		{
			System.out.println("1.add token 2.remove token 3.List 4.bill");
		   switch(h.sc.nextInt())
		   {
		   case 1:
		   {
			   h.addToken();
		   }
		   break;
		   case 2:
		   {
			   h.removeToken();
		   }
		   break;
		   case 3:
		   {
			   h.listOfPatient();
		   }
		   break;
		   case 4:
		   {
			   h.bill();
		   }
		   break;
		   case 5:
		   {
			   System.exit(1);
		   }
		   break;
		   }
		   
		}
		
	}


		

	}


