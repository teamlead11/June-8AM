package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



public class Launch {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\GO\\Launch\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.className("close"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btn).click().perform();
		Thread.sleep(1000);
		WebElement p = driver.findElement(By.id("wrapper"));
		acc.contextClick(p).perform();
		Robot r = new Robot();
		for(int i=1;i<=3;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		};
		r.keyPress(KeyEvent.VK_ENTER);
				
	/*	
		WebElement s = driver.findElement(By.xpath("//p[contains(text(),'Greens Technology')]"));
		
		acc.doubleClick(s);
		Thread.sleep(2000);
		acc.contextClick(s).perform();
		Robot r = new Robot();
		for(int i=1;i<=3;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		};
		r.keyPress(KeyEvent.VK_ENTER);   */
				
	}

}
