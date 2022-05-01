package com.DataDrivenTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.LogInPage;
import com.SeleniumExitTest.testcases.BaseTest;

public class LoginTest  {

	WebDriver driver;
	
	public LoginTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	static File file = new File(".//Resources//Config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();

	static {

		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
@BeforeClass
	public void setup() {

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty(prop.getProperty("chromedriverProperty"), prop.getProperty("chromedriverPath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("no browser value given");
		}
	}

@DataProvider(name = "LogInData")
public String[][] getData() {

	String LogInData[][] = {

			{ "akhilsony49@gmail.com", "theBrand@01", "Valid" }, { "tester01@gmail.com", "abc@1", "InValid" },
			{ "tester02@gmail.com", "abcd@1234", "InValid" }, { "tester03@gmail.com", "qwer@1234", "InValid" } };

	return LogInData;
}


	@Test(dataProvider = "LogInData")
	public void LogInTest(String user, String pwd, String exp) {

		LogInPage LG= new LogInPage(driver);
		
		/*
		 * WebElement
		 * LoginButton=(driver.findElement(By.xpath("//a[@class='_1_3w1N']")));
		 * LoginButton.click();
		 */
		
		WebElement existing_cutomer_email = (driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")));
		existing_cutomer_email.clear();
		existing_cutomer_email.sendKeys(user);

		WebElement existing_cutomer_password = (driver.findElement(By.xpath("//input[@type='password']")));
		existing_cutomer_password.clear();
		existing_cutomer_password.sendKeys(pwd);

		WebElement logInSubmit_Button = (driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")));
		logInSubmit_Button.click();

		String exp_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String act_title = driver.getTitle();

		if (exp.equals("Valid")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.xpath("//div[normalize-space()='Logout']")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}

		} else if (exp.equals("InValid")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.xpath("//div[normalize-space()='Logout']")).click();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
	}

	
}
