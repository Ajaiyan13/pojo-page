package com.FirstJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Demo {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajayk\\eclipse-workspace\\RobotDemo\\driver\\chromedriver.exe");
		ChromeOptions oe = new ChromeOptions();
		oe.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver krish = new ChromeDriver(oe);

		krish.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		krish.manage().window().maximize();
//		Thread.sleep(1000);
//		WebElement women = krish.findElement(By.xpath("//a[text()='Women']"));
//		Actions to = new Actions(krish);
//		to.moveToElement(women).perform();
//		Thread.sleep(2000);
//		WebElement shirt = krish.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		JavascriptExecutor tr = (JavascriptExecutor) krish;
//		tr.executeScript("arguments[0].click();", shirt);
//		Thread.sleep(2000);
//		WebElement sign = krish.findElement(By.xpath("//a[@class='login']"));
//		tr.executeScript("arguments[0].click();", sign);
//		Thread.sleep(2000);
		WebElement create = krish.findElement(By.xpath("(//input[@type='text'])[2]"));
		tr.executeScript("arguments[0].setAttribute('value','ajaykrish29@gmail.com')", create);
		Thread.sleep(2000);
		WebElement click = krish.findElement(By.xpath("//button[@name='SubmitCreate']"));
		tr.executeScript("arguments[0].click();", click);
		Thread.sleep(5000);
		WebElement radio = krish.findElement(By.name("id_gender"));
		radio.click();

		WebElement firstName = krish.findElement(By.id("customer_firstname"));
		firstName.sendKeys("Ajay");

		krish.findElement(By.id("customer_lastname")).sendKeys("jg");

		krish.findElement(By.id("passwd")).sendKeys("ajay@123");

		WebElement date = krish.findElement(By.id("days"));
		Select op = new Select(date);
		op.selectByIndex(13);
		WebElement month = krish.findElement(By.id("months"));
		Select fd = new Select(month);
		fd.selectByIndex(8);
		WebElement year = krish.findElement(By.id("years"));
		Select as = new Select(year);
		as.selectByValue("1993");
		krish.findElement(By.name("optin")).click();
		krish.findElement(By.id("company")).sendKeys("green technology");
		krish.findElement(By.id("address1")).sendKeys("24/h,sashtri nagar-600090,green technology");
		krish.findElement(By.id("address2")).sendKeys("52,besantnagr");
		krish.findElement(By.id("city")).sendKeys("chennai");
		WebElement state = krish.findElement(By.id("id_state"));
		Select ti = new Select(state);
		ti.selectByIndex(14);
		krish.findElement(By.id("postcode")).sendKeys("60601");
		krish.findElement(By.id("other")).sendKeys("good");
		krish.findElement(By.id("phone")).sendKeys("0442745682");
		krish.findElement(By.id("phone_mobile")).sendKeys("8825604801");
		krish.findElement(By.id("submitAccount")).click();
	}

}
