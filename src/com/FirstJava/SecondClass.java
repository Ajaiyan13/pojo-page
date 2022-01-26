package com.FirstJava;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SecondClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajayk\\eclipse-workspace\\RobotDemo\\driver\\chromedriver.exe");
		ChromeOptions oc = new ChromeOptions();
		oc.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver krish = new ChromeDriver(oc);

		krish.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		krish.manage().window().maximize();
		krish.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		//sign in//
		krish.findElement(By.id("email")).sendKeys("ajaykrish29@gmail.com");
		krish.findElement(By.id("passwd")).sendKeys("ajay@123");
		krish.findElement(By.id("SubmitLogin")).click();
		//Thread.sleep(2000);
		WebElement women = krish.findElement(By.xpath("//a[text()='Women']"));
		Actions tr = new Actions(krish);
		tr.moveToElement(women).perform();
		//Thread.sleep(2000);
		krish.findElement(By.xpath("(//a[text()='T-shirts'])[1]")).click();
		//Thread.sleep(2000);
		WebElement blue = krish.findElement(By.id("color_2"));
		JavascriptExecutor io = (JavascriptExecutor) krish;
		io.executeScript("arguments[0].click();", blue);
		krish.findElement(By.id("quantity_wanted")).sendKeys("1");
		WebElement down = krish.findElement(By.id("group_1"));
		Select re = new Select(down);
		re.selectByIndex(2);
		krish.findElement(By.name("Submit")).click();
		WebElement proceed = krish.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		io.executeScript("arguments[0].click();", proceed);
		WebElement cart = krish.findElement(By.xpath("(//a[@rel='nofollow'])[3]"));
		io.executeScript("arguments[0].click();", cart);
		WebElement shop = krish.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		io.executeScript("arguments[0].click();", shop);
		krish.findElement(By.name("processAddress")).click();
		krish.findElement(By.id("cgv")).click();
		krish.findElement(By.name("processCarrier")).click();
		krish.findElement(By.xpath("//a[@class='bankwire']")).click();
		krish.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		WebElement scroll = krish.findElement(By.xpath("//h1[text()='Order confirmation']"));
		io.executeScript("arguments[0].scrollIntoView();", scroll);
		//order completed screenshot//
		//Thread.sleep(2000);
		TakesScreenshot es = (TakesScreenshot) krish;
		File sc = es.getScreenshotAs(OutputType.FILE);
		File ko = new File("C:\\Users\\ajayk\\eclipse-workspace\\RobotDemo\\screenshot\\test.png");
		FileUtils.copyFile(sc, ko);

	}

}
