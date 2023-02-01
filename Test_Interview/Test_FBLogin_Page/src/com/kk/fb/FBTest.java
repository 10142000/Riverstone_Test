package com.kk.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.id("email"));
		element1.sendKeys("userid");
		Thread.sleep(5000);
		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys("pass");
		Thread.sleep(5000);
		WebElement element3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		element3.click();
		System.out.println("Login");
		driver.close();
	}

}
