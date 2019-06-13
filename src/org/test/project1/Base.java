package org.test.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\johnson\\June-8AM\\driver\\cd.exe");
		driver=new ChromeDriver();
		return driver;
	}
     
	public static void loadUrl(String url)
	{
		driver.get(url);
	}
	
	public static void edit(WebElement element, String name)
	{
		element.sendKeys(name);
	}
	
	public static void btnClick(WebElement element)
	{
		element.click();
	}
	
	public static void quitWeb()
	{
		driver.quit();
	}
}
