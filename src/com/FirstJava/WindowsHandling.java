package com.FirstJava;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException, Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajayk\\eclipse-workspace\\RobotDemo\\driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver krish = new ChromeDriver(op);

		krish.get("https://www.google.com/");
		krish.manage().window().maximize();

		krish.findElement(By.xpath("//input[@title='Search']")).sendKeys("amazon");
		Robot io = new Robot();
		io.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		io.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);

		WebElement ui = krish.findElement(By.xpath("(//span[contains(text(),'Amazon ')])[1]"));
		Actions yu = new Actions(krish);
		yu.contextClick(ui).perform();
		Thread.sleep(2000);

		io.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		io.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement elect = krish.findElement(By.xpath("//h3[text()='Amazon.in']"));
		yu.contextClick(elect).perform();
		io.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		io.keyPress(KeyEvent.VK_ENTER);

		WebElement link = krish.findElement(By.linkText("Your Account"));
		yu.contextClick(link).perform();
		Thread.sleep(2000);

		io.keyPress(KeyEvent.VK_DOWN);
		io.keyPress(KeyEvent.VK_ENTER);

		WebElement prime = krish.findElement(By.linkText("Prime"));
		yu.contextClick(prime).perform();
		Thread.sleep(2000);

		io.keyPress(KeyEvent.VK_DOWN);
		io.keyPress(KeyEvent.VK_ENTER);

		String handle = krish.getWindowHandle();
		System.out.println(handle);
		String title = krish.switchTo().window(handle).getTitle();
		// System.out.println(title);
		String tr = "amazon - google search";
		System.out.println(title);
//		krish.close();
//		if (title.equalsIgnoreCase(tr)) {
//			System.out.println("test pass");
//		} else {
//			System.out.println("test fail");
//		}

		Set<String> handles = krish.getWindowHandles();
		for (String data : handles) {
			System.out.println(handles);
			Thread.sleep(2000);
			String title2 = krish.switchTo().window(data).getTitle();
			System.out.println(title2);

		}
		Set<String> handles2 = krish.getWindowHandles();
		for (String data : handles2) {
			String title3 = krish.switchTo().window(data).getTitle();
			System.out.println(handles2);

		}
		for (String data : handles) {
			if (krish.switchTo().window(data).getTitle().equals("Amazon.in: Amazon Prime")) {
				break;
			}

		}

	}

}
