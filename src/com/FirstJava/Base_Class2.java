package com.FirstJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class2 {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + ("\\driver\\chromedriver.exe"));
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + ("\\driver\\msedgedriver.exe"));
			driver = new EdgeDriver();

		} else {
			System.out.println("invalid browser");
		}
		return driver;

	}

}
