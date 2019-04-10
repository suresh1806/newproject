package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bobcat {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bobcat.com/in/en/index");
		WebElement btnClose = driver.findElement(By.xpath("//a[text()='Close']"));
		btnClose.click();
		Thread.sleep(2000);
		 WebElement w = driver.findElement(By.xpath("//ul[@class='nav navbar-nav pull-right']/li[3]"));
		w.click();
		//List<WebElement> name = driver.findElements(By.xpath("//a[contains(text(),'Compact Excavator')]]"));
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='h5 dtm-pro-grp-lst-name']"));
		for (WebElement ele: name) {
			String nam = ele.getText();
			System.out.println(nam);
		}
	}

}
