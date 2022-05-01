package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BecomeASellerPage {

	WebDriver driver;

	public BecomeASellerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement getOnMainPage;

	@FindBy(how = How.XPATH, using = "//span[@class='hDTmm5'][normalize-space()='Become a Seller']")
	public WebElement BecomeASellerButton;

	@FindBy(how = How.XPATH, using = "//div[@class='styles__TabGroupWrapper-sc-5eo5sg-0 gsNrbL']//div[@class='label'][normalize-space()='HOW TO REGISTER']")
	public WebElement HowToRegisterHyperLink;

	@FindBy(how = How.XPATH, using = "//button[@class='styles__RegisterButton-sc-1kfv72o-1 dybYiu']//span[contains(text(),'Register Now')]")
	public WebElement RegisterNowButton;

	@FindBy(how = How.CLASS_NAME, using = "ng-binding")
	public WebElement PopUpDontAllowButton;
}
