package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dropdown {
	public WebDriver driver;
	public static WebElement element = null;
	public static WebElement contractor_name(WebDriver driver)
	{
driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div[@id='workAllotmentuserWindow_cmbContractorName_Container']/div/img")).click();
		return element;
	}
	
	public static WebElement work_name(WebDriver driver)
	{
driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div[@id='workAllotmentuserWindow_cmbWorkName_Container']/div/img")).click();

		return element;
	}
	public static WebElement enginner_name(WebDriver driver)
	{
		driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/"
				+ "div[@id='workAllotmentuserWindow_cmbEngineerName_Container']/div/img")).click();
		return element;
	}
	public static WebElement wp_workname(WebDriver driver)
	{
driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/div[@id='workInProgressuserWindow_cmbWorkName_Container']/div/img")).click();

		return element;
	}
	public static WebElement cbp_workname(WebDriver driver)
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[@id='contractorBillPreparationuserWindow_cmbWorkName_Container']/div/img")).click();
		return element;
	}
	
	
	
	
	
}
