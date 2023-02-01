package com.kk.test;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadJSON {
	public static void main(String[] args) throws Exception {

		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("F:\\Sample\\Sample.json");
		Object obj = jsonParser.parse(reader);
		JSONArray usersList = (JSONArray) obj;
		System.out.println("Users List-> " + usersList);
		for (int i = 0; i < usersList.size(); i++) {
			JSONObject users = (JSONObject) usersList.get(i);
			JSONObject user = (JSONObject) users.get("users");
			String username = (String) user.get("username");
			String password = (String) user.get("password");

			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com//");
			driver.findElement(By.name(username)).sendKeys("kkiruba639@gmail.com");
			driver.findElement(By.name(password)).sendKeys("filmmaker");
			Thread.sleep(5000);
			WebElement element3 = driver.findElement(
					By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
			element3.click();
			System.out.println("Logged in Successfully");
			driver.close();

		}
	}

}
