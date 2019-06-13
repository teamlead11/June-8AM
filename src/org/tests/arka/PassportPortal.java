package org.tests.arka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassportPortal {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement location = driver.findElement(By.id("dcdrLocation"));
		Select select = new Select(location);
		select.selectByVisibleText("Kolkata");
		driver.findElement(By.id("givenName")).sendKeys("Arka");
		driver.findElement(By.id("surname")).sendKeys("Sengupta");
		driver.findElement(By.id("dob")).sendKeys(" 25/11/1993");
		driver.findElement(By.id("email")).sendKeys("arka.sengupta@live.com");
		driver.findElement(By.id("emailloginSameyes")).click();
		driver.findElement(By.id("pwd")).sendKeys("arka1234");
		driver.findElement(By.id("confirmPwd")).sendKeys("arka1234");
		/*
		 * Select question = new Select(driver.findElement(By.id("hintQues")));
		 * question.selectByIndex(1);
		 */
		new Select(driver.findElement(By.id("hintQues"))).selectByIndex(1);
		driver.findElement(By.id("hintAns")).sendKeys("Kolkata");
		Thread.sleep(10000);
		driver.quit();
	}
}
