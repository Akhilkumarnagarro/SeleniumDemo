package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement getOnMainPage;
	
    @FindBy(how = How.XPATH,using = "//div[@class='_3wJI0x']")
	public WebElement DropdownNewcustLogIn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@class='_2IX_2- VJZDxU']")
	public WebElement new_customer_Rmn;

	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	public WebElement new_customer_Rmn_submit;

}
