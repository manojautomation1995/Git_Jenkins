package org.Steps;

import org.Helper.BaseClass;
import org.Locators.FB_Forget;
import org.Locators.FB_Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FB_Steps extends BaseClass{
	public static FB_Login fl;
	public static FB_Forget ff;
	@Given("Get fb URL")
	public void get_fb_url() {
	    openurl("https://www.facebook.com/login/");
	}
	@When("Enter UserName and PassWord for fb page")
	public void enter_user_name_and_pass_word_for_fb_page() {
		fl=new FB_Login();
		filltxt(fl.getEmail(), "smanojvenkat@yahoo.com");
		filltxt(fl.getPassword(), "Test@123");
	}
	@When("Click login Button in fb page")
	public void click_login_button_in_fb_page() {
	    btnclk(fl.getLogin());
	}
	@Then("Get current page title fb login page")
	public void get_current_page_title_fb_login_page() {
	    System.out.println("FB Page login Tittle : "+PageTitle());
	}
	@When("Click forget_password button in fb page")
	public void click_forget_password_button_in_fb_page() {
		ff=new FB_Forget();
		btnclk(ff.getForget());
	}
	@When("Enter PhoneNumber in fb page")
	public void enter_phone_number_in_fb_page() {
	    filltxt(ff.getPhno(), "98776677777");
	}
	@When("Click forget button in fb page")
	public void click_forget_button_in_fb_page() {
	    btnclk(ff.getSearch());
	}
	@Then("Get current page Title in fb forget page")
	public void get_current_page_title_in_fb_forget_page() {
		System.out.println("FB Page Forget Tittle : "+PageTitle());
	}


}
