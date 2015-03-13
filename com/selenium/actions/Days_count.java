package com.selenium.actions;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Days_count {
	public WebDriver driver;
	public static WebElement element = null;
	public static WebElement counting_days(WebDriver driver)
	{
		int mon[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int y1 = 0,y2 = 0,m1 = 0,m2 = 0,d1 = 0,d2 = 0;
		int count=0,i;
		 for(i=y1;i<y2;i++)
		    {
			  
		    if(i%4==0)
		    count+=366;
		    else
		    count+=365;
		    }
		 count-=month(m1,y1);
		  count-=d1;
		  //to add todate wated days
		  count+=month(m2,y2);
		  count+=d2;
		  System.out.println("The no. of days b/w the 2 dates = "+count);
		  Scanner sc=new Scanner(System.in);
			System.out.println("enter date in dd/mm/yyyy");
			int d11=sc.nextInt();
			System.out.println("month");
			int m11=sc.nextInt();
			System.out.println("year");   //2012
			int year1=sc.nextInt();
			
			System.out.println("enter date in dd/mm/yyyy");
			int d21=sc.nextInt();
			System.out.println("month");
			int m21=sc.nextInt();
			System.out.println("year");  //2014
			int year2=sc.nextInt();
			//d above code is to read input from keyboard
			 //
			  if(year2>=year1)
			  days(year1,year2,m11,m21,d11,d21);
			  else
			  days(year2,year1,m21,m11,d21,d11);
			  
		return element;
	}
	private static void days(int year1, int year2, int m11, int m21, int d11,
			int d21) {
		// TODO Auto-generated method stub
		
	}
	private static int month(int m1, int y1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
