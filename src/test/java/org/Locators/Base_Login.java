package org.Locators;

import org.Helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Login extends BaseClass{
	public Base_Login() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//input[@id='CompanyCode']")
	private WebElement cc;
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement username;
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;

	public WebElement getCc() {
		return cc;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	}
