package com.SeleniumExitTest.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.RegisterPage;

public class RegisterTest extends BaseTest {

	@Test(groups = { "test", "invalid", "valid", "include" })
	public void RegisterLogIN() throws InterruptedException {
		RegisterPage rg = new RegisterPage(driver);
		
		//rg.getOnMainPage.click();
		//rg.logInButton.click();
		rg.DropdownNewcustLogIn.click();
		rg.new_customer_Rmn.sendKeys("7860786078");
		rg.new_customer_Rmn_submit.click();
		

	}
}
