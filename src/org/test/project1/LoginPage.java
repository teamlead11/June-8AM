package org.test.project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

	public LoginPage() {
PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement newUser;
	
	@FindBy(id="pass")
	private WebElement newPassword;
	
	@FindBy(id="u_0_a")
	private WebElement logClick;

	public WebElement getNewUser() {
		return newUser;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public WebElement getLogClick() {
		return logClick;
	}
}
