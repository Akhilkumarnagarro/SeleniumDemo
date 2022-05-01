package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	WebDriver driver;

	public AddToCartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement getOnMainPage;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search for products, brands and more']")
	public WebElement searchBox;

	@FindBy(how = How.CLASS_NAME, using = "L0Z3Pu")
	public WebElement searchButton;

	@FindBy(how = How.XPATH, using = "//div[normalize-space()='APPLE iPhone 13 (Blue, 128 GB)']")
	public WebElement productCardclick;

	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	public WebElement addToCartButton;

	public void searchBoxEntry(String productName) {
		searchBox.sendKeys(productName);

	}

	public void serachProductbutton() {
		searchButton.click();
	}

	public void productCardSelection() {
		productCardclick.click();
	}

	public void addingTocart() {
		addToCartButton.click();
	}

}
