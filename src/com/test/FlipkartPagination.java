package com.test;

import java.awt.RenderingHints.Key;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPagination {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			//WebDriver driver= new ChromeDriver();
		
		}
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
		gotopage(5);
			}
	private static void gotopage(int num) {
		List<WebElement> w = driver.findElements(By.xpath("//div[@class='_2zg3yZ']/nav/a"));
		for (int j = 0; j < w.size(); j++) {
			if(w.get(j).getText() .equals(num)){
				w.get(j).click();
			}
		}
	}
	
	}
	
	


