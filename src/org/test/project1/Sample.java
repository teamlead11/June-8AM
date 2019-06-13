package org.test.project1;

import org.openqa.selenium.WebDriver;

public class Sample extends Base {
	
	public static void main(String [] args)
	{
		WebDriver driver=getDriver();
		loadUrl("https://www.facebook.com/");
		LoginPage lp=new LoginPage();
		edit(lp.getNewUser(), "johnson123");
		edit(lp.getNewPassword(),"123456789");
		btnClick(lp.getLogClick());
		quitWeb();
		
	}
	

}
