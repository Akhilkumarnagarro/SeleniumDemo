package com.SeleniumExitTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TravelPage {
	
	WebDriver driver;
	
	

	public TravelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how = How.XPATH,using = "//img[@alt='Travel']")
	public WebElement  TravelButton;
	
	
	@FindBy(how = How.XPATH,using = "//label[@for='ONE_WAY']//div[@class='_1XFPmK']")
	public WebElement SelectTripTypeRadioButton;
	
	@FindBy(how = How.XPATH,using = "//input[@name='0-departcity']")
	public WebElement DepartureCity;
	
	@FindBy(how = How.XPATH,using ="//input[@name='0-arrivalcity']" )
	public WebElement DestinationCity;
	
	@FindBy(how = How.XPATH,using = "//input[@name='0-datefrom']")
	public WebElement DepartureDateSelector;
	
	@FindBy(how = How.XPATH,using = "//input[@name='0-dateto']")
	public WebElement ArrivalDateSelector;
	
	@FindBy(how = How.XPATH,using = "//div[@class='_2g4weU _3mOkvM']//div[1]//div[2]//div[1]//div[3]//button[1]//*[name()='svg']")
	public WebElement AddadultButton;
	
	@FindBy(how = How.XPATH,using = "//div[contains(text(),'Premium Economy')]")
	public WebElement SelectCabin;
	
	@FindBy(how = How.XPATH,using = "//button[@class='aC49_F _14Me7y']")
	public WebElement DoneButton;
	

}
