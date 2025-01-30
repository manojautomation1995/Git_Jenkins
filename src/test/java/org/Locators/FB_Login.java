package org.Locators;

import org.Helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Login extends BaseClass{
	public FB_Login() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;
	@FindBy(xpath = "//button[@id='loginButton']")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
