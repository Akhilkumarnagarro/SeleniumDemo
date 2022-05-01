package com.SeleniumExitTest.testcases;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.LogInPage;

public class LogInTest extends BaseTest {
	@Test(groups = { "test", "invalid", "valid", "include" })
	public void ValidLogIN() {
		LogInPage lg = new LogInPage(driver);
		//lg.LogInButton.click();
		lg.existing_cutomer_email.sendKeys("akhilsony49@gmail.com");
		lg.existing_cutomer_password.sendKeys("theBrand@01");
		lg.logInSubmit_Button.click();

	}

	@Test(groups = { "test", "invalid", "valid", "exclude" })
	public void InValidLogIN() 
	{
		LogInPage lg1 = new LogInPage(driver);
		
		//lg.LogInButton.click();
		lg1.existing_cutomer_email.sendKeys("akhilsoni49@gmail.com");
		lg1.existing_cutomer_password.sendKeys("123456789");
		lg1.logInSubmit_Button.click();

	}

	@Test
	public void InValidLogINWithBlank() {
		LogInPage lg2 = new LogInPage(driver);
		
		//lg.LogInButton.click();
		lg2.existing_cutomer_email.sendKeys("akhilsoni49@gmail.com");
		lg2.existing_cutomer_password.sendKeys(" ");
		lg2.logInSubmit_Button.click();

	}

}
