package com.SeleniumExitTest.testcases;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.FlipkartWholesalePage;

public class FlipkartWholeasaleTest extends BaseTest {
	@Test (groups = { "test", "invalid", "valid", "include" })
	public void FlipkartWholesalepage() 
	{
		FlipkartWholesalePage FWP= new FlipkartWholesalePage(driver);
		FWP.getOnMainPage.click();
		FWP.FlipkartWholeasleButton.click();
	}

}
