package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeadings {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.guru99.com/");
		 List<WebElement> ele = driver.findElements(By.xpath("//div[@class='row featured-boxes']//h4"));
		for (WebElement w : ele) {
			String text = w.getText();
			System.out.println(text);
		}
	}

}
