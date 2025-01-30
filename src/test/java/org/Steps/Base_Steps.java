package org.Steps;

import org.Helper.BaseClass;
import org.Locators.Base_Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Base_Steps extends BaseClass{
	Base_Login bl;
	@Given("Get fb URL for Base")
	public void get_fb_url_for_base() {
	    openurl("https://loginqa.cx360.net/Account/Login");
	}
	@When("Enter {string} {string} {string} for hotal page")
	public void enter_for_hotal_page(String cc, String user, String pass) {
		bl=new Base_Login();
		filltxt(bl.getCc(), cc);
		filltxt(bl.getUsername(), user);
		filltxt(bl.getPassword(), pass);
	}
	@When("Click login Button in Base page")
	public void click_login_button_in_base_page() {
	    btnclk(bl.getLogin());
	}
	@Then("Get current page title base login page")
	public void get_current_page_title_base_login_page() {
	    System.out.println("Base app login page title :"+PageTitle());
	}
}
