package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lifetime {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		//Thread.sleep(2000);
//WebElement w = driver.findElement(By.xpath("//a contains(@href,'Locations')[1]"));
//w.click();
		WebElement clkLoc = driver.findElement(By.xpath("//a[text()='Locations']"));
		clkLoc.click();
		Thread.sleep(2000);
List<WebElement> ele = driver.findElements(By.xpath("//div[@class='dropdown-menu']/ul[1]"));
for (WebElement we : ele) {
	String s = we.getText();
	System.out.println(s);
}

WebElement clkexp = driver.findElement(By.xpath("//a[text()='Explore']"));
clkexp.click();
Thread.sleep(2000);
List<WebElement> ele1 = driver.findElements(By.xpath("//div/ul[@class='list-unstyled dropdown-columns']/li"));
for (WebElement we1 : ele1) {
	String s1 = we1.getText();
	System.out.println(s1);
}

	}

}
