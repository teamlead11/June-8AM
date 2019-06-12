package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\New folder (2)\\task\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
			System.out.println("pop up closed");
		}
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles",Keys.ENTER);
		
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@id='container']/div/div[3]/div[2]/div/div[2]/div//div[contains(text(),'GB')]"));
		
		
		
	}

}
