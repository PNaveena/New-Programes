package com.selenium.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.pageobject.Dev_Module;

public class Printreport {
    public WebDriver driver;
    String Pname = "aaa";
    @BeforeTest
  public void Beforegrid() {
      driver= new FirefoxDriver();
      SignIn.Execute(driver, "bidarapmc", "vsspl");
      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      Dev_Module.Development_module(driver);
      }
  @Test
  public void Test1() throws Exception 
  {
      boolean flag=false;
     Dev_Module.Work_creation(driver);
     driver.switchTo().frame("4007_IFrame");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//button[@class='x-btn-text icon-printer']")).click();
        Thread.sleep(1000);
        driver.getWindowHandle();
        Thread.sleep(1000);
        String Main_Window = driver.getWindowHandle();
        for (String Printreport_Window : driver.getWindowHandles())
        {
        driver.switchTo().window(Printreport_Window);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        }
       List<WebElement> PRcount=driver.findElements(By.xpath("//div/div"));
    int Number=PRcount.size();
    System.out.println("Print report count is : "+Number);
  }
}
