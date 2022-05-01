package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {

	WebDriver driver;

	public CareerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement getOnMainPage;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Careers']")
	public WebElement CareerButtonHYPERLINK;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Explore Jobs']")
	public WebElement CareerSearchBox;

	@FindBy(how = How.XPATH, using = "//span[@class='input-group-btn search-hvr-bt']")
	public WebElement CareerSearchButton;

	@FindBy(how = How.XPATH, using = "//a[@class='btn cl-ck-chkok-btn']")
	public WebElement ClosePopUpContinue;

	/*
	 * @FindBy(how = How.XPATH,using = "//a[@id='candidate-login-before']") public
	 * WebElement CandidateLoginButton;
	 */
	@FindBy(how = How.XPATH, using = "//input[@placeholder='KEYWORDS']")
	public WebElement RecentOpeningSearchBox;

	@FindBy(how = How.XPATH, using = "//img[@class='search-svg']")
	public WebElement RecentOpeningSearchButton;

	@FindBy(how = How.XPATH, using = "//h3[@title='Senior QA Engineer- Cleartrip']")
	public WebElement SelectOpening;

}
