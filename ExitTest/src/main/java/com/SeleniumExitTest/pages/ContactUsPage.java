package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement getOnMainPage;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Contact Us']")
	public WebElement ContactUsButton;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Payment']")
	public WebElement PaymentButton;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]")
	public WebElement CreditCardEmiPaymentOption;

}
