package com.selenium.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.selenium.actions.SignIn;

public class Year_selection {
  public WebDriver driver;
  static String oldyear="2012-2013";
  static String drop;
  @BeforeClass
  
  public void login() throws InterruptedException {
         driver = new FirefoxDriver();

          driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
          driver.manage().window().maximize();

          SignIn.Execute(driver, "bidarapmc", "vsspl");
  		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  		driver.manage().window().maximize();
  		driver.switchTo().defaultContent();
  }
  
   
 
  @Test
   public void cnt()
	{
		//Dropdown.work_name(driver);
	   driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/button")).click();

		List<WebElement> element =driver.findElements(By.xpath("//div[@class='x-layer x-menu']/ul/li"));
		 int num = element.size();
		 System.out.println("count="+num);
		 boolean flag = false;
		for(int i=1;i<=num;i++)
		 {
			drop=driver.findElement(By.xpath("//div[@class='x-layer x-menu']/ul/li["+i+"]")).getText();
			
			if(drop.equals(oldyear))
			{
				driver.findElement(By.xpath("//div[@class='x-layer x-menu']/ul/li["+i+"]")).getText();
				driver.findElement(By.xpath("//div[@class='x-layer x-menu']/ul/li["+i+"]")).click();
				flag=true;
				break;
			}
			
		 }
		 if(flag)
		 {
			 System.out.println("found work name: "+drop);
		 }
		 else
		 {
			 System.out.println("not found");
		 }
		 
		
		 
	}

 

}
