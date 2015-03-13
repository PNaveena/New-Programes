package com.selenium.actions;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C_msgs {
public static WebDriver driver;
public static WebElement element=null;
@SuppressWarnings("deprecation")
public static WebElement wa_cmsg()throws Exception
{
	try{
		WebDriverWait wait = new WebDriverWait(driver,30);
        //WebDriverWait Wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ext-mb-text']")));
        WebElement stmt = driver.findElement(By.xpath("//span[contains(text(),'WorkAllotment details has been saved successfully')]"));
        String str= stmt.getText();
        //System.out.println(str);
        Assert.assertEquals("WorkAllotment details has been saved successfully",str);
        System.out.println(str);
    }
    catch (Exception e){
        System.out.println("Failed" +e.getMessage());
    }
	return element;

}
}
