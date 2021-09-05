package com.onlinetest.test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTest {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
	}

	@Test
	public void f() {
		driver.get("http://localhost:4200/login");
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement btnLogin = driver.findElement(By.id("login"));
		username.sendKeys("aman2002");
		password.sendKeys("12345");
		btnLogin.click();
		String actualUrl = "http://localhost:4200/login";
		String expectedUrl = driver.getCurrentUrl();
		System.out.println(expectedUrl);
		org.testng.Assert.assertEquals(actualUrl, expectedUrl);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
