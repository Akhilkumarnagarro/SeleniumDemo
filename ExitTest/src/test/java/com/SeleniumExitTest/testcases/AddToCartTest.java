package com.SeleniumExitTest.testcases;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.AddToCartPage;

public class AddToCartTest extends BaseTest {

	@Test(groups = { "test", "invalid", "valid", "include" })
	public void searchProduct() {

		AddToCartPage searchProduct = new AddToCartPage(driver);
		//searchProduct.getOnMainPage.click();

		searchProduct.searchBox.sendKeys("iphone 13");
		searchProduct.searchButton.click();

		searchProduct.productCardclick.click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		searchProduct.addToCartButton.click();
		// Thread.sleep(2000);

		driver.switchTo().window(parentId);

	}

}
