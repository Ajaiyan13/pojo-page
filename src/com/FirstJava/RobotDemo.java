package com.FirstJava;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RobotDemo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajayk\\eclipse-workspace\\RobotDemo\\driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver krish = new ChromeDriver(op);

		krish.get("https://www.google.com/");
		krish.manage().window().maximize();
		Thread.sleep(2000);
		WebElement gmail = krish.findElement(By.xpath("//a[text()='Gmail']"));
		Actions right = new Actions(krish);
		right.contextClick(gmail).perform();

		Robot io = new Robot();
		io.keyPress(KeyEvent.VK_DOWN);
		io.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		io.keyPress(KeyEvent.VK_DOWN);
		io.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		io.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		io.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	

	}

}
