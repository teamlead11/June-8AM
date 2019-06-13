package org.new1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railway {
	static String name = "";
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\New folder (2)\\task\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://enquiry.indianrail.gov.in/ntes/index.html");
		Thread.sleep(3000);
		WebElement box = driver.findElement(By.id("ui-id-3"));
		box.click();
		driver.findElement(By.id("station1")).sendKeys("chennai ce");
		Thread.sleep(5000);
		WebElement W = driver.findElement(By.id("station2"));
		W.sendKeys("coimbatore n");
		dept("11:00","12:00");
		
		
	}
	

	public static void dept(String dept, String arrt) throws Throwable {
		Thread.sleep(5000);
		List<WebElement> rows = driver.findElements(By.xpath(
				"//td[@id='upperMostTD']/div//following-sibling::table/tbody/tr/td/div//div[3]//div[2]//table/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {
			WebElement r = rows.get(i);
			List<WebElement> cols = r.findElements(By.tagName("td"));
			for (int j = 1; j <cols.size(); j++) {
				name = cols.get(j).getText();
				excel();
			}
		}

	}

	public static void excel() throws Throwable {

		File loc = new File("C:\\Users\\DELL\\Desktop\\karthi\\task\\excel\\Book1.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("test");
		
		for (int i = 0; i <=20; i++) {
			
		Row r1 = s.createRow(i);
		for (int k = 0; k <=20; k++) {
				
		Cell c = r1.createCell(k);
		
		c.setCellValue(name);
		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);
		
	}
}
		System.out.println("task completed");
	}}

