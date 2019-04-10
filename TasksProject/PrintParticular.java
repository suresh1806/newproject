package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintParticular {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.guru99.com/");
List<WebElement> e = driver.findElements(By.xpath("//div[@class='row featured-boxes']/div/div[@class='featured-box cloumnsize1']//parent::ul[1]"));
for (int i = 0; i < e.size(); i++) {
	WebElement w = e.get(i);
	String name = w.getText();
	System.out.println(name);
}
}
	}


