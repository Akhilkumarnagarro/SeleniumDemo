package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	WebDriver driver;

	public LogInPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	  @FindBy(how = How.XPATH,using = "//a[@class='_1_3w1N']") 
	  public WebElement LogInButton;
	 
	
	@FindBy(how = How.XPATH, using = "//input[@class='_2IX_2- VJZDxU']")
	public WebElement existing_cutomer_email;

	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public WebElement existing_cutomer_password;

	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	public WebElement logInSubmit_Button;

	public void enterEmail(String email) {
		existing_cutomer_email.sendKeys(email);
	}

	public void enterPassword(String pass) {
		existing_cutomer_password.sendKeys(pass);
	}

	public void LogIn() {
		logInSubmit_Button.click();
	}
}
