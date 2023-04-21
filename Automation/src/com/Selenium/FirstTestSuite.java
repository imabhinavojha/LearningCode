package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestSuite {
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://www.total-qa.com");
		String actual = driver.getTitle();
		String expected = "Total-QA - Future of Software Testing";
		Assert.assertEquals(actual, expected);
	}

}