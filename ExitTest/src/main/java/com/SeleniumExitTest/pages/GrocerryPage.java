package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GrocerryPage {

	WebDriver driver;

	public GrocerryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement getOnMainPage;

	@FindBy(how = How.XPATH, using = "//img[@alt='Grocery']")
	public WebElement GrocerryPageHyperlink;

	@FindBy(xpath = "//button[@class='_2KpZ6l _1IsWyb _3dESVI']")
	public WebElement AcceptCurrentLocation;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search grocery products']")
	public WebElement GrocerryPageSearchBox;

	@FindBy(how = How.XPATH, using = "//button[@class='L0Z3Pu']")
	public WebElement GrocerrySearchButton;
}
