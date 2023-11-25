package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Loginpageclass;

public class LoginTest extends BaseClass {

	@Test
	public void loginfailuretest() {

		Loginpageclass obj = new Loginpageclass(driver);

		obj.loginfunction("Abc@123", "abcde");

		WebElement errormesssage = driver.findElement(By.xpath("//div[@id=\"error_box\"]"));

		String actualmessage = errormesssage.getText();
		String expectedmessage = "The email or password you have entered is invalid.";

		Assert.assertEquals(actualmessage, expectedmessage);

	}

	@Test
	public void loginsuccesstest() {

		Loginpageclass obj1 = new Loginpageclass(driver);
		obj1.loginfunction("Realusername", "Realpassword");
	}

}
