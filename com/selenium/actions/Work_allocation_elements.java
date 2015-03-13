package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Work_allocation_elements {
	public WebDriver driver;
	public static WebElement element = null;
	public static WebElement combo_contractor_name(WebDriver driver)
	{
driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div[@id='workAllotmentuserWindow_cmbContractorName_Container']/div/img")).click();
		return element;
	}
	
	public static WebElement combo_workname(WebDriver driver)
	{
driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div[@id='workAllotmentuserWindow_cmbWorkName_Container']/div/img")).click();

		return element;
	}
	public static WebElement combo_enginnername(WebDriver driver)
	{
		driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/"
				+ "div[@id='workAllotmentuserWindow_cmbEngineerName_Container']/div/img")).click();
		return element;
	}
	public static WebElement combo_wp_workname(WebDriver driver)
	{
driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/div[@id='workInProgressuserWindow_cmbWorkName_Container']/div/img")).click();

		return element;
	}
	public static WebElement combo_cbp_workname(WebDriver driver)
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[@id='contractorBillPreparationuserWindow_cmbWorkName_Container']/div/img")).click();
		return element;
	}
	public static WebElement combo_verifiedBy(WebDriver driver)
	{
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]/div[@id='workInProgressuserWindow_cmbVerifiedBy_Container']/div/img")).click();
		return element;
	}
	/*public static WebElement combo_cbp_workname(WebDriver driver)
	{
	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[@id='contractorBillPreparationuserWindow_cmbWorkName_Container']/div/img")).click();
	return element;
	}*/
	public static WebElement date_Workstart(WebDriver driver)
	{
		
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workAllotmentuserWindow_dtWorkStartedDate_Container']/div/img")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return element;
	}
	public static WebElement date_workcompletion_date(WebDriver driver)
	{
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workAllotmentuserWindow_dtWorkCompletionDate_Container']/div/img")).click();

		return element;
	}
	public static WebElement  txt_EMDAmount(WebDriver driver) {
	       element=driver.findElement(By.xpath("//input[@name='workAllotmentuserWindow_txtEMDAmount']"));  
	            return element;
	       }
	public static WebElement txt_FSDAmount(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@name='workAllotmentuserWindow_txtFSDAmount']"));
		
		return element;
	}
	public static WebElement Sec_reports(WebDriver driver)
	{
		driver.findElement(By.xpath("//span[contains(text(),'Reports')]")).click();
		return element;
	}
	public static WebElement Sec_workname(WebDriver driver)
	{
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div[@id='cmbWorkName_Container']/div/img")).click();
		return element;
	}
	
	
	
	
}
