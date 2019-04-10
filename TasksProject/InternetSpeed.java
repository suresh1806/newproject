package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeed {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://fast.com/");
		Thread.sleep(4000);
		WebElement w = driver.findElement(By.id("speed-value"));
		String text = w.getText();
		System.out.println(text);
	}

}
