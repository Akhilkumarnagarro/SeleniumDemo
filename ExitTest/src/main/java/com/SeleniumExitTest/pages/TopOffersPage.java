package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopOffersPage {

	WebDriver driver;

	public TopOffersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement getOnMainPage;

	@FindBy(how = How.XPATH, using = "//img[@alt='Top Offers']")
	public WebElement TopOffersButton;

	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
	public WebElement ViewAllTopOffersButton;

	@FindBy(how = How.CLASS_NAME, using = "_3LU4EM")
	public WebElement SelectCategoryAsStationary;

}
