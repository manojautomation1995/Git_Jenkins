package org.Locators;

import org.Helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Forget extends BaseClass{
	public FB_Forget() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='_97w4']")
	private WebElement forget;
	@FindBy(xpath = "//input[@id='identify_email']")
	private WebElement phno;
	@FindBy(xpath = "//button[@id='did_submit']")
	private WebElement search;

	public WebElement getForget() {
		return forget;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSearch() {
		return search;
	}
}
