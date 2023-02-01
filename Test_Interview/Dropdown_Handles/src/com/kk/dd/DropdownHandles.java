package com.kk.dd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandles {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");
		// Maximizing window
		driver.manage().window().maximize();

		Thread.sleep(3000);

		Select daySelect = new Select(driver.findElement(By.id("day")));
		List<WebElement> daysList = daySelect.getOptions();
		System.out.println("Days are are listed: ");
		for (WebElement dayOptions : daysList)
			System.out.print(dayOptions.getText() + " , ");

		Select month = new Select(driver.findElement(By.id("month")));
		List<WebElement> monthList = month.getOptions();
		System.out.println("\n\nMonths are listed: ");
		for (WebElement monOptions : monthList)
			System.out.print(monOptions.getText() + " , ");

		Select year = new Select(driver.findElement(By.id("year")));
		List<WebElement> yearList = year.getOptions();
		System.out.println("Date of birth dates are listed: ");
		for (WebElement yearOptions : yearList)
			year.selectByVisibleText("1999");
		System.out.println("\n\nSelect year: " + year.getFirstSelectedOption().getText());

		daySelect.selectByIndex(10);
		month.selectByIndex(6);

		System.out.println("My Date of Birth is : " + daySelect.getFirstSelectedOption().getText() + "-"
				+ month.getFirstSelectedOption().getText() + "-" + year.getFirstSelectedOption().getText());
		driver.quit();

	}

}
